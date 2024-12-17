package org.example.controle2025.dao.repository;

import org.example.controle2025.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    public   List<Computer> findByproce(String proce);
}
