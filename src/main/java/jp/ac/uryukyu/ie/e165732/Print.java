package jp.ac.uryukyu.ie.e165732;


import java.util.Scanner;
public class Print {
    String [] syoki = new String[9];
    public void print(){
        for(int i=0;i<=8;i++) {
            syoki[i] ="#";
        }
        print2();
        for (int i3=0;i3<=8;){
            System.out.printf("%s\n",i3);
            o_turn();
            i3++;
            if(i3 >=8){
                break;
            }else {
                System.out.printf("%s\n", i3);
                x_turn();
                i3++;
            }
        }
    }
    public void o_turn(){
        System.out.printf("Oのターン\n");
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        int c = Integer.parseInt(input);
        syoki[c] = "o";
        print2();
    }
    public void x_turn(){
        System.out.printf("Xのターン\n");
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        int c = Integer.parseInt(input);
        syoki[c] = "x";
        print2();
    }

    public void print2(){
        System.out.printf("%s%s%s,0,1,2,\n",syoki[0],syoki[1],syoki[2]);
        System.out.printf("%s%s%s,3,4,5,\n",syoki[3],syoki[4],syoki[5]);
        System.out.printf("%s%s%s,6,7,8,\n",syoki[6],syoki[7],syoki[8]);
    }


}