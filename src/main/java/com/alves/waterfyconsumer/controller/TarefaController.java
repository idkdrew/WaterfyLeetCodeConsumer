package com.alves.waterfyconsumer.controller;

import com.alves.waterfyconsumer.model.Tarefa;
import com.alves.waterfyconsumer.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.client.HttpStatusCodeException;

import java.util.List;

@Controller
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/")
    public String index(Model model) {
        List<Tarefa> tarefas = tarefaService.listarTarefas();
        model.addAttribute("tarefas", tarefas);
        return "index";
    }

    @PostMapping("/tarefas/salvar")
    public String salvarTarefa(@ModelAttribute Tarefa tarefa, RedirectAttributes redirectAttributes) {
        try {
            tarefaService.salvarTarefa(tarefa);
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", e.getMessage());
        }
        return "redirect:/";
    }

    @GetMapping("/tarefas/excluir/{id}")
    public String excluirTarefa(@PathVariable int id, RedirectAttributes redirectAttributes) {
        try {
            tarefaService.excluirTarefa(id);
        } catch (HttpStatusCodeException e) {
            redirectAttributes.addFlashAttribute("errorMessage", e.getResponseBodyAsString());
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", e.getMessage());
        }
        return "redirect:/";
    }
}
