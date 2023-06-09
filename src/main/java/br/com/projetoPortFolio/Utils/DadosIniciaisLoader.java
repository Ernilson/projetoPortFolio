package br.com.projetoPortFolio.Utils;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.projetoPortFolio.Entity.Pessoa;
import br.com.projetoPortFolio.Repository.PessoaRepository;

@Component
public class DadosIniciaisLoader {

    @Bean
    public CommandLineRunner inicializarDados(PessoaRepository pessoaRepository) {
        return args -> {
            if (pessoaRepository.count() == 0) {                
                Pessoa pessoa = new Pessoa();
                pessoa.setNome("Ciclano Silva");
                pessoa.setDataNascimento(LocalDate.of(2022, 2, 2));
                pessoa.setCpf("12345678901");
                pessoa.setFuncionario(true);

                pessoaRepository.save(pessoa);
            }
        };
    }
}