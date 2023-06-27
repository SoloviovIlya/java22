import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Random;

public class java22{
    private static Scanner sc;

    public static void main(String[] args){

        try {  
            File filelog = new File("log.txt");
            FileWriter fileWriter = new FileWriter(filelog);
            int arr[] = new int[5];
            int i, j, c, temp;
            Random random = new Random();
            for(i=0; i<5; i++){
                arr[i] = random.nextInt(100) + 1;
                System.out.println(arr[i]);
        }
            for (i = arr.length - 1; i>0; i--){
                for (j = 0; j<i; j++){
                    if (arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        fileWriter.write("Переставили местами элементы " + arr[j] + " и " + arr[j+1] + "\n");
                    }
                }
            }
            fileWriter.write("Отсортированный массив:" + "\n");
            for (i = 0; i<5; i++){
                fileWriter.write(arr[i] + "\n");
            }
            fileWriter.close();
        }
        catch(Exception e){

        }
    }
}