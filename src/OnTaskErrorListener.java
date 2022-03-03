/**
 * @author Stanislav Rakitov in 2022
 */
@FunctionalInterface
public interface OnTaskErrorListener {
  void onError(String error);
}
