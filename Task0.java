import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task0 {

    //Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    public static void main(String[] args) {
        Task0 hw = new Task0();
        hw.multiple(new ArrayDeque<>(Arrays.asList(5,2)), new ArrayDeque<>(Arrays.asList(4)));
        // result [0,0,1]
        hw.sum(new ArrayDeque<>(Arrays.asList(5,-2)), new ArrayDeque<>(Arrays.asList(5)));
        // result [0,-2]
        System.out.println(sum(hw.multiple, hw.sum));
    }

    // Умножьте два числа и верните произведение в виде связанного списка.
    public Deque<Integer> multiple(Deque<Integer> d1, Deque<Integer> d2){


        return new ArrayDeque<>();
    }

    // Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными

        public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
            return toDeque(toInt(d1) + toInt(d2));
        }
        public static int toInt(Deque<Integer> deq) {
            int num = 0;
            int i = 0;
            while(deq.size() > 0) {
                num += deq.removeFirst() * Math.pow(10, i++);
            }
            return num;
        }

        public static ArrayDeque<Integer> toDeque(int num) {
            ArrayDeque<Integer> rezDeq = new ArrayDeque<>();
            while (num > 0) {
                rezDeq.add(num % 10);
                num /= 10;
            }
            return rezDeq;
    }
}

