package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int num[]={1,2,3,9,8,7,5,4,3};
        System.out.println(num.getClass().getName());

        int other[]=new int[6];

        System.arraycopy(num,4,other,2,4);

        for (int i=0; i<other.length;i++){
            System.out.println(other[i]);
        }

        int another[]= other.clone();
        for (int i=0; i<another.length;i++){
            System.out.print(another[i]+"\t");
        }

    }
}

//array-> object

//System.arraycopy(object src,int srcpros- sa kuu tk place, other, )

//clone for only one dimentional array