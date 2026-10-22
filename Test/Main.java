import java.util.*;

class Main {
    public static void main(String[] args) {
        String num = "001432219";
        int k = 3;

        System.out.println(removeKdigits(num, k));
    }

    // static String removeKDigit(String num, int k) {

    //     StringBuilder odd = new StringBuilder();

    //     for (int i = 0; i < num.length(); i += 2) {
    //         odd.append(num.charAt(i));
    //     }

    //     String removed = remove(odd.toString(), k);

    //     StringBuilder ans = new StringBuilder();
    //     int idx = 0;

    //     for (int i = 0; i < num.length(); i++) {
    //         if ((i & 1) == 0) {
    //             if (idx < removed.length()) {
    //                 ans.append(removed.charAt(idx++));
    //             }
    //         } else {
    //             ans.append(num.charAt(i));
    //         }
    //     }

    //     int p = 0;
    //     while (p < ans.length() && ans.charAt(p) == '0') {
    //         p++;
    //     }

    //     return (p == ans.length()) ? "0" : ans.substring(p);
    // }

    // static String remove(String num, int k) {

    //     if (k >= num.length()) return "";

    //     Stack<Character> st = new Stack<>();

    //     for (char c : num.toCharArray()) {

    //         while (!st.isEmpty() && k > 0 && st.peek() > c) {
    //             st.pop();
    //             k--;
    //         }

    //         st.push(c);
    //     }

    //     while (!st.isEmpty() && k > 0) {
    //         st.pop();
    //         k--;
    //     }

    //     StringBuilder s = new StringBuilder();

    //     while (!st.isEmpty()) {
    //         s.append(st.pop());
    //     }

    //     return s.reverse().toString();
    // }
    
    public static String removeKdigits(String num, int k) {

        int n = num.length();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < n; i += 2) {
            odd.append(num.charAt(i));
        }
    
        int m = odd.length();
        int keep = m - k;
    
        int count = k;
        Stack<Character> st = new Stack<>();
        for(char c : odd.toString().toCharArray()){
            while(!st.isEmpty() && k > 0 && st.peek() > c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder s = new StringBuilder();

        while(!st.isEmpty()){
            s.append(st.pop());
        }

        s.reverse();
        StringBuilder ans = new StringBuilder();
    
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                if (idx < keep) {
                    ans.append(s.charAt(idx++));
                }
            } else {
                ans.append(num.charAt(i));
            }
        }
    
        int p = 0;
        while (p < ans.length() && ans.charAt(p) == '0') {
            p++;
        }
        ans.delete(0, p);
    
        return ans.length() == 0 ? "0" : ans.toString();
    }
}