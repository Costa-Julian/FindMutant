package com.challenge.meli.service;


import com.challenge.meli.model.Mutants;

public interface MethodService {
    boolean isMutant(Mutants dna,
                     String[] vectorA,
                     String[] vectorC,
                     String[] vectorG);

    String ratio();
    void saveRecord(Boolean registro);


}
