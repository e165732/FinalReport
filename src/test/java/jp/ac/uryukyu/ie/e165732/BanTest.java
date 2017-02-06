package jp.ac.uryukyu.ie.e165732;


import org.junit.Test;

public class BanTest { //"#"が3×3の格子に代入されているかテストするクラス。
    String [] ban = new String[9]; //初期の盤を用意し、0〜8に#が代入されているかテストする。
    boolean end = false;//0=false
   @Test
    public void print() throws Exception{
        for (int i = 0; i <= 8; i++) {
            ban[i] = "#";
        }

        System.out.printf("%s%s%s,0,1,2,\n", ban[0], ban[1], ban[2]);
        System.out.printf("%s%s%s,3,4,5,\n", ban[3], ban[4], ban[5]);
        System.out.printf("%s%s%s,6,7,8,\n", ban[6], ban[7], ban[8]);
    }


}
