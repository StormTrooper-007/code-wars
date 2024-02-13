package org.example.kyu6;



public class Diamond {
    public String print(int n) {
        if(n%2 == 0 || n < 0 ) return null;
        int j = 0;
        StringBuilder diamond = new StringBuilder();
            for(int i=0; i<n; i++){
                if(i > (int)Math.floor((double)n/2)){
                    j+=2;
                    diamond.append(" ".repeat(j/2))
                            .append("*".repeat(n-j))
                            .append("\n");
                }else{
                    diamond.append(" ".repeat(Math.abs((n+1)/2-(1)-i)))
                            .append( "*".repeat(1+((i+1)-1)*2))
                            .append("\n");

                }
            }
        return diamond.toString();
    }
}
