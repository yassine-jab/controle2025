package org.example.controle2025.service;

import org.example.controle2025.dao.entities.Computer;
import org.example.controle2025.dto.ComputerDto;

import java.util.List;

public interface ComputerManager {
    public List<ComputerDto> getComputerbyProce(String proce);
    List<ComputerDto> saveComputer(List<ComputerDto> computerDtos);
}
