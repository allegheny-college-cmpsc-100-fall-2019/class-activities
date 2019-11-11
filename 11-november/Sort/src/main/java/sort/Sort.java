package sort;

public class Sort {

  public final int[] list;
  
  public Sort() {
    RandomList list = new RandomList(10);
    this.list = list.list;
  }
  
  public int[] iterativeSort(int[] array) {
    /*
     * TODO Implement iterative sort
     */
  }
  
  public int[] recursiveSort(int[] array, int index) {
    /*
     * TODO Implement recursive sort
     */
  }
  
  private void printProgress(int[] array) {
    for (int num : array) {
      System.out.printf("%d\t",num);
    }
    System.out.println();
  }
}