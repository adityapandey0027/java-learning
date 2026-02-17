import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // System.out.println("Hello");

        // fist method
        int[] arr;
        arr = new int[5];

        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;

        // f=Normal perint
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println();

        // for loop
        for (int i = 0; i < 5; i++) {
            // System.out.println(arr[i]);
        }

        // Second method - dynamic value
        int[] newArr = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        // null initilization
        // char [] chara = new char[3];
        // System.out.println(chara[0]);

        // quetion1 on java - length must be greater than one and first and last element
        // should be same
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("Enter size : ");
        size = sc.nextInt();

        int[] q = new int[size];

        System.out.println("\nEnter element");
        for (int i = 0; i < size; i++) {
            q[i] = sc.nextInt();
        }

        // if (q.length >= 1 && (q[0] == q[q.length - 1])) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }

        // q2 

        if(q.length >= 1 && ( q[0] == 6 || q[q.length- 1] == 6)){
            System.out.print("True");
        } else{
            System.out.println("False");
        }


        sc.close();

    }
}