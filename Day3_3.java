import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args) {
        
       Scanner in=new Scanner(System.in);
       System.out.println("enter no of rows ");
       int row= in.nextInt();
       System.out.println("enter no of column");
       int colmmm=in.nextInt();
       int[][] matrix=new int[row][colmmm];
        int a=row*colmmm;

       int temp=0;
       if(row==colmmm){

       for(int i=0;i<row;i++)
       {
        for(int j=0;j<colmmm;j++)
        {
            matrix[i][j]=in.nextInt();
        }
       }
       for(int i=0;i<matrix.length;i++)
       {
        for(int j=0;j<matrix[i].length;j++)
        {
                System.out.print(matrix[i][j]+"   ");
                if(0==0){}

        }
        System.out.println(" ");
       }
    }
    else;
    {
        System.out.println("not ssemetric");
    }
    }
}