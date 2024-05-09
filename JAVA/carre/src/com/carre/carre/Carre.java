package com.carre.carre;

import java.util.Scanner;

public class Carre implements Square1 {
    public int area;
    @Override
    public int surface(int area){
        return area*area;
    }
    @Override
    public int getArea() {
        return area;
    }
}
