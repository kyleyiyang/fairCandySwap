class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ans=new int[2];
        int sum = 0,sum_a = 0,sum_b = 0;
        //Arrays.sort(A);
        //Arrays.sort(B);
        for (int a:A) {
            sum_a+=a;
        }
        for (int b:B) {
            sum_b+=b;
        }
        sum = sum_a+sum_b;
        //System.out.println("sum_a="+sum_a+"; sum_b="+sum_b);
        if (A.length<=B.length) {
            for (int i=A.length-1;i>=0;i--) {
                    int z = sum/2-sum_a+A[i];
                    if (IntStream.of(B).anyMatch(x -> x == z)) {
                        ans[0]=A[i];
                        ans[1]=z;
                        return ans;
                    }
                }
        } else {
            for (int i=B.length-1;i>=0;i--) {
                    int z = sum/2-sum_b+B[i];
                    if (IntStream.of(A).anyMatch(x -> x == z)) {
                        ans[0]=z;
                        ans[1]=B[i];
                        return ans;
                    }
                }
        }
        /*if (sum_a==sum_b) {
            for (int a:A) {
                if (IntStream.of(B).anyMatch(x -> x == a)) {
                    ans[0] = a;
                    ans[1] = a;
                }
            }
        } else if (sum_a>sum_b) {
            for (int a=A.length-1;a>=0;i--) {
                int z = sum/2-sum_a+A[i];
                if (IntStream.of(B).anyMatch(x -> x == z)) {
                    ans[0]=A[i];
                    ans[1]=z;
                }
            }
            //ans[0]=A[A.length-1];
            //ans[1]=sum/2-sum_a+ans[0];
        } else {
            ans[1]=B[B.length-1];
            ans[0]=sum/2-sum_b+ans[1];
        }*/
        return ans;
    }
}
