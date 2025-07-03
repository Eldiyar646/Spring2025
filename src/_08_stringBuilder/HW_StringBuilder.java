package _08_stringBuilder;

public class HW_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" my");
        sb.insert(8, " dear");
        sb.append(" friends");
        sb.insert(13, " and");
        System.out.println(sb);
        sb.delete(13, 17);
        sb.insert(21, " and");
        sb.append(" collegues");
        System.out.println(sb);
        sb.replace(26, 35, "co-clubers!");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


    }
}
