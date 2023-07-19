// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class EvenNumbersThread extends Thread {

    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
       EvenNumbersThread evenNumbersThread = new EvenNumbersThread();
       evenNumbersThread.start();
    }
}

