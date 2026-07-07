class Solution {
    public static int maxSubArray(int[] arr) {
        int size = arr.length;
        //base case
        if(size ==1) {
            return arr[0];
        }
        //recursive case
        int mid = size/2;
        int A_left []= new int[mid];
        int A_right[] = new int [size-mid];
        for(int i=0;i<mid;i++){
            A_left[i]=arr[i];
        }
        for(int i=mid;i<size;i++){
            A_right[i-mid]=arr[i];
        }
        int LSS = maxSubArray(A_left);
        int RSS = maxSubArray(A_right);
        //cross part calculation
        int sum=0;
        int Lmax =Integer.MIN_VALUE;
        int Rmax = Integer.MIN_VALUE;
        for(int i=mid-1; i>-1;i--){
            sum+=arr[i];
            if(sum>Lmax) Lmax = sum;
        }
        sum=0;
        for(int i=mid; i<size ;i++){
            sum+=arr[i];
            if(sum>Rmax) Rmax = sum;
        }
        int CSS = Rmax+Lmax;
        
        return Math.max(Math.max(LSS,RSS), CSS);
    }
}