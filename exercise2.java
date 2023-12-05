import java.util.LinkedList;

public class exercise2 {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);

        addTwoNumbers(l1, l2);
        System.out.println(addTwoNumbers(l1,l2).toString());
    }
    //    You are given two non-empty linked lists representing two non-negative integers.
    //    The digits are stored in reverse order, and each of their nodes contains a single digit.
    //    Add the two numbers and return the sum as a linked list.
    //    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    //    Input: l1 = [2,4,3], l2 = [5,6,4]
    //    Output: [7,0,8]
    //    Explanation: 342 + 465 = 807.


    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> t = new LinkedList<Integer>();
        LinkedList<Integer> lmin = new LinkedList<Integer>();
        LinkedList<Integer> lmax = new LinkedList<Integer>();
        Integer sum;
        int min, max;

        if(l1.size()>l2.size()){
            min = l2.size();
            max = l1.size();
            lmin = (LinkedList<Integer>) l2.clone();
            lmax = (LinkedList<Integer>) l1.clone();
        }else{
            min = l1.size();
            max = l2.size();
            lmax = (LinkedList<Integer>) l2.clone();
            lmin = (LinkedList<Integer>) l1.clone();
        }

        for (int i=0;i< min;i++){
            sum = lmin.get(i) + lmax.get(i);
            if(sum > 9){
                int firstDigit = Integer.parseInt(Integer.toString(sum).substring(1));
                t.add(firstDigit);
                int nn = lmax.get(i+1) +1;
                lmax.remove(i+1);
                lmax.add(i+1, nn);
            }else {
                t.add(sum);
            }
        }

        for (int j=min;j<max;j++){
            if(lmax.get(j) > 9 ){
                int firstDigit = Integer.parseInt(Integer.toString(lmax.get(j)).substring(1));
                t.add(firstDigit);
                if(j<max-1) {
                    int nn = lmax.get(j + 1) + 1;
                    lmax.remove(j + 1);
                    lmax.add(j + 1, nn);
                }else {
                    t.add(1);
                }
            }else {
                t.add(lmax.get(j));
            }

        }
        return t;
    }
}