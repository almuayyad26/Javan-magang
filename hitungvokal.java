public class hitungvokal {
    public static String Foo(String str) {
        StringBuilder result = new StringBuilder();
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (j == i) {
                if (str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='u' || str.charAt(i)=='e' || str.charAt(i)=='o') {
                    result.append(str.charAt(i));
                    count++;
                    result.append(", ");
                }
            }
        }
        result.replace(result.length()-5,result.length()-4," dan");
        result.delete(result.length()-2,result.length());
        return (count+" yaitu "+result);
    }

    public static void main (String[] args) {
        System.out.print(Foo("wisnu"));
        System.out.println();
        System.out.print(Foo("bayu"));
        System.out.println();
        System.out.print(Foo("manupraba"));
        System.out.println();
        System.out.print(Foo("wisnu bayu manupraba"));
    }
}
