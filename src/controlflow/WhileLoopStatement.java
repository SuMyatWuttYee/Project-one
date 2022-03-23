package controlflow;

public class WhileLoopStatement {
    public static void main(String[] args) {
        //while //do while
        // while(conditon){}
        // do{} while();

        int a=5;
        while(a<10){
            System.out.println(a);
            a++;
        }

        do{
            System.out.print(a+"\t");
            a+=2;
        }while(a<20);

        int number= 10;
        do{
            System.out.println(number);
            number+=2;
        }while (number<7);


    }
}
// space chr chin yin -> sout mhr ln ko pyote
//                        +"\t"  -> tab khone dr