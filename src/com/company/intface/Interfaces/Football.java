package com.company.intface.Interfaces;

public interface Football extends TVProgram,Sport {
    void homeTeamScore(int point);
    void visitTeamScore(int point);
    void endOfQuarted(int quarter);
}
