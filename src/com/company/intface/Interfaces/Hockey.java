package com.company.intface.Interfaces;

public interface Hockey extends Sport {
    void homeGoalScored();
    void visitGoalScore();
    void endOfPeriod(int period);
    void overTimePeriod(int ot);
}
