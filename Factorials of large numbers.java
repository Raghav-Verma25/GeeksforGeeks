class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        java.math.BigInteger abc = new java.math.BigInteger("1");
        for(int i =1 ; i<=N ; i++){
         abc =  abc.multiply(java.math.BigInteger.valueOf(i));
        }
        ArrayList<Integer> list = new ArrayList<>();
        String str = abc.toString();
        for(int i =0 ; i< str.length(); i++){
           int num = Integer.parseInt(str.charAt(i)+"");
            list.add(num);
        }
        return list;
    }
}
