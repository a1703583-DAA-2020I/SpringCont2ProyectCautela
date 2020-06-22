package idat.edu.pe.Cautela.jpa.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.Cautela.jpa.modelo.Usuarios;

@Repository
public interface UsuariosRepositorios extends CrudRepository<Usuarios, Integer> {

}
