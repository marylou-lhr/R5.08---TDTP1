package com.lohier.calculator;

public class Calculator {

    public int add (int opG, int opD)
    {
        return opG + opD;
    }

    public int divide (int opG, int opD)
    {
        if (opG != 0 || opD != 0)
        {
            return opG/opD;
        }

        return 0;
    }
}
