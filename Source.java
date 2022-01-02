/* Practice */

//import java.util.*;
//public class Source {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = s.nextInt();
//        int k = s.nextInt();
//        search(arr, k);
//	}
//	
//	static void search(int[] arr, int k) {
//        
//	    
//	    for(int i=0;i<arr.length;i++){
//	        if(k == arr[i]){
//	             System.out.println("true");
//	             return;
//	        }
//	    }
//	    System.out.println("false");
//	    // Write your code
//	}
//
//}

//import java.util.ArrayList;                  //ArrayList library imported

//class Source {
//   public static void main(String[] args) {
//	   ArrayList<Integer> random = new ArrayList<>();
//      // random = {2, 4, 5, 10};       
//       //Declare and create an object of the ArrayList class named 'random', in place of the line above
//
//      //Add the first four elements to this 'random' ArrayList
//      
//
//       random.add(2);
//       random.add(4); 
//       random.add(5);
//       random.add(10);
//       random.add(99); //Command for adding a new element
//       printArray(random);
//   }
//
//   public static void printArray(ArrayList arr) {   //Change the type of the parameter to ArrayList
//       for(Object a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
//           System.out.println(a);
//       }
//   }
//}

//class Source {
//public static void main(String[] args) {
//    ArrayList<Float> random = new ArrayList<Float>();
//    random.add(2f);
//  random.add(4f); 
//  random.add(5f);
//  random.add(10f);
//  random.add(99.9f);
//    printMixList(random);
//}
//
//public static void printMixList(ArrayList<Float> elements) {
//    for(Object o : elements) {
//        System.out.println(o);
//    }
//}
//}

//
//import java.util.*;
//
//public class Source {
//    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = s.nextInt();
//        for (int i = 0; i < n; i++)
//            list.add(s.nextInt());
//        reverseArrayList(list);
//        for (int i = 0; i < list.size(); i++)
//            System.out.print(list.get(i) + " ");
//    }
//
//    // Method to reverse the ArrayList
//    static void reverseArrayList(ArrayList<Integer> list) {
////    	 ArrayList<Integer> reverseList = new ArrayList<Integer>();
////    	 for(int i = list.size()-1;i>=0;i--) {
////    		 reverseList.add(list.get(i));
////    	 }
//         Collections.reverse(list);
////    	 list = reverseList;
////    	 for (int i = 0; i < list.size(); i++)
////             System.out.print(list.get(i) + " ");
//    	
//        // Write your code here
//    }
//}
//


//import java.util.*;
//
//public class Source {
//  public static void main(String[] args) {
//    ArrayList<Student> studentList = new ArrayList<Student>();
//    studentList.add(new Student("Square", 1));
//    studentList.add(new Student("Triangle", 2));
//    studentList.add(2, new Student("Circle", 3));
//    studentList.add(1, new Student("Rhombus", 4));
//    ArrayList<Float> random = new ArrayList<Float>();
//    random.add(2f);
//    random.add(4f);
//    random.add(5f);
//    random.add(10f);
//    random.add(99.9f);
//
//    System.out.println(random.contains(5.0));
//
//
//    printStudentList(studentList);
//  }
//
//  public static void printStudentList(ArrayList<Student> students) {
//    for(Student s : students) {
//    	// Student s = (Student) o;
//      System.out.println(s.getDetails());
//    }
//  }
//}
//
//class Student {
//  private final String name;
//  private final int rollNumber;
//
//  public Student(String name, int rollNumber) {
//    this.name = name;
//    this.rollNumber = rollNumber;
//  }
//
//  public String getDetails() {
//    return
//      "name = " + this.name + '\n' +
//      "roll number = " + this.rollNumber + '\n';
//  }
//}
//
///*
//  SUMMARY
//  =======
//  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
//  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
//      type-incompatible with the declared contained type will fail at the static type checking stage,
//      resulting in a compile error.
//
//*/
//import java.util.ArrayList;
//
//class Source {
//
//   public static void main(String[] args) {
//       ArrayList<Float> random = new ArrayList<Float>();
//       random.add(2f);
//       random.add(4f);
//       random.add(5f);
//       random.add(10f);
//       random.add(99.9f);
//
//      //Write new statements here
//       
//       random.remove(3);
//       random.add(3,15f);
//
//       printList(random);
//   }
//
//   public static void printList(ArrayList<Float> arr) {
//       for(Float num : arr) {
//           System.out.println(num);
//       }
//   }
//}
//import java.util.*;
//
//public class Source {
//    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = s.nextInt();
//        reverseArray(arr);
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//    }
//
//    // Method to reverse the array
//    static void reverseArray(int[] arr) {
//        // Write your code here
//    	int right = arr.length-1;
//    	int left = 0;
//    	while(left<right) {
//    		int temp = arr[left];
//    		arr[left] = arr[right];
//    		arr[right] = temp;
//    		left++;
//    		right--;
//    	}
//    }
//}


import java.util.*;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
    	int size = arr.length-1;
    	int i=0;
    	while(i<size) {
    		
    		if(arr[i] == 0) {
    			for(int j = i;j<size;j++) {
    				arr[j]=arr[j+1];
    				
    			}
    			arr[size] = 0;
    		}
    		
    		i++;
    		
    	}
    	
    }
}

