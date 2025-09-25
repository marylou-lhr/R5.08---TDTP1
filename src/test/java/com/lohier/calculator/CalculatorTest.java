package com.lohier.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add_devrait_calculer_la_somme_des_deux_ints()
    {
        //GIVEN
        int opG = 5;
        int opD = 6;


        //WHEN
        int resultat = calculator.add(opG, opD);

        //THEN
        assertThat(resultat).isEqualTo(11);

    }

    @ParameterizedTest(name = "Test addition #{index} - {0} + {1} = {2}")
    @CsvSource({"0,1,1", "1,2,3", "-2,2,0", "0,0,0", "-1,-2,-3"})
    void add_devrait_retourner_les_resultats_attendus(int opG, int opD, int resultatAttendu)
    {
        //THEN
        int resultat = calculator.add(opG, opD);

        //WHEN
        assertThat(resultat).isEqualTo(resultatAttendu);
    }

    @Test
    void divide_devrait_retourner_la_division_des_deux_ints()
    {
        //GIVEN
        int opG = 4;
        int opD = 2;

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

        //WHEN
        int resultat = calculator.divide(opG, opD);

        //THEN
        assertThat(resultat).isEqualTo(0.25);
    }

}