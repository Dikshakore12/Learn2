public class BlockScope{

    public static void main (String args[]){
        int p=10;//function scope
        {
            int s=45;//under block scope
            System.out.println(s);

        }
       
        System.out.println(p);



    }

}