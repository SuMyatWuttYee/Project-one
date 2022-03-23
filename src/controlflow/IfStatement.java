package controlflow;

public class IfStatement {

    public static void main(String[] args) {
        //syntax => dataType variableName = value;

        //decision making statement
        //loop statement
        //jump statement

        //decision making statement
        //if & if else & if  eles if  else
        //switch

        //if(condition){} => if true, do sth

        //boolean => true or false
        int a= 10;
        if (a>9){
            System.out.println(a+ " is greater than 9");
        }
        if (a<9){
            System.out.println(a<9);
        }

        int b=1;
        int c=9;
        if (b>c){
            System.out.println(b +" is greater than"+ c);
        }

        if (b>c){
            System.out.println((b>c) + " one statement");
        }
        else{
            System.out.println((b>c) + " two statement");
        }

        int x=90;
        if(x <40){
            System.out.println("fail");
        }
        else if(x>=40 && x<=80){
            System.out.println("pass");
        }
        else{
            System.out.println("D");
        }


    }
}
