public class Launcher {

   public static void main(String[] args) {
       GenericTreeNode<Integer> root = new GenericTreeNode<Integer>(6);
       // 6, 4, 8, 2, 5, 4, 6
       //               6
       //         4           8
       //      2    5     
       //       4     6
       root.add(4);
       root.add(8);
       root.add(2);
       root.add(5);
       root.add(4);
       root.add(6);
       System.out.println("My integer tree's depth is " + root.getDepth());
       GenericTreeNode<String> stringRoot = new GenericTreeNode<>("Table");
       //                 Table
       //          Computer
       //        Chair   Door
       //                   Mouse
       //                      Pen
       stringRoot.add("Computer");
       stringRoot.add("Chair");
       stringRoot.add("Door");
       stringRoot.add("Mouse");
       stringRoot.add("Pen");
       System.out.println("My string ree's depth is " + stringRoot.getDepth());
       System.out.println("Tree contains 'Pen': " + stringRoot.contains("Pen"));
       System.out.println("Tree contains 'pen': " + stringRoot.contains("pen"));
   }
}