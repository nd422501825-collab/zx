package chapter2.SingleDimentionalArray;

import java.util.Scanner;

public class SingleDimentionalArray {

    public static void main(String[] args) {
        int numbers[] = new int[10];//عرفنا مصفوفة باتجاه واحد الحجم الها 10 عناصر باتجاه واحد 
        int size = 0;
        Scanner in = new Scanner(System.in);
        boolean userSelect = true;
        while (userSelect) {
            System.out.println("--------Array Operation------");
            System.out.println("1.add");
            System.out.println("2.Display");
            System.out.println("3.update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.print("Enter Selected Value:");

            int userSelectList = in.nextInt();
            switch (userSelectList) {
                case 1:
                    System.out.println("Added Succesfuly...");
                    if (size < numbers.length) {
                        System.out.println("Enter number to add:");
                        int number = in.nextInt();
                        numbers[size] = number;
                        size++;
                        System.out.println("Number Added Succesfuly...");
                    } else {
                        System.out.println("Array is Full ");
                    }
                    break;
                case 2:
                    System.out.println("...Numbers in Array...");

                    for (int i = 0; i < size; i++) {
                        System.out.println("number" + i + "-" + numbers);
                    }
                    break;
                case 3:
                    System.out.println("Enter Index of Element:");
                    int index = in.nextInt();
                    if (index >= 0 && index < size) {
                        System.out.println("Enter New value of Element:");
                        int newValue = in.nextInt();
                        numbers[index] = newValue;
                        System.out.println("Update Succesfuly...");
                    } else {
                        System.out.println("Invalid index !!!");
                    }
                    break;
                case 4:
                    System.out.println("delete Succesfuly...");
                    break;
                case 5:
                    userSelect = false;
                    break;

            }
        }
    }

}
