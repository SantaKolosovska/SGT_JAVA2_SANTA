package lesson4_homework;

import java.util.*;

public class GroupTask_3Largest {

    public static void main(String[] args) {

        int[] nums1 = {1, -99, 100, 66, -5, 7};
        int[] nums2 = {-1, -100, -100, -66, -8, -11, 0, -11, -100};
        int[] nums3 = {1, 1, 100, 1, 100};
        int[] nums4 = {97, -73, 99, 31, -59, -1, 11, 127, -2235, -9, 213, 9999, 31, -10000};
        int[] nums5 = {1, -99, 100, 66, -5, 7, 245, 785, -53, 542, -981, -21, 690, 87, -7654};

        System.out.println("Array1: ");
        findLargestThree(nums1);
        System.out.println("Array2: ");
        findLargestThree(nums2);
        System.out.println("Array3: ");
        findLargestThree(nums3);
        System.out.println("Array4: ");
        findLargestThree(nums4);
        System.out.println("Array5: ");
        findLargestThree(nums5);

    }

    // method to find the largest three distinct numbers of an array
    static void findLargestThree(int[] array) {
        Set<Integer> set = new HashSet<Integer>();  //getting rid of duplicates wih a hashset
        for (Integer numb : array) {
            set.add(numb);
        }

        ArrayList<Integer> arrayList = new ArrayList<>(set);    //creating an arraylist out of hashset
        Collections.sort(arrayList);    //sorting the arraylist in ascending order

        System.out.println("First larger distinct number: " + arrayList.get(arrayList.size()-1));
        System.out.println("Second largest distinct number: " + arrayList.get(arrayList.size()-2));

        if (arrayList.size() < 3) {
            System.out.println("The third distinct maximum does not exist: " + arrayList.get(arrayList.size() - 1));
        } else {
            System.out.println("Third largest distinct number: " + arrayList.get(arrayList.size() - 3));
        }
    }

//    // method 2
//    static void findLargestThree(int[] array) {
//        Arrays.sort(array);
//
//        int number = array[array.length - 1];
//        int number1 = number;
//        System.out.println("The first distinct maximum is " + number);
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] < number) {
//                System.out.println("The second distinct number is " + array[i]);
//                number = array[i];
//                break;
//            }
//        }
//
//        int counter = 0;
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] < number) {
//                System.out.println("The third distinct number is " + array[i]);
//                counter++;
//                break;
//            }
//        }
//
//        if (counter==0) {
//            System.out.println("The third distinct maximum does not exist: " + number1);
//        }
//    }


//    // method 3
//    static void findLargestThree(int[] array) {
//        Arrays.sort(array);
//
//        int number = array[array.length - 1];
//        int number1 = number;
//        int counter = 0;
//        System.out.println("The first distinct maximum is " + number);
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] < number) {
//                System.out.println("The second distinct number is " + array[i]);
//                number = array[i];
//                if (number == array[i]) {
//                    for (int j = array.length - 1; j >= 0; j--) {
//                        if (array[j] < number) {
//                            System.out.println("The third distinct number is " + array[j]);
//                            counter++;
//                            break;
//                        }
//                    }
//                }
//                break;
//            }
//        }
//
//        if (counter == 0) {
//            System.out.println("The third distinct maximum does not exist: " + number1);
//        }
//    }

}
