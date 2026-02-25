import java.util.Scanner;

;public class Strings {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

       // String s = sc.nextLine();
        
       // System.out.println("Your name is "+ s);


       // Method in string 

       // i. concatination of the string
        String firstName = "aditya";
        String lastName = "Pandey";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);

        // ii. Length method 
        System.out.println(firstName.length());

        // iii. charAt 
        
        for(int i =0; i<firstName.length(); i++){
            System.err.println(fullName.charAt(i));
        }

        // iv. compare

        String s1 = "C";
        String s2 = "B";

        // s1 > s2 : +v value
        // s1 == s2 : 0
        // s1 < s2 : -v value

        if(s1.compareTo(s2) > 0){
            System.out.println("S1 is greater than S2");
        } else if(s1.compareTo(s2) == 0){
            System.out.println("S1 is equal to the s2");
        } else{
            System.out.println("S1 is lesser than s2");
        }

        System.out.println("------------");

        // SubString -> string.substring(beg index, end index);

        String sentence = "My name is Aditya";
        String subStr = sentence.substring(2, 10);
        System.out.println(subStr);

        // String are Immutable - in java 

        // 1 take an array of string input from the user & find the cumulative ( combined ) length of all those string 

        String []arr = {"Asdfg", "sdfg", "efg"};

        int totalLenght = 0;
        for(int i=0; i<arr.length; i++){
            totalLenght += arr[i].length();
        }

        System.out.println("Cumulitive sum of the length is " + totalLenght);


        // 2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        String s3 = "Asdfetefie";
        String result = "";
        for(int i=0; i<s3.length(); i++){
            if(s3.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += s3.charAt(i);
            }
        }
        System.out.println(result);

        sc.close();
    }
}
