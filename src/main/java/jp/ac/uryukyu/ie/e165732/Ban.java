package jp.ac.uryukyu.ie.e165732;

import java.util.Scanner;

public class Ban { //"#"を9つ用意し、○または×を代入するクラス。
    String [] ban = new String[9];
    boolean end = false;
    public void print(){ //"#"を9つ用意する。
        for(int i=0;i<=8;i++) {
            ban[i] ="#";
        }
        print2();
        for (int i3=0;i3<=8;){
            judge();
            if (end == true){
                break;
            }else {
                o_turn();
                i3++;
            }
            if(i3 >=8){
                break;
            }else {
                judge();
                if (end == true){
                    break;
                }else {
                    x_turn();
                    i3++;
                }
            }
        }
    }
    public void o_turn(){ //"#"にoを代入する。
        System.out.printf("Oのターン\n");
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        int c = Integer.parseInt(input);
        ban[c] = "o";
        print2();
    }
    public void x_turn(){ //"#"にxを代入する。
        System.out.printf("Xのターン\n");
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        int c = Integer.parseInt(input);
        ban[c] = "x";
        print2();
    }

    public void print2(){ //3×3の格子に"#"が出力するようにした。
        System.out.printf("%s%s%s,0,1,2,\n",ban[0],ban[1],ban[2]);
        System.out.printf("%s%s%s,3,4,5,\n",ban[3],ban[4],ban[5]);
        System.out.printf("%s%s%s,6,7,8,\n",ban[6],ban[7],ban[8]);
    }
    public void judge() { //縦横斜め1列が揃ったときに「○または×WIN」と出力するようにした。
        if (ban[0] == ban[3] && ban[3] == ban[6] && ban[0] != "#" &&ban[3] != "#" &&ban[6] != "#" ) {
            System.out.printf("%sWIN\n", ban[0]);
            end = true;
        } else if (ban[1] == ban[4] && ban[4] == ban[7]&&ban[1] != "#" &&ban[4] != "#" &&ban[7] != "#" ) {
            System.out.printf("%sWIN\n", ban[1]);
            end = true;
        } else if (ban[2] == ban[5] && ban[5] == ban[8]&&ban[2] != "#" &&ban[5] != "#" &&ban[8] != "#" ) {
            System.out.printf("%sWIN\n", ban[2]);
            end = true;
        } else if (ban[0] == ban[1] && ban[1] == ban[2]&&ban[0] != "#" &&ban[1] != "#" &&ban[2] != "#" ) {
            System.out.printf("%sWIN\n", ban[0]);
            end = true;
        } else if (ban[3] == ban[4] && ban[4] == ban[5]&&ban[3] != "#" &&ban[4] != "#" &&ban[5] != "#" ) {
            System.out.printf("%sWIN\n", ban[3]);
            end = true;
        } else if (ban[6] == ban[7] && ban[7] == ban[8]&&ban[6] != "#" &&ban[7] != "#" &&ban[8] != "#" ) {
            System.out.printf("%sWIN\n", ban[6]);
            end = true;
        } else if (ban[0] == ban[4] && ban[4] == ban[8]&&ban[0] != "#" &&ban[4] != "#" &&ban[8] != "#" ) {
            System.out.printf("%sWIN\n", ban[0]);
            end = true;
        } else if (ban[2] == ban[4] && ban[4] == ban[6]&&ban[2] != "#" &&ban[4] != "#" &&ban[6] != "#" ) {
            System.out.printf("%sWIN\n", ban[2]);
            end = true;
        }
    }
}