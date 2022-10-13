public class AbcPattern {

        public static void main(String[] args)
        {
            int p=65, d=2;
            for(int i=1;i<=4;i++)
            {
                int K=p;
                for(int j=1;j<=i;j++)
                {
                    System.out.print((char)K+"\t");
                    K--;
                }
                p=p+d;
                d++;
                System.out.println();
            }
    }

}
