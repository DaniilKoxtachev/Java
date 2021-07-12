package com.company.intface.Nested;

public class A {
    public interface NestedIf{
        boolean isNotNegative(int x);
    }
}
class B implements A.NestedIf{

    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}
