  Stack<Character> stk = new Stack<>();
        int len = num.length();
        if(len==k){
            return "0";
        }
        for(int i =0 ; i<len ; i++){
           // char ch = num.charAt(i);
             while(k>0 && !stk.isEmpty() && stk.peek()>num.charAt(i)){
                stk.pop();
                k--;
            }
             stk.push(num.charAt(i));
        }
        while(k>0){
            stk.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
         while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
