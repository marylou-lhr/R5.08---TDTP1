package com.lohier.calculator;

import java.util.HashSet;
import java.util.Set;

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

    public Set<Integer> ensembleChiffres(int pNombre)
    {
        Set<Integer> ensemble = new HashSet<>();
        String str_nombre = String.valueOf(Math.abs(pNombre));

        for (char c: str_nombre.toCharArray()) {
            ensemble.add(Character.getNumericValue(c));
        }

        return ensemble;
    }
}
