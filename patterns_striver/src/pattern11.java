public class pattern11 {
    public static void main(String[] args) {
        int a=1;
        for(int i=0;i<5;i++)
        {
            if(i%2==0)
                a=1;
            else a=0;
            for(int j=0;j<i+1;j++)
            {
                System.out.print(a);
                a=1-a;

            }
            System.out.println();


        }
    }
}
