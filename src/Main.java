import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //zadacha 1

        int [] numbers = new int[]{1,2,3};

        //zadacha 1.2

       double [] drobniye =  {1.57 , 7.654 , 9.986};


        //zadacha 1.3
        int [] my = { 2,4,6};



        //zadacha 2

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(drobniye));
        System.out.println(Arrays.toString(my));

        //zadacha 3

        int [] numbers2 = new int[]{1,2,3};
        for (int i = numbers.length - 1; i >=0; i--) {
            System.out.print(numbers[i]+ ",");
           // System.out.print(numbers2[numbers2.length - 1 - i]);
        }

        System.out.println(" ");
        double [] drobniye2 =  {1.57 , 7.654 , 9.986};
        for (int w = drobniye2.length - 1; w >=0; w--) {
            System.out.print(drobniye2[w] + ",");
        }


        System.out.println(" ");
        //zadacha 4
        int [] massiv = new int[]{1,3,5};
        for (int t = 0; t < massiv.length; t++) {
            if (massiv[t] % 2==0){
               continue;
            }
            massiv[t]+=1;
        }
        System.out.println(Arrays.toString(massiv));


    }
}