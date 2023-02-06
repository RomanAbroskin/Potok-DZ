package two;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class two  {
         public static String put;
    public static void main (String[] args) throws IOException {
        System.out.println("ввод");
        Scanner S = new Scanner(System.in);
        put = S.next();

        try {
            FileInputStream inputStream = new FileInputStream(put);
            int i;
            while ((i = inputStream.read()) != -1) {

                if ((int) i % 2 == 0) {
                    FileOutputStream outputStream = new FileOutputStream("b", true);
                    outputStream.write(i);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("четные");
        FileInputStream inputStreamm = new FileInputStream("b");
       int i;
        while ((i=inputStreamm.read())!=-1){
            System.out.print((char) i);
       }

        System.out.println("\nнечетные");
        Thread thread = new HelloWorld.MyThread();
        thread.start();
        FileInputStream inputStreammm = new FileInputStream("bb");
        int c;
        while ((c=inputStreammm.read())!=-1){
            System.out.print((char)c);
        }
    }
        public class HelloWorld{
        public static   class MyThread extends Thread {
            @Override
            public void run() {

                FileInputStream inputStream= null;
                try {
                    inputStream = new FileInputStream(put);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

                int i;

                while(true){
                    try {
                        if ((i = inputStream.read()) == -1) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    if ((int)i%2!=0){
                        FileOutputStream outputStream= null;

                        try {
                            outputStream = new FileOutputStream("bb",true);
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            outputStream.write(i);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

            }

            }
        }

    }

