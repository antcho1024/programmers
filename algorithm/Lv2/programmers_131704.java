package Lv2;

import java.util.Stack;

public class programmers_131704 {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> semi = new Stack<>();
        Stack<Integer> seque = new Stack<>();

        for(int i = order.length; i>0; i--) seque.push(i);

        int i=0;
        while (true){
            if(seque.isEmpty()&&semi.isEmpty()) break;

            if(!semi.isEmpty()){
                if(order[i]==semi.peek()) {
                    semi.pop();
                    answer++;
                    i++;
                }
                else{
                    if(seque.isEmpty()) break;
                }
            }

            if(!seque.isEmpty()){
                if(order[i]!=seque.peek()){
                    semi.push(seque.pop());
                }
                else{
                    seque.pop();
                    answer++;
                    i++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        programmers_131704 programmers131704 = new programmers_131704();
        int[] a = {5,4,3,2,1};
        System.out.println(programmers131704.solution(a));
    }
}
