import java.util.Scanner;

public class ArraysV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[length];
        
        for (int i = 0; i < array.length; i++){
         System.out.print("Enter element " + (i + 1) + ": ");
         array[i] = scanner.nextLine();
         }
         
         scanner.close();
         
         System.out.print("Your array: [");
         for (int i = 0;i <array.length;i++) {
            System.out.print(array[i]);
            if (i<array.length-1) System.out.print (", ");
            }
            System.out.println("]");
    }       
}
