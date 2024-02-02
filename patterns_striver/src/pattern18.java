public class pattern18 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++)
        {
            char ch='E';
            int k=i;
            while(k>0) {
                ch--;
                k--;
            }
            for(int j=0;j<=i;j++)
                System.out.print(ch++);
            System.out.println();
            k=i;
        }
    }
}
