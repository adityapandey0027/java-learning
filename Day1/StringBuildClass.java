class StringBuildClass {

    public static void main(String [] args){

        
        StringBuilder sb = new StringBuilder("Tony Stark");
        System.out.println(sb);


        // char at index 
        System.out.println(sb.charAt(0));

       // set char at index 0
       sb.setCharAt(0, 'P');
       System.out.println(sb); 

       // inset character at particular index
       sb.insert(0, 'A');
       System.out.println(sb);

       // Delete character or substring from the particular string 
       // str.delete(startIdx, endIdx); end index is non enclusive 

       sb.delete(0, 1);
       System.out.println(sb);
        

       // append the same string without creating new string 
       // append method
       StringBuilder s = new StringBuilder("h");

       s.append("e");
       s.append("l");
       s.append("l");
       s.append("o");

       System.out.println(s);

       // length of the string 
       System.out.println(s.length());

       // reverse s string
       int i =0;
       int j = s.length()-1;

       while (i < j){
        char front = s.charAt(i);
        char back = s.charAt(j);
        s.setCharAt(i, back);
        s.setCharAt(j, front);
        i++;
        j--;
       }

       System.out.println(s);

    }
}