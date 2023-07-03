package mx.com.italika.service.repository;

import mx.com.italika.service.entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

@Override
    List<Cliente> findAll();
}
