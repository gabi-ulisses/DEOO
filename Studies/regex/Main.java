package aulas.regex;

public class Main {
    public static void main(String[] args) {
        
        String str = "a"; // segue o padrão (true ou false) ?
        String regex = "a"; // padrão      
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "aa";
        regex = "a";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "aa";
        regex = "a+";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "aaaaaaa";
        regex = "a\\+";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "abc";
        regex = "[a-z]*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "abcW";
        regex = "[a-z]*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "abcW";
        regex = "[a-zA-Z]*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "abcW";
        regex = "A\\d+";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "A25751815158";
        regex = "A\\d+";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "55514-444";
        regex = "\\d{5}-\\d{3}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "+55(16)88888-4444";
        regex = "(\\+\\d{1,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "kakjubdjb      anjndjnsj   aaa";
        str = str.replaceAll("\\s{2,}", " ");
        System.out.println(str);
        
        str = "ahahbah jkkjkma    kmkmakma   a";
        System.out.println( str );
        String[] vetor = str.split("\\s+");
        
        for( String s : vetor ) {
            System.out.println(s);
        }
        
    }
}