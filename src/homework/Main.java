package homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "The weather today is great";
        String str2 = "aaaabbccccd";
        System.out.println(counting(str2));
        System.out.println(rev(str));

    }
   public static StringBuilder rev(String str){
       String[] arr = str.split(" ");
       StringBuilder result = new StringBuilder();
       for(int i = 0; i< arr.length;i++) {
           result.insert(0, arr[i] + " ");
       }
       return result;
   }

   public static StringBuilder counting(String str){
       String[] arr = str.split("");
       StringBuilder result = new StringBuilder();
       int counter = 1;
       for(int i=0;i<arr.length-1;i++){
               if (arr[i].equals(arr[i+1])) {
                   counter++;
               } else {
                   result.append(counter + arr[i]);
                   counter = 1;
               }
           }
       if(!arr[arr.length-2].equals(arr[arr.length-1])) {
           result.append(arr[arr.length - 1]);
       }
       return result;
   }
}
  /*
    Написать метод, возвращающий слова в строке в обратном порядке. Использовать StringBuilder. Слова разделяются пробелом.
Пример: "The weather today is great" -> "great is today weather The "
Write a method to reverse words in a String. Use StringBuilder

/* Есть строка, состоящая только из маленьких букв. Используя StringBuilder написать метод,подсчитывающий количество
повторений буквы и возвращающий новую строку такого вида: aaaabbccccd -> 4a2b4cd
Write a method to convert a string of lowercase letters into a string counting the number of these letters for each letter
aaaabbccccd -> 4a2b4cd Это задача со звездочкой, не обязательная
     */
