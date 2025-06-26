package com.zyntech.br.api_promos.teste;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class teste {

    @Scheduled(fixedRate = 5000)
    public void teste1() {
        System.out.println("Teste de agendamento");
    }

}
