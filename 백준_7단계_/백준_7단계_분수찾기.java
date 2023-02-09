package 백준_7단계_;

import java.util.Scanner;

public class 백준_7단계_분수찾기 {
   
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int line = 1;
       int save = 0;
       int X = sc.nextInt();
       
       while(true) {
    	   save = save + line;
    	   if(save >= X){
    		   if(line % 2 == 0 ){
    			   System.out.println(line - (save - X)+"/"+(save - X+1));
    			   break;
    		   }
    			   
    		   else if(line%2 == 1){
    			   int molcu =save-X+1;
    			   System.out.println(molcu+"/"+(X-save+line));
    			   break;
    		   }
    		   
    	   }
    		   line++;
       }
    sc.close();}
}
