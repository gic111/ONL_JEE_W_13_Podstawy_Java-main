package pl.coderslab.arrays;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        Random random = new Random();

   int[] newRand = new int[20];
   for(int i = 0; i < newRand.length;i++){
       newRand[i] = random.nextInt(101);
   }
int min = newRand[0];
   for (int number : newRand) {
            if (min > number) {
                min = number;
            }
        }

        System.out.println(Arrays.toString(newRand));
        System.out.println("Minimum: " + min);
    }




    }

