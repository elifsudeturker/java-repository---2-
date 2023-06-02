package day08stringmanipulationmemoryusageifstatement;
public class StringManipulation01 {
    public static void main(String[] args) {
        String str ="";
        boolean result1 = str.length() == 0;
        System.out.println("String boş mu? " + result1);
        boolean result2 = str.isEmpty();
        System.out.println("Is string empty? = " + result2);
        String t ="      ";
        boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("result3 = " + result3);
        boolean result4 = t.isBlank();
        System.out.println("result4 = " + result4);
        //////////////////////////////////////////
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);
        int idxI = r.indexOf('i');
        System.out.println(idxI);
        int idxE = r.indexOf('e');
        System.out.println(idxE);

        String u = "Ah Java vah Java sensiz olmuyor Java";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);

        int idxjava = u.indexOf("java");
        System.out.println(idxjava);

        String v = "Java is easy to learn";
        int idxOfa = v.lastIndexOf('a');
        System.out.println(idxOfa);

        int idxOfe = v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi = v.lastIndexOf('i');
        System.out.println(idxOfi);
        System.out.println(idxOfa+idxOfi+idxOfe);


    }



}
