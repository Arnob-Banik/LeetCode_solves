class Solution {
    public String longestCommonPrefix(String[] arr) {
         int min = arr[0].length();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        String r = "";
        boolean flag = true;
        int c = 0;
        while(c<min){
        for (int word = 0; word < arr.length; word++) {
            if (arr[0].charAt(c) != arr[word].charAt(c)) {
                flag = false;
                break;
            }
        }
       if (flag == true){
        r+=arr[0].charAt(c);
       }
       else{
        break;
       }
       c++;
    }
        return r;
    }
}