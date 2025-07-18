public class Day3_6 {
    public static void main(String[] args) {
        String s="helloohe";
        String result="";
        String temp="";
        
        for(int i=0;i<s.length();i++)
        {
         char ch=s.charAt(i);
         if(result.indexOf(ch)==-1)
         {

            result+=ch;
         }
         else{
            temp+=ch;
            
         }
        
        }
        System.out.println(result);
        System.out.println(temp);
    }
}
