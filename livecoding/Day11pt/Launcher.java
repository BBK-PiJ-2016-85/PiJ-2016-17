public class Launcher  {

   public static void main(String[] args) {
       Launcher launcher = new Launcher();
       launcher.launch();
   }

   public void launch() {
       Set<Integer> bagOfNumbers = new TreeSet<Integer>(1);
       bagOfNumbers.add(1);
       bagOfNumbers.add(2);
       bagOfNumbers.add(3);
       bagOfNumbers.add(2);
       bagOfNumbers.add(1);
       System.out.println("The bag contains these numbers: " + bagOfNumbers.toString());
       System.out.println("There are " + bagOfNumbers.size() + " numbers in it.");
       System.out.println("Let's check if these numbers are in it: ");
       Integer[] someNumbers = {0, 1, 2, 3, 4};
       printIfContained(bagOfNumbers, someNumbers);

       Set<String> bagOfNames = new TreeSet<String>("Mark");
       bagOfNames.add("Matt");
       bagOfNames.add("John");
       bagOfNames.add("Luke");
       bagOfNames.add("John");
       bagOfNames.add("John");
       bagOfNames.add("Mark");
       bagOfNames.add("Mary");
       bagOfNames.add("Mary");
       bagOfNames.add("Mary");
       System.out.println("The bag contains these numbers: " + bagOfNames);
       System.out.println("There are " + bagOfNames.size() + " names in it.");
       System.out.println("Let's check if these names are in it: ");
       String[] someNames = {"Mark", "Matt", "Mary", "Manet", "Marv"};
       printIfContained(bagOfNames, someNames);

       // how can we get the depth of the three (*if* it is a tree)?
       // TreeSet treeOfNames = (TreeSeet) bagOfNames;
       // treeOfNames.depth();
   }

   public <T> void printIfContained(Set<T> bag, T[] elements) {
      for (int i = 0; i < elements.length; i++) {
         T next = elements[i];
         System.out.print(next + ": ");
         if (bag.contains(next)) {
             System.out.print("YES");
         } else {
             System.out.print("NO");
         }
         System.out.println();
      }
   }

}

