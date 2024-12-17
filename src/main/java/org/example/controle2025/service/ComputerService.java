package org.example.controle2025.service;

import org.example.controle2025.dao.entities.Computer;
import org.example.controle2025.dao.repository.ComputerRepository;
import org.example.controle2025.dto.ComputerDto;
import org.example.controle2025.map.ComputerMap;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ComputerService implements ComputerManager{
    private static ComputerRepository computerRepository;
    private ComputerMap computerMapper;

    @Override
    public  List<ComputerDto> getComputerbyProce(String proce) {
        List<Computer> computers = computerRepository.findByproce(proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(ComputerMap.fromcomputerTocomputerDto(computer));
        }
        return computerDtos;
    }

    @Override
    public List<ComputerDto> saveComputer(List<ComputerDto> computerDtos) {

            List<Computer> computers = new ArrayList<>();
            for (ComputerDto computerDto : computerDtos) {
                computers.add(computerMapper.fromcomputerDtoTocomputer(computerDto));
            }

            computerDtos = new ArrayList<>();
            for (Computer avion : computers) {
                computerDtos.add(computerMapper.fromcomputerTocomputerDto(avion));
            }
            return computerDtos;
        }
    }

