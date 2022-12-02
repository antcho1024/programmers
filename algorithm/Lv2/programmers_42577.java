package Lv2;

import java.util.*;
import java.util.stream.Stream;

public class programmers_42577 {
    // 반복문으로만 풀기 - 효율성테스트 3,4 시간초과
    // 사전순으로 정렬 후 다시 해보기
    public boolean solution1(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0; i< phone_book.length-1; i++){
            int len = phone_book[i].length();
            if(len<phone_book[i+1].length()){
                if(phone_book[i+1].substring(0,len).equals(phone_book[i])){
                    return false;
                }
            }
        }
        return true;
    }

    // 해쉬 맵 사용
    public boolean solution2(String[] phone_book) {
        HashMap<String, Integer> map  = new HashMap<>();
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length; i++){
            map .put(phone_book[i],i);
        }

        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] a = {"119", "97674223", "1195524421"};
        programmers_42577 sol = new programmers_42577();
        System.out.println(sol.solution2(a));
    }
}
