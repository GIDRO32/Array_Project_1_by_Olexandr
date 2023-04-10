package PartII;

public class Wrappers {
    public static void main(String[] args) {
        // Creating variables of wrapper classes
        int intWrapper = Integer.parseInt("10");
        double doubleWrapper = Double.parseDouble("3.14");
        boolean boolWrapper = Boolean.parseBoolean("true");
        Character charWrapper = Character.valueOf('A');

        // Using parseInt() method
        int intNumber = Integer.parseInt("20");

        // Using intValue() and doubleValue() methods
        int intVal = (int) intWrapper;
        double doubleVal = (double) doubleWrapper;

        // Using toString() method
        String boolString = Boolean.toString(false);

        // Using hashCode() method
        int intHashCode = Integer.hashCode(intWrapper);
        int charHashCode = charWrapper.hashCode();
        int boolHashCode = Boolean.hashCode(boolWrapper);
        int doubleHashCode = Double.hashCode(doubleWrapper);

        // Using compareTo() method
        Integer a = 5;
        Integer b = 10;
        System.out.println("Comparing a and b. a = " + a + " & b = " + b);
        System.out.println("\n Output when a<b:");
        System.out.println(a.compareTo(b)); // Output: -1 (a < b)
        System.out.println("\n Output when b>a:");
        System.out.println(b.compareTo(a)); // Output: 1 (b > a)
        System.out.println("\n Output when a=a:");
        System.out.println(a.compareTo(a)); // Output: 0 (a = a)

        String str1 = "apple";
        String str2 = "banana";
        System.out.println("\nComparing length of two strings.\nstr1 says " + "(" + str1 + ")\n" + "str2 says " + "(" + str2 + ")\n");
        System.out.println("Output when str1 is shorter than str2");
        System.out.println(str1.compareTo(str2)); // Output: -1 (str1 < str2)
        System.out.println("Output when str2 is longer than str1");
        System.out.println(str2.compareTo(str1)); // Output: 1 (str2 > str1)
        System.out.println("Output when str1 is as long as str1");
        System.out.println(str1.compareTo(str1)); // Output: 0 (str1 = str1)

        // Comparing output of x + y and y.toString() + y.toString()
        Integer x = 5;
        Integer y = 10;
        System.out.println("\nComparing a+b and a.toString() + b.toString().\nx = " + x + " & y = " + y);
        System.out.println("In this output we are summarizing x and y:");
        System.out.println(x + y); // Output: 15
        System.out.println("In this output we are just merging x and y in one number just like in (Alternative Math) film. Have you seen it?");
        System.out.println(x.toString() + y.toString()); // Output: "510"
    }
}
