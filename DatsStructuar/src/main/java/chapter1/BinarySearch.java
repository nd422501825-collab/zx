package chapter1;

public class BinarySearch {

    public static void main(String[] args) {
        int numbers[] = {1, 5, 3, 7, 9, 18};
        BinarySearchM(numbers, 6);
    }

    public static void BinarySearchM(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        boolean isfound = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Target:" + target + "is found");
                isfound = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (isfound) {
            System.out.println("Target:" + target + "is found");

        } else {
            System.out.println("Target:" + target + "is not found");

        }
    }

}
