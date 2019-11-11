package sort;

public class RunSort {

  public static void main(String[] args) {
    Sort sort = new Sort();
    System.out.println("Iterative sort:");
    sort.iterativeSort(sort.list);
    sort = new Sort();
    System.out.println("Recursive sort:");
    sort.recursiveSort(sort.list, sort.list.length - 1);
  }
}