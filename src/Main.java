public class Main {
    public static void main(String[] args) {
        //hw1
        int values[]={2,5,-3,11,193};
        for(int v : values)
            System.out.println(v);
        int sum=0;
        for(int i=0; i<values.length; i++)
        {
            sum=sum+values[i];
        }
        System.out.println(sum);

        //hw3
        int[] Values={-3, 2, 5, 4, 7};
        int N=1;
        boolean RESULT=true;

        while(RESULT=true && N<5)
        {
            if(Values[N]<Values[N-1])
                RESULT=false;
            N++;
        }
        System.out.println(RESULT);


    }
}
