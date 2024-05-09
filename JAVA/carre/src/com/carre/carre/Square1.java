package com.carre.carre;

import java.util.Scanner;

public interface Square1 {
    static void main(String[] args) {
        Carre c = new Carre();
        Scanner in = new Scanner(System.in);
        System.out.print("entrer côté: ");
        c.area = in.nextInt();
        c.surface(c.area);
        System.out.println(c.area);
        System.out.println(c.surface(c.area));
    }

    int surface(int area);

    int getArea();
}
