package org.example.controle2025.web;

import org.example.controle2025.dto.ComputerDto;
import org.example.controle2025.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class ComputerController {
private ComputerService computerService;
    @QueryMapping
    public List<ComputerDto> getAvionByModel(@Argument String model){
        return ComputerService.getComputerbyProce( model);
    }
    @MutationMapping
    public ComputerDto saveAvion(@Argument ComputerDto computerDto){
        return (ComputerDto) computerService.saveComputer((List<ComputerDto>) computerDto);
    }
}
