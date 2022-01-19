// code here
        String s2=S[0]+"";
         int N=S.length();
        for(int i=0 ; i<N ; i++){
            int asscii = (int)S.charAt(i);
            if(asscii == 32){
               s2=s2 + S.charAt(i-1);
            }
            
        }
