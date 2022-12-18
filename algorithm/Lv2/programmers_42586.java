package Lv2;

import java.util.*;

public class programmers_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerTmp = new ArrayList<>();
        Queue<Integer> days = new LinkedList<>();
        for(int i =0; i<speeds.length; i++){
            int tmp = (int) Math.ceil((100.0 - progresses[i])/speeds[i]);
            days.add(tmp);
        }
        int j=0;
        for(int i=0; i<speeds.length; i++){
            int cnt=1;
            Integer tmp = days.poll();
            while (true){
                if(days.isEmpty()) break;
                if(days.peek()<= tmp){
                    cnt++;
                    i++;
                    days.poll();
                }
                else break;
            }
            answerTmp.add(cnt);
            if(days.isEmpty()) break;
        }

        int[] answer = new int[answerTmp.size()];
        for(int i =0; i<answerTmp.size(); i++){
            answer[i] = answerTmp.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        programmers_42586 programmers42586 = new programmers_42586();
        int[] a = {93, 30, 55};
        int[] b = {1, 30, 5};

        programmers42586.solution(a,b);

    }
}
