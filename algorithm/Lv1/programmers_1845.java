package Lv1;

import java.util.HashSet;

public class programmers_1845 {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int num : nums){
            hs.add(num);
        }
        int answer = hs.size();
        if(answer > nums.length/2) answer = nums.length/2;
        return answer;
    }
    public static void main(String[] args){
        int[] a = {3,1,2,3};
        programmers_1845 sol = new programmers_1845();
        System.out.println(sol.solution(a));
    }
}
