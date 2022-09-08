     Stack<Character> stack = new Stack<>();
        for(int i =0 ; i< s.length() ; i++){
        if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){ 
            stack.push(s.charAt(i));
        }
            else if(!stack.empty() && ((s.charAt(i)=='}' && stack.peek()=='{') ||(s.charAt(i)==']' && stack.peek()=='[')|| (s.charAt(i)==')' && stack.peek()=='(' ))  ){ 
            
            stack.pop();
        }
        else{ 
            stack.push(s.charAt(i));
        }
        
        
        }
        if(stack.empty()){ 
            return true;
        }
        else{ 
            return false;
        }
       
