public class pattern17 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<4;i++)
        {
            char ch='A';
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i+1;j++)
            {
                if((j<=(2*i+1)/2))
                System.out.print(ch++);
                else {
                    System.out.print(ch--);
                }
            }
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            System.out.println();

        }
    }
}
