import java.util.*;
class matrix
{
     public static void main(String[]args)
     {
        int r1,r2,c1,c2,i,j,k,sum=0;
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        System.out.println("enter 1st row and colume:");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("enter 1st matrix:");
         for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
            a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter 2nd row and colume:");
        r2=sc.nextInt();
        c2=sc.nextInt();
         System.out.println("enter 2nd matrix:");
         for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
            b[i][j]=sc.nextInt();
            }
        }
        if(r1==r2&&c1==c2)
        {
        System.out.println("addition:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
            System.out.print(a[i][j]+b[i][j]+" ");
            }
             System.out.println();
        }
    }
    if(c1==r2)
    {
        System.out.println("multiplication:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
            int s=0;
            for(k=0;k<c1;k++)
            {
                s=s+(a[i][k]*b[k][j]);
            }
            System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    System.out.println("transpose:");
     for(i=0;i<c1;i++)
        {
            for(j=0;j<r1;j++)
            {
            System.out.print(a[j][i]+" ");
            }
             System.out.println();
        }
        System.out.println("row wise sum:");
         for(i=0;i<r1;i++)
        {
            sum=0;
            for(j=0;j<c1;j++)
            {
                sum=sum+a[i][j];
            }
         System.out.println(sum);
        }
        System.out.println("column wise sum:");
         for(j=0;j<c1;j++)
        {
            sum=0;
            for(i=0;i<r1;i++)
            {
            sum=sum+a[i][j];
            }
             System.out.println(sum);
        }
        sc.close();
     }
}
