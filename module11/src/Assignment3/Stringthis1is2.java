package Assignment3;

public class Stringthis1is2 {

	public static void main(String[] args) {
         String s="this is nice";
         String[]split= s.split(" ");
         String result="";
            int count=1;
            for(int i=0;i<split.length;i++){
            	result+= (split[i]+count+ " ");
            	count++;
            }
            System.out.println(result);
            }
	}


