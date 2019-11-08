package SomeMoreJavaProgram;

public class DuplicateWordsOcc {	
	    int i,j,k;
	    void show(String s,char ch,int n){
	        for(i=0;i<s.indexOf(ch);i++){
	          if(s.charAt(i)!=ch){
	            System.out.println(ch+" : "+n);
	          }
	        }
	    }

	    public static void main(String args[]){
	        DuplicateWordsOcc ob1 =new DuplicateWordsOcc();
	     
	        String s1 = "Dheeraj Pratap Singh";
	        String s2 = new String(s1);
	            int i,j,k;
	            for(i=0;i<s1.length();i++){
	                    int count=1;
	            for(j=i+1;j<s1.length();j++){
	                if(s1.charAt(i)==s1.charAt(j)){
	                    count++;
	                    ob1.show(s1,s1.charAt(i),count);
	                }
	            }
	        }
	    }

}
