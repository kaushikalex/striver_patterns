public class pattern15 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++)
        {
            char ch='A';

            for(int j=0;j<5-i;j++)
                System.out.print(ch++);
            System.out.println();

        }

    }
}
