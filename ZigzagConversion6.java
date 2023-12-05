
public class ZigzagConversion6 {
    public static void main(String[] args) {
        String s = "FranciscoBriseño";
        System.out.println(convert(s, 4));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1)return s;

        StringBuilder[] sbs = new StringBuilder[numRows];
        int row = 0, dir = 0;

        for (int i = 0; i< sbs.length;i++){
            sbs[i] = new StringBuilder();
        }

        for (int i = 0; i< s.length(); i ++){
            char c = s.charAt(i);
            row += dir;
            sbs[row].append(c);

            if (row == 0 || row == numRows - 1){
                dir = (dir == 0)? 1 : -dir;
            }
        }
        return convert1(sbs);
    }

    private static String convert1(StringBuilder[] sbs){
        StringBuilder result = new StringBuilder();

        for (StringBuilder sb : sbs){
            result.append(sb.toString());
        }

        return result.toString();
    }
}
