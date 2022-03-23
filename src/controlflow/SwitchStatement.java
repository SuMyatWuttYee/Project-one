package controlflow;

public class SwitchStatement {
    public static void main(String[] args) {
        int a=6;
        String day="monday";
        String str= " is weekday";

        switch (day){
            case "monday":
                System.out.println(day+str);
                System.out.println("something");
                break;
            case "tuesday":
                System.out.println(a + " is equal to 2");
                break;
            case "wednesday":
                System.out.println(a + " is equal to 3");
                break;
            case "thursday":
                System.out.println(a + " is equal to 4");
                break;
            case "friday":
                System.out.println(a + " is equal to 5");
                break;
            default:
                System.out.println("something is wrong");


        }
    }
}

//switch case
// switch(){ case 1: sout(); break;}