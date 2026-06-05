class Solution {
    public int romanToInt(String s) {
        
        int val = 0;
        for(int i=s.length()-1; i>=0; i--){
            char x = s.charAt(i);
            char y = 'Z';
            if((i+1)<s.length()){
                y = s.charAt(i+1);
            }
            if(toAdd(x,y)){
                val += getVal(x);
            }
            else{
                val -= getVal(x);
            }
        }
        return val;
    }

static int getVal(char a){
        char[] rom = {'I','V','X','L','C','D','M','Z'};
        int[] num = {1,5,10,50,100,500,1000,0};
        for(int i=0;i<rom.length;i++){
            if(a==rom[i]){
                return num[i];
            }
        }
        return 0;
    }

    static boolean toAdd(char a, char b){
      return getVal(a) >= getVal(b);
       
    }
        


}
