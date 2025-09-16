//APPROACH 1
// class Solution {
//     public List<Integer> replaceNonCoprimes(int[] nums) {
//       List<Integer> stack=new ArrayList<>();
//       for(int num:nums){
//         while(!stack.isEmpty() && !coprime(gcd(stack.get(stack.size()-1),num))){
//             num=lcm(stack.get(stack.size()-1),num);
//             stack.remove(stack.size()-1);
//         }
//         stack.add(num);
//       }
//       return stack;
//     }
//     public static boolean coprime(int gcd){
//         return gcd==1;
//     }
//     public static int gcd(int a,int b){
//         while(b!=0){
//             int temp=b;
//             b=a%b;
//             a=temp;
//         }
//         return a;
//     }
//     public static int lcm(int a,int b){
//         return a/gcd(a,b)*b;
//     }

// }


//Approach 2

import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && gcd(stack.peek(), num) > 1) {
                num = lcm(stack.pop(), num);
            }
            stack.push(num);
        }

        return new ArrayList<>(stack);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
