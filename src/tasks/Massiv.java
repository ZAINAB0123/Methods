package tasks;

public class Massiv {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] n = {1, 3, 6, 9, 0, 4};
        for (int i = 0; i < n.length; i++) {
            for (int c = i + 1; c < n.length; c++) {
                if (n[i] == n[c]) {
                    System.out.println("Повторяющийся элемент:" + n[i]);
                }    //  else {
                //    System.out.println("Нет повторяющихся элементов");
            }
        }

    }
        // Дан массив num содержащий n отличных чисел в интервале от 0 до n, 0 и n включены.
// Нужно вернуть одно единственное число в этом интервале, которое было пропущено в входном массиве
        public int missingNumber ( int[] nums) throws IllegalArgumentException {
            for (int a = 0; a <= nums.length; a++) {
                boolean isMissing = true;
                for (int i = 0; i < nums.length && isMissing; i++) {
                    if (a == nums[i]) isMissing = false;

                }
                if (isMissing) return a;
            }
            throw new IllegalArgumentException("invalid input");
        }

}