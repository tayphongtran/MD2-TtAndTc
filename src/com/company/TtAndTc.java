package com.company;

public class TtAndTc {
    //8 data type nguyen thuy
    // Phương thức có tham số kiểu int, với kiểu int (kiểu nguyên thủy)
    // thì tham số truyền là giá trị (tham trị)
    static void addTT(int x) {
        x = x + 1;
        System.out.println(x);
    }

    static void Test_addTT() {
        int x = 5;
        addTT(x);
        System.out.println(x + " sao the");
    }

    public static void main(String[] args) {
        TtAndTc.Test_addTT();
    }
}
