import java.util.Scanner;

public class Day3_2 {
    public static void main(String[] args) {
        
       Scanner in=new Scanner(System.in);
       System.out.println("enter no of rows ");
       int row= in.nextInt();
       System.out.println("enter no of column");
       int colmmm=in.nextInt();
       int[][] matrix=new int[row][colmmm];


       int temp=0;

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
            if (temp<matrix[i][j]){
                temp=matrix[i][j];
            }
                System.out.print(matrix[i][j]+"   ");
        }
        System.out.println(" ");
       }
       System.out.println("  ");
       System.out.println(temp);
       
       
       


    }
}
