package com.alves.waterfyconsumer.service;

import com.alves.waterfyconsumer.model.Tarefa;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TarefaService {

    private final String API_URL = "http://localhost:4000/tarefa";
    private final RestTemplate restTemplate = new RestTemplate();

    public List<Tarefa> listarTarefas() {
        ResponseEntity<Tarefa[]> response = restTemplate.getForEntity(API_URL, Tarefa[].class);
        return Arrays.asList(response.getBody());
    }

    public void salvarTarefa(Tarefa tarefa) {
        HttpEntity<Tarefa> request = new HttpEntity<>(tarefa);
        if (tarefa.getId() == 0) {
            restTemplate.postForObject(API_URL, request, Tarefa.class);
        } else {
            restTemplate.exchange(API_URL + "/" + tarefa.getId(), HttpMethod.PUT, request, Void.class);
        }
    }

    public void excluirTarefa(int id) {
        restTemplate.delete(API_URL + "/" + id);
    }
}
