package org.example.controle2025.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;

@Builder
public class ComputerDto {

    String proc;
    int ram;
    String harddrive;
    double price;
}
