package array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //int numbers[][]= new int [4][5];

        int numbers[][]=new int [3][];
        numbers[0]= new int[5];
        numbers[1]=new int[2];


        int dNumbers[][]= {
                {1,2,3,4,5,6,7,8},
                {5,4,3,2,1},
                {1,1,1,1,1000},
                {5,5,3,3,4}
        };
        System.out.println(dNumbers[2][4]);
        //correction
        dNumbers[3][2]=7;
        System.out.println(dNumbers[3][2]);

        System.out.println(dNumbers.length);  //array a khn

        System.out.println(dNumbers[0].length);

        for(int row =0; row < dNumbers.length;row++){
            for(int col=0; col<dNumbers[row].length;col++){
                System.out.print(dNumbers[row][col]+"\t");
            }
            System.out.println();
        }
        for (int[]number:dNumbers) {
            for(int n:number){
                System.out.print(n+"\t");
            }

        }



    }
}
//jagged array