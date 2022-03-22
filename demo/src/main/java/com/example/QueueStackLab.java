package com.example;

import java.util.*;
import org.json.simple.*;

public class QueueStackLab {

  private static Queue<String> cupcakeQueue = new LinkedList<String>();
  private static Stack<String> cupcakeStack = new Stack<String>();

  public static void main(String[] args) {
    String fileName =
      "F:/Github/lab-week8/demo/src/main/java/com/example/cupcake_test_10.json";

    // read cupcake names
    JSONArray cupcakeArray = JSONFile.readArray(fileName);

    // get and sort array
    ArrayList<String> cupcakeNameArray = new ArrayList<String>();
    cupcakeNameArray = nameArray(cupcakeArray);
    System.out.println(cupcakeNameArray);
    Collections.sort(cupcakeNameArray);

    // print array
    System.out.println("----- array -----");
    print(cupcakeNameArray);

    // add each cupcake to a queue
    System.out.println("----- queue -----");
    copyToQueue(cupcakeNameArray);
    printAndEmptyQueue();

    // add each cupcake to a stack
    System.out.println("----- stack -----");
    copyToStack(cupcakeNameArray);
    printAndEmptyStack();
  }

  // get array of cupcake names
  public static ArrayList<String> nameArray(JSONArray cupcakeArray) {
    ArrayList<String> arr = new ArrayList<String>();

    // get names from json object
    for (int i = 0; i < cupcakeArray.size(); i++) {
      JSONObject o = (JSONObject) cupcakeArray.get(i);
      String name = (String) o.get("name");
      arr.add(name);
    }
    return arr;
  }

  // print cupcake array
  public static void print(ArrayList<String> cupcakeNameArray) {
    for (int i = 0; i < cupcakeNameArray.size(); i++) {
      System.out.printf("%04d\t%s\n", i, cupcakeNameArray.get(i));
    }
  }

  // copy cupcakes to the queue
  public static void copyToQueue(ArrayList<String> cupcakeNameArray) {
    /*
     * write the code for this method
     */
    for (String cup:cupcakeNameArray)
    {
      cupcakeQueue.add(cup);
    }
    

  }

  // prints and empties the queue
  public static void printAndEmptyQueue() {
    /*
     * write the code for this method
     * students should use a queues remove method
     */
    int i = 0;
    while (!cupcakeQueue.isEmpty())
    {
      System.out.printf("%04d\t%s\n", i, cupcakeQueue.remove());
      i +=1;
    }
  }

  // copy cupcakes to the stack
  public static void copyToStack(ArrayList<String> cupcakeNameArray) {
    /*
     * write the code for this method
     */
    for(String cup:cupcakeNameArray)
    {
      cupcakeStack.push(cup);
    }

  }

  // prints and empties the queue
  public static void printAndEmptyStack() {
    /*
     * write the code for this method
     * students should use a stacks pop method
     */
    int i = 0;
    while (!cupcakeStack.isEmpty())
    {
      System.out.printf("%04d\t%s\n", i, cupcakeStack.pop());
      i +=1;
    }
  }
}
