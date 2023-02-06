import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static int [] v=new int[4];

    public static void main (String[] args) {

        System.out.println("Введите массив чисел");
        Scanner S=new Scanner(System.in);

       for(int i=0;i< v.length;i++)
            v[i]=S.nextInt();
        int min = Arrays.stream(v)
                .min()
                .getAsInt();
        int minn = Arrays.stream(v)
                .sum();
        System.out.println(minn+"  Общая");
        System.out.println(min+"Min");

        Thread thread = new HelloWorld.MyThread();
        thread.start();
    }
    public class HelloWorld{
        public static class MyThread extends Thread {
            @Override
            public void run() {
                int max = Arrays.stream(v)
                        .max()
                        .getAsInt();
                System.out.println(max+"Min");
                int sum=0;
                for(int i=0; i<v.length;i++){
                    sum = sum+v[i];
                }System.out.println(sum/2+"Срелняя");
            }
        }
    }
}