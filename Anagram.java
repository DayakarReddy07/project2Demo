// Add new feature
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dayak
 */
public class Anagram {
    public static boolean isAnagram(String a, String b) {

        // Your code here
        if(a.length() != b.length()){
            return false;
        }
        
        char A[] = a.toCharArray();
        char B[] = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "race";
        String b = "care";
        System.out.println(isAnagram(a, b));
    }
}

