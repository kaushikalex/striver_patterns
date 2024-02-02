public class pattern6 {
    public static void main(String[] args) {
        int ct=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
                System.out.print(j+ct);
            System.out.println();
            ct++;
        }

        System.out.println();
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
                System.out.print(j+1);
            System.out.println();
        }
    }
}
