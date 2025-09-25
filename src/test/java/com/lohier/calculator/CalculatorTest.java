package com.lohier.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_devrait_calculer_la_somme_des_deux_ints()
    {
        //GIVEN
        int opG = 5;
        int opD = 6;
        Calculator calculator = new Calculator();

        //WHEN
        int resultat = calculator.add(opG, opD);

        //THEN
        assertThat(resultat).isEqualTo(11);

    }

    @Test
    void divide_devrait_retourner_la_division_des_deux_ints()
    {
        //GIVEN
        int opG = 4;
        int opD = 2;
        Calculator calculator = new Calculator();

        //WHEN
        int resultat = calculator.divide(opG, opD);

        //THEN
        assertThat(resultat).isEqualTo(2);
    }

    @Test
    void divide_devrait_retourner_une_erreur_car_resultat_float()
    {
        //GIVEN
        int opG = 1;
        int opD = 4;
        Calculator calculator = new Calculator();

        //WHEN
        int resultat = calculator.divide(opG, opD);

        //THEN
        assertThat(resultat).isEqualTo(0.25);
    }

}