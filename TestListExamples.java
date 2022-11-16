import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void filterTest(){
    StringChecker sc = new StringChecker() {
            
      public boolean checkString(String s){
          return s.length() < 8;
      }
  };

  ArrayList<String> list = new ArrayList<>();
  list.add("Pineapple");
  list.add("Apple");
  list.add("Orange");

  List<String> newList = ListExamples.filter(list, sc);

  ArrayList<String> expected = new ArrayList<>();
  expected.add("Apple");
  expected.add("Orange");

  
  assertArrayEquals(expected.toArray(), newList.toArray());
  }

  @Test
  public void mergeTest(){
    List<String> list1 = new ArrayList<>();

    list1.add("Pineapple");
    list1.add("Apple");

    List<String> list2 = new ArrayList<>();
    list2.add("Orange");

    List<String> newList = ListExamples.merge(list1, list2);
    List<String> expected = new ArrayList<>();
    expected.add("Apple");
    expected.add("Orange");
    expected.add("Pineapple");

    assertArrayEquals(expected.toArray(), newList.toArray());
  }
}
