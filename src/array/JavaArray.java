package array;

public class JavaArray {
    public static void main(String[] args) {
        int a= 67;
        String name="SMWY";

        int numbers[]= {23,334,456,988,76};  //initiatize
        String names[]= new String[]{"Mh","Helo","Jo'","ii","june","aug"};

        System.out.println(numbers[4]);

        numbers[2] = 798;
        System.out.println(numbers[2]);

        System.out.println(names[5]);



        String cars []= new String[4];
        cars[0]= "mercedes";
        cars[2]= "nison";
        cars[3]="toyota";

        System.out.println(cars[1]);

        //count
        System.out.println(names.length);
        System.out.println(cars.length);

        //correction
        names[2]="page";
        System.out.println(names[2]);

        System.out.println(names);
        System.out.println(numbers);

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+ "\t");
        }
        for(int i=1; i<names.length; i++){
            System.out.print(names[i]+"\t");
        }
        for (int l=2; l<cars.length; l++){
            System.out.print(cars[l]+"\t");
        }
        System.out.println();

        for (String n:names){
            System.out.print(n+"\t");
            
        }
        System.out.println();
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+"\t");

        }



    }




}


//Array int numbers[]={};
//      String names[]=new String[];
// sout[];  -> [] ka a htl ka ans twy

// array khn no twy pyin lo ma ya
// nout array ta khn htet htae lo ma ya

//for each loop ka koh lote chin ta lo ma ya

//forr -reverse

