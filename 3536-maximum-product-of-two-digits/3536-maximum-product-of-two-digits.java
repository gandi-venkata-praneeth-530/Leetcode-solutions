class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        int[] res = new int[ch.length];
        for(int i=0;i<ch.length;i++){
            int num = ch[i] - '0';
            res[i]=num;
        }
        int prod = 0;
        Arrays.sort(res);
        int currProd = 0;
        // for(int i=res.length-1;i>=0;i++){
        //     currProd =Math.max(i*(i-1),i*(i-2));
        // }
        // int i=res.length-1;
        // while(i>=0){
        //     prod = res[i]*res[i-1];
        //     if((i-1)!=0){
        //         i--;
        //     }
        //     currProd = Math.max(prod,currProd);
        // }
        // return currProd;
        int index = res.length;
        return res[index-1]*res[index-2];
    }
}