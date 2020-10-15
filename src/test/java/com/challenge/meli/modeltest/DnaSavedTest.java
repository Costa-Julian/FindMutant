package com.challenge.meli.modeltest;


import com.challenge.meli.model.DnaSaved;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DnaSavedTest {

    DnaSaved dnaSavedRecords = new DnaSaved();


    @Test
    void getAndSetId() {
        dnaSavedRecords.setId((long)1);
        Assertions.assertEquals(1,dnaSavedRecords.getId());
    }
    @Test
    void getAndSetIdNotEquals() {
        dnaSavedRecords.setId((long)1);
        Assertions.assertNotEquals(2,dnaSavedRecords.getId());
    }

    @Test
    void getSetDnaMutantTest() {
       dnaSavedRecords.setDnaMutant("Mutant");
       Assertions.assertEquals("Mutant",dnaSavedRecords.getDnaMutant());
    }
    @Test
    void getSetDnaMutantTestNotEquals() {
        dnaSavedRecords.setDnaMutant("Mutant");
        Assertions.assertNotEquals("No Mutant",dnaSavedRecords.getDnaMutant());
    }

    @Test
    void constructorTest() {
        DnaSaved dna = new DnaSaved((long) 5 , "Mutant");
        Object esperado = dna;
        Assertions.assertEquals(esperado,dna);
    }
}