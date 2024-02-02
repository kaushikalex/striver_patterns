public class pattern12 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
                System.out.print(j);
            for(int j=0;j<2*(n-i)-2;j++)
                System.out.print(" ");
            for(int j=i+1;j>=1;j--)
                System.out.print(j);
            System.out.println();

        }
    }
}
