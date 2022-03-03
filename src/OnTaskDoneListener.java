/**
 * @author Stanislav Rakitov in 2022
 */
@FunctionalInterface
public interface OnTaskDoneListener {
  void onDone(String result);
}
