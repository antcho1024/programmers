package Lv2;

import java.util.HashMap;

public class programmers_42578 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int answer = 1;
        for(String tmp[] : clothes) hashMap.put(tmp[1],hashMap.getOrDefault(tmp[1],1)+1);
        for(int n : hashMap.values())answer = answer*n;
        return answer-1;
    }

    public static void main(String[] args){
        programmers_42578 programmers_42578 = new programmers_42578();
        String[][] a = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(programmers_42578.solution(a));
    }
}
