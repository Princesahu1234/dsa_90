import java.util.Scanner;

public class Day3_1 {
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
                System.out.print(matrix[i][j]+"   ");
        }
        System.out.println(" ");
       }
       int [][] transpose=new int[colmmm][row];

       for(int i=0;i<colmmm;i++)
       {
        for(int j=0;j<row;j++)
        {
            transpose[i][j]=matrix[j][i];
        }
       }
       for(int i=0;i<transpose.length;i++)
       {
        for(int j=0;j<transpose[i].length;j++)
        {
                System.out.print(transpose[i][j]+"   ");

        }
        System.out.println(" ");
       }
       


    }
}
