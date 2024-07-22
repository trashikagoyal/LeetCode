class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length()-1;){
            char c=command.charAt(i);
            char cc=command.charAt(i+1);
            System.out.println(i+" "+c+" "+cc);
            if(c=='G'){
                sb.append("G");
                i++;
            }
            else if(c=='('&& cc==')'){
                sb.append("o");
                i+=2;
            }
            else if(c=='(' && cc=='a'){
                sb.append("al");
                i+=4;
            }
            else {
                i++;
            }
        }
        if(command.charAt(command.length()-1)!=')'){
            sb.append(command.charAt(command.length()-1));
        }
        return sb.toString();
    }
}