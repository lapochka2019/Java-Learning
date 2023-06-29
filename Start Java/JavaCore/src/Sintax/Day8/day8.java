package Day8;

public class day8 {
    public static void main(String []arg){
        //абота со StringBuilder
        String s = "";
        long start = System.currentTimeMillis();
        for (int i=0;i<=20000;i++){
            s=s+i+" ";
        }
        System.out.println(s);
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);//1219

        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i=0;i<=20000;i++){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
        stop = System.currentTimeMillis();
        System.out.println(stop-start);//93

    }
}
