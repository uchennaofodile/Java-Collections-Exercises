/**
 * ArrayList-Exercises
 */

import java.util.*;

public class ArrayListEx {
  ArrayList<String> mArrayList;

  public ArrayListEx() {
    mArrayList = new ArrayList<>();
  }

  //Insert at beginnning
  void insert(String color) {
    try {
      if (!Integer.class.isInstance(color)) {
        throw new ClassCastException();
      }
      mArrayList.add(0, color);
      if (mArrayList.get(0).equals(color)) {
        System.out.println("Inserted " + color + " at index 0");
      }
    } catch (ClassCastException e) {
      System.out.println("Wrong buddy");
      //System.out.println(e.getClass().getName() + " " + e.getMessage());
    }
  }

  String retrieve(int index) {
    return mArrayList.get(index);
  }

  void update(int index, String element) {
    String oldString = mArrayList.get(index);
    mArrayList.set(index, element);
    String newString = mArrayList.get(index);
    System.out.println("Changed " + oldString + " to " + newString);
  }

  void removeThird() {
    String removed = mArrayList.get(2);
    mArrayList.remove(2);
    System.out.println("Sucessfully deleted " + removed);
  }

  void search(String value){
    String[] tempArr = mArrayList.toArray();
    tempArr
  }

  public static void main(String[] args) {
    System.out.println();
    ArrayListEx colors = new ArrayListEx();
    colors.mArrayList.add("blue");
    colors.mArrayList.add("red");
    colors.mArrayList.add("yellow");
    System.out.println(colors.mArrayList);
    for (String color : colors.mArrayList) {
      System.out.println(color);
    }

    System.out.println(colors.retrieve(0));

    colors.update(0, "black");
    colors.removeThird();

    //colors.insert(1);
  }
}
