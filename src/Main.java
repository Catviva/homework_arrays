import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Exercise 1,2

        int [] z = new int [3];
        z[0] = 1;
        z[1] = 2;
        z[2] = 3;

        int [] size = {1, 2, 3};
        for (int i = 0; i < size.length; i++){
            if (i != size.length - 1)
            System.out.print(size[i] + ", ");
            else
                System.out.print(size[i]);
        }

        System.out.println();
        double [] weight = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight.length; i++) {
            if (i != weight.length - 1)
            System.out.print(weight[i] + ", ");
            else
                System.out.print(weight[i]);
        }

        System.out.println();
        int [] math = {2+3, 7*3, 5-3, 8/4};
        for (int i = 0; i < math.length; i++) {
            if (i != math.length - 1)
            System.out.print(math[i] + ", ");
            else
                System.out.print(math[i]);
        }


        // Exercise 3

        System.out.println();
        int [] point = new int [] {1, 2, 3};
        for (int i = point.length - 1; i >= 0; i--){
            if (i != point.length - 1)
            System.out.print(point[i] + ",");
            else
                System.out.print(point[i]);
        }

        System.out.println();
        double [] amount = {1.57, 7.654, 9.986};
        for (int i = amount.length - 1; i >= 0; i--)
        {
            if (i != amount.length -1)
            System.out.print(amount[i] + ",");
            else
                System.out.print(amount[i]);
        }

        System.out.println();
        int [] result = {2+3, 7*3, 5-3, 8/4};
        for (int i = result.length - 1; i >= 0; i--) {
            if (i != result.length - 1)
            System.out.print(result[i] + ",");
            else
                System.out.print(result[i]);
        }

        // Exercise 4

        System.out.println();
        int [] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++){
            if (number[i] % 2 != 0){

                number[i]++;
            }
            if(i != number.length - 1)
                System.out.print(number[i] + ",");
            else
                System.out.print(number[i]);



            }


        }

    }