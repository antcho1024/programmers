package Lv1;

import java.util.HashMap;

public class programmers_42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for(String person : participant){
            hashMap.put(person,hashMap.getOrDefault(person,0)+1);
        }
        for(String person : completion){
            hashMap.put(person, hashMap.get(person)-1);
        }
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        programmers_42576 sol = new programmers_42576();
        System.out.println(sol.solution(a,b));
    }
}
