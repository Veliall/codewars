package org.example.kyu6;

import static java.util.stream.IntStream.of;
public class ArithmeticProgression {
    static int findMissing(int[] numbers) {
        return (numbers[0] + numbers[numbers.length - 1]) * (numbers.length + 1) / 2 - of(numbers).sum();
    }

//    public static int findMissing(int[] numbers) {
//        boolean increase = isIncrease(numbers);
//        if (increase) {
//            return findMissingFromIncreaseProgression(numbers);
//        } else {
//            return findMissingFromDecreaseProgression(numbers);
//        }
//    }
//
//    private static int findMissingFromDecreaseProgression(int[] numbers) {
//        int progress = Integer.MIN_VALUE;
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] - numbers[i - 1] > progress) {
//                progress = numbers[i] - numbers[i - 1];
//            }
//        }
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] - numbers[i - 1] < progress) {
//                return numbers[i - 1] + progress;
//            }
//        }
//
//        return numbers[0];
//    }
//
//    private static int findMissingFromIncreaseProgression(int[] numbers) {
//        int progress = Integer.MAX_VALUE;
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] - numbers[i - 1] < progress) {
//                progress = numbers[i] - numbers[i - 1];
//            }
//        }
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] - numbers[i - 1] > progress) {
//                return numbers[i - 1] + progress;
//            }
//        }
//        return numbers[0];
//    }
//
//    private static boolean isIncrease(int[] numbers) {
//        return numbers[0] - numbers[1] <= 0;
//    }
}
