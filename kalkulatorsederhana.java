public class kalkulatorsederhana {
    public static String kalkulator(String str) {
        String str2 = str.replaceAll("\\s+","");
        String operators[]=str2.split("[0-9]+");
        String operands[]=str2.split("[*/+-]");
        int result = Integer.parseInt(operands[0]);
        for(int i=1;i<operands.length;i++){
            if(operators[i].equals("*"))
                result *= Integer.parseInt(operands[i]);
            else if(operators[i].equals("/"))
                if (operands[i].equals("0"))
                    return "tidak bisa dilakukan";
                else
                    result /= Integer.parseInt(operands[i]);
            else if(operators[i].equals("+"))
                result += Integer.parseInt(operands[i]);
            else if(operators[i].equals("-"))
                result -= Integer.parseInt(operands[i]);
        }
        return String.valueOf(result);
    }

    public static void main (String[] args) {
        System.out.print(kalkulator("2 + 2"));
        System.out.println();
        System.out.print(kalkulator("2 * 2"));
        System.out.println();
        System.out.print(kalkulator("2 / 2"));
        System.out.println();
        System.out.print(kalkulator("2 / 0"));
    }
}
