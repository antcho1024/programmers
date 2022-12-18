package Lv2;

import java.util.Stack;

public class programmers_12909 {
    boolean solution(String s) {
        Stack<Integer> tmp = new Stack<>();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='(') tmp.push(0);
            else{
                if(tmp.isEmpty()) return false;
                tmp.pop();
            }
        }
        return tmp.isEmpty();
    }
}
