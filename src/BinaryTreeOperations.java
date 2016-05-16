 import java.util.*;

//import BinarySearchTree.TreeIterator;
 /*
 
Assignment 1																					Kaivalya Deshpande
																								819523465
																								
 
 */
 
 

public  class BinaryTreeOperations{
    public static void main(String []args){
        BinarySearchTree bst=new BinarySearchTree();
      
   bst.setStrategy(new LengthWise());
   ArrayList al = new ArrayList();
   // add elements to the array list
   al.add("C");
   al.add("A");
   al.add("E");
   al.add("B");
   al.add("D");
   al.add("F");
   
   System.out.print("Original contents of al: ");
   Iterator itr = al.iterator();
   while(itr.hasNext()) {
      Object element = itr.next();
      System.out.print(element + " ");
   }
  // Object element = itr.next();
  // System.out.print(itr.next());
     bst.add(new String ("Ramesh"));
     bst.add(new String ("Ask"));
     bst.add("scjkk");
     bst.add(new String ("Osyys"));
     
     System.out.println(bst.toArray());
     BinarySearchTree newBst=new BinarySearchTree();
        /*EmployeeData e=new EmployeeData(12,"Rajesh",2);
        EmployeeData e1=new EmployeeData(11,"Rmaesh",3);
        EmployeeData e2=new EmployeeData(13,"Acharya",3);
        EmployeeData e3=new EmployeeData(14,"Elephant",3);
        EmployeeData e4=new EmployeeData(15,"Narad",3);
        bst.add(e);
        bst.add(e1);
        
EmployeeData ee=new EmployeeData(12,"Rajesh",2);*/
//System.out.println("Are they equal ??" + (e.equals(ee)));
     //   bst.add(new EmployeeData(15,"Narad",3));
        
      // bst.add("e");
       /* bst.add("z");
        bst.add("d");
        bst.add("c");*/
     //   bst.getOrderedTreeElements();
       
     newBst.setStrategy(new ByEmployeeName());
        newBst.add(new EmployeeData(13,"Acharya",3));
        newBst.add(new EmployeeData(14,"Elephant",3));
        newBst.add(new EmployeeData(15,"ephaskvs",12));
        newBst.add(new EmployeeData(16,"csccephant",3));
        Iterator t=bst.iterator();
        Iterator t1=newBst.iterator();
        IteratorDecorator id=new StartsWithVowels(t);
        IteratorDecorator c=new Capitalise(t);
      //  while (c.hasNext())
        // 	System.out.println(c.next()); 
        
     //  System.out.println("  "+c.next());
        
        System.out.println("");
      while (t1.hasNext())
        	System.out.println(t1.next().toString());
      
      System.out.println(t1.next());
      t1.next();
 
        System.out.println(bst.toString());
        System.out.println("");        	
    
         
    Object []objList= bst.toArray();
   for(int i=0;i<objList.length;i++)
   {
	   System.out.println(objList[i].toString());
   }
        BinarySearchTree  bs1=new BinarySearchTree(new ByYearsOfExperience());
     /*   bs1.add("one");
        bs1.add("two");
        bs1.add("three");*/
        System.out.println("BST elements in alphabetical order ");
        
     
    
        System.out.println();
        
        System.out.println("Elements which starts with Vowels in reverse alphabetical order ");
        //List<String> elementsStartsWithVowelReverse = bst.elementsStartWithVowelsReverse();
        //printElements(elementsStartsWithVowelReverse);
        
     }
    
    //print is not specific to Binary Search Tree
    private static void printElements(List<String> treeElements)
    {
    	for (String element:treeElements)
    		System.out.print(element+"\t");
    }
}

