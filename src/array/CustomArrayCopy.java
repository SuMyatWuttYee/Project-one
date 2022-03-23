package array;

public class CustomArrayCopy {
    public static void main(String[] args) {

        //initialize an array
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int copy[] = new int[numbers.length]; //{0,0,0,0,0,0,0,0,0}

        //before copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + "\t");

        }
        System.out.println();

        //copy
        for (int i = 0; i < copy.length; i++) {
            copy[i] = numbers[i];

        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + "\t");
        }
        System.out.println();

        int largestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]> largestNumber) {
                largestNumber = numbers[i];
            }
            //System.out.println(largestNumber); //dout shout pya
        }
        System.out.println(largestNumber);

//        int smallestNumber = 9;
//        for (int i = 0; i < numbers.length; i++) {
//            if(smallestNumber>numbers[i]);{
//                smallestNumber =numbers[i];
//            }
//        }
//        System.out.print(smallestNumber);

        //ngel sin kyee lite
        int number[]={3,5,9,7,6,2,4,8};
        int x =0;

        for (int i = 0; i < number.length; i++) {
            for(int j=i+1; j<number.length;j++){
                if(number[i]> number[j]){
                    x= number[i];
                    number[i]=number[j];
                    number[j]=x;

                }
            }

        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+"\t");

            
        }

        System.out.println();
        System.out.println(numbers[numbers.length-3]);
        System.out.println(numbers[0]);




            }


        }









// all pate chin yin ctrl+//