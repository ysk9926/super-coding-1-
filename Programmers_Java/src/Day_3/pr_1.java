package Day_3;

import java.util.Scanner;

public class pr_1 {
    public String solution(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for(int i = 0;i<str1.length();i++){
            result.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return result.toString();
    }
}