package array;
import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (numRows == 0) {
      return result;
    }
    List<Integer> firstRow = new ArrayList<Integer>();
    firstRow.add(1);
    result.add(firstRow);
    for (int i = 1; i < numRows; i++) {
      List<Integer> row = new ArrayList<Integer>();
      row.add(1);
      for (int j = 1; j < i; j++) {
        row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
      }
      row.add(1);
      result.add(row);
    }
    return result;
  }

}
