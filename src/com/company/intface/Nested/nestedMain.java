package com.company.intface.Nested;

public class nestedMain {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10)){
            System.out.println("Число 10 не отрцательное");
        }
        if (nif.isNotNegative(-12)){
            System.out.println("Не будет выведенно");
        }
        if (nif.isNotNegative(-132322)){
            System.out.println("Не будет выведенно");
        }
        if (nif.isNotNegative(132322)){
            System.out.println("Не будет выведенно");
        }



    }
}

