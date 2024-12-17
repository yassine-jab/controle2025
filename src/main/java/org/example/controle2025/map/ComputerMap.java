package org.example.controle2025.map;

import org.example.controle2025.dao.entities.Computer;
import org.example.controle2025.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMap {
    private final ModelMapper mapper = new ModelMapper();
    public Computer fromcomputerDtoTocomputer(ComputerDto computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public static ComputerDto fromcomputerTocomputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }

}