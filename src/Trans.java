import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class Trans {

    public int getStbase() {
        return stbase;
    }

    public void setStbase(int stbase) {
        this.stbase = stbase;
    }

    private int stbase;

    public int getNdbase() {
        return ndbase;
    }

    public void setNdbase(int ndbase) {
        this.ndbase = ndbase;
    }

    private int ndbase;

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    private String val1;

    int convertion() {
        Map<Character, Integer> converterMap = new HashMap<>();

        converterMap.put('a', 10);
        converterMap.put('b', 11);
        converterMap.put('c', 12);
        converterMap.put('d', 13);
        converterMap.put('e', 14);
        converterMap.put('f', 15);


        int resultToTen = calculateToBaseTen(val1, converterMap);
        int finalresult = 0;
        return finalresult;

    }

    private int calculateToBaseTen(String val1, Map<Character, Integer> letterToNumberMap) {

        int result = 0;
        int i = 0;
        for (char ch : val1.toCharArray()) {
            i++;
            if (Character.isLetter(ch)) {

                char lowercaseCh = Character.toLowerCase(ch);

                if (letterToNumberMap.containsKey(lowercaseCh)) {
                    ;
                    result += (int) ((letterToNumberMap.get(lowercaseCh)) * Math.pow(getStbase(), (val1.length() - i)));
                } else {

                    System.out.println("input is not valid");
                    System.exit(1);
                    ;
                }
            } else {
                if (Character.getNumericValue(ch) >= stbase) {
                    System.out.println("input is not valid");
                    System.exit(1);
                } else {
                    result += (int) (Character.getNumericValue(ch) * Math.pow(getStbase(), (val1.length() - i)));
                }
            }
        }
        return result;
    }

    private int calculateToBaseTen(String val1, int stbase, int ndbase, int resultToTen) {

        ArrayList<Integer> remainder= new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        int div= resultToTen / stbase;
        int rem = resultToTen % stbase;
        remainder.add(rem);
        while(div!=0||div<0) {
            div=div/stbase;
            rem = div % stbase;
            remainder.add(rem);
        }

        for (int element: remainder) {
            builder.append(remainder[i]);
            builder.append(" ");
            }

        return div;
    }

}

