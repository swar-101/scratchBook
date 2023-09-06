package perfectNumbers;

import java.util.*;
/*
Given an integer A, you have to find the Ath Perfect Number.
A Perfect Number has the following properties:
    - It comprises only 1 and 2.
    - The number of digits in a Perfect Number is even.
    - It is a palindrome number.

For example, 11, 22, 112211 are Perfect Numbers, where 123, 121, 782, 1 are not.

Problem Constraint:
    1 <= A <= 100000

Input Format:
    The only argument given is an integer A.

Output Format:
    Return a string that denotes the Ath Perfect Number.
 */

/*
   Q: 1, 2
   Q:    2, 11, 12,
   Q:       11, 12, 21, 22
   Q:           12, 21, 22, 111, 112
   Q:               21, 22, 111, 112, 121, 122
   Q:                   22, 111, 112, 121, 122, 221, 222
      1, 2,  3,  4,  5,  6,   7,    8,  9

   x = 1
    a = 11
    b = 12
   x = 2
    a = 21
    b = 22
   x = 11
    a = 111
    b = 112
   x = 12
    a = 121
    b = 122
   x = 21
    a = 211
    b = 212
   x = 22
    a = 221
    b = 222
 */
public class Solution {

    public String solve(int A) {
        if(A == 1) {
            return "11";
        }
        if(A == 2) {
            return "22";
        }
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        int count = 2;

        while(count < A) {
            String x = (String) q.remove();
            String a = x + "1";
            if (count + 1 == A) {
                StringBuilder sb = new StringBuilder(a);
                return a + sb.reverse();
            }
            String b = x + "2";
            if (count + 2 == A) {
                StringBuilder sb = new StringBuilder(b);
                return b + sb.reverse();
            }

            q.add(a);
            q.add(b);
            count = count + 2;
        }
        return null;
    }

/*
    1  3  -1  -3  5  3  6  7
 */


    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        for(int i = 0; i <  A.size(); i++) {
            System.out.println(A.get(i));

            Deque<Integer> dq = new ArrayDeque<>();
            if (dq.size() == 0) {
                dq.offerLast(A.get(i));
            }
            if(dq.peek() < A.get(i)) {
                dq.offerFirst(A.get(i));
            }
            System.out.println("Peek : " + A.get(i));
        }
        return null;
    }
}

