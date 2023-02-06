package three;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class three {
    public static void main(String[] args) throws IOException {
        Scanner S=new Scanner(System.in);
        System.out.println("Введите слово");
        String slovo=S.next();
        System.out.println("Введите путь к файлу");
        String put=S.next();
      List<String>list=new ArrayList<>();
      try (FileInputStream inputStreamm = new FileInputStream(put);
           Scanner scanner=new Scanner(inputStreamm))
      { while (scanner.hasNextLine()){
          list.add(scanner.next());
      }
       List<String>vivod= list.stream()
               .filter(a -> a.equals(slovo)).toList();
          System.out.println(vivod+"найденное слово в файле");

      } catch (FileNotFoundException e) {
          throw new RuntimeException(e);
      }


    }
}
