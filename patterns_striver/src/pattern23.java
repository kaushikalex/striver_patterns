import java.util.*;
public class pattern23 {
    public static void main(String[] args) {
        char[][] a= new char[7][7];
        String s="PROGRAM";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i==j)
                    a[i][j]=s.charAt(j);
                else if(i+j==7-1)
                    a[i][j]=s.charAt(j);
                else
                    a[i][j]=' ';
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
