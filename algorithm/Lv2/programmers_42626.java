package Lv2;

import java.util.PriorityQueue;
import java.util.Queue;

public class programmers_42626 {
    public int solution(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        int answer = 0;
        for (int i : scoville) queue.add(i);
        while(queue.size()>1&&queue.peek()<K){
            answer++;
            int a = queue.poll();
            int b = queue.poll();
            queue.add(a + b * 2);
        }
        if(!queue.isEmpty()&&queue.peek()<K) answer = -1;
        return answer;
    }

    public static void main(String[] args){
        programmers_42626 test = new programmers_42626();
        System.out.println(test.solution(new int[]{1, 2, 3, 9, 10, 12},7));
    }
}
