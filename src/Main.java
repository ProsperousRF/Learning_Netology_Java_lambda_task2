/**
 * @author Stanislav Rakitov in 2022
 */
public class Main {
  public static void main(String[] args) {
    OnTaskDoneListener listener = System.out::println;
    OnTaskErrorListener errorListener = System.out::println;

    Worker worker = new Worker(listener, errorListener);
    worker.start();


  }
}
