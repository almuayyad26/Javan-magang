public class cetakganjilgenap {
    public static String Foo(int A, int B) {
        StringBuilder result = new StringBuilder();
        for (int i=A; i<=B; i++){
            if(i%2==0){
                result.append("Angka "+i+" adalah genap \n");
            } else
            if(i%2==1){
                result.append("Angka "+i+" adalah ganjil \n");
            }
        }
        return String.valueOf(result);
    }

    public static void main (String[] args) {
        System.out.print(Foo(1,4));
        System.out.println();
        System.out.print(Foo(10,11));
        System.out.println();
        System.out.print(Foo(6,8));
    }
}
