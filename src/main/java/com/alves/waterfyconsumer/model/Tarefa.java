package com.alves.waterfyconsumer.model;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String status;
    private LocalDate dataDeVencimento;
}

