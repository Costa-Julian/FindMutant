package com.challenge.meli.controller;



import com.challenge.meli.returns.MutantStats;
import com.challenge.meli.model.Mutants;
import com.challenge.meli.repository.RepoMutant;
import com.challenge.meli.service.Methods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    String[] vectorA = {"AAAA"};
    String[] vectorC = {"CCCC"};
    String[] vectorG = {"GGGG"};

    @Autowired
    RepoMutant repo;
    @Autowired
    Methods methods;

    @PostMapping(value = "dna"  , consumes = "application/json")
    public boolean dna(@RequestBody Mutants dna){
        boolean retorno = methods.isMutant(dna,vectorA,vectorC,vectorG);
        methods.saveRecord(retorno);
        return retorno;
    }
    @GetMapping("stats")
    public MutantStats showStats(){
        MutantStats returns =new MutantStats();
        returns.setCount_mutant_dna(repo.countMutant());
        returns.setCount_human_dna(repo.countHuman());
        returns.setRatio(methods.ratio());
        return returns;
    }
}
