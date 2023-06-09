package br.com.projetoPortFolio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.projetoPortFolio", "br.com.projetoPortFolio.Utils"})
public class ProjetoPortFolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoPortFolioApplication.class, args);
    }

}