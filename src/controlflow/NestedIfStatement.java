package controlflow;

public class NestedIfStatement {
    public static void main(String[] args) {

        int a = 45;
        if (a > 40) {
            int b = 10;
            if (b == a) {
                System.out.println("a is equal to b and a is greater than 40");
            }else if (b==2){
                System.out.println("b is equal to 2");
            }else{
                System.out.println("b is not equal to 1 and 2");
            }


        }else {
            System.out.println("a is less than 40");
        }

        int x=65;
        if (x>40){
            int y=10;
            switch (y){
                case 1:
                    System.out.println("y is equal to 10");
            }
        }else{
            System.out.println("x is less than 40");
        }

        //while

//        int i=1;
//        while(a<10){
//            if(){
//
//            }
//        }

    }
}
//Nested =>  ,, => ,,,

//if() if() {} else{}