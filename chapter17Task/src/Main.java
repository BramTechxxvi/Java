public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

//        Section 17.13 Creating a Stream<String> from a File
//        • Stream method flatMap receives a Function that maps an object into a stream—e.g., a line of
//        text into words.
//    • Pattern method splitAsStream uses a regular expression to tokenize a String.
//    • Collectors method groupingBy with three arguments receives a classifier, a Map factory and a
//        downstream Collector. The classifier Function returns objects which are used as keys in the resulting Map. The Map factory is an object that implements interface Supplier and returns a new
//                Map collection. The downstream Collector determines how to collect each group’s elements.
//        • Map method entrySet returns a Set of Map.Entry objects containing the Map’s key–value pairs.
//        • Set method stream returns a stream for processing the Set’s elements.
    }
}