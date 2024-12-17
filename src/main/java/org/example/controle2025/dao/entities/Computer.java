package org.example.controle2025.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id_pc;
        String proc;
        int ram;
        String harddrive;
        double price;
        String macAddress;

}

