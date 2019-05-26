package ua.selftaught.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.selftaught.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
