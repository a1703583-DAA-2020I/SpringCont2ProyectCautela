package idat.edu.pe.Cautela.jpa.servicios;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Cautela.jpa.modelo.Usuarios;
import idat.edu.pe.Cautela.jpa.repositorios.UsuariosRepositorios;

@Service
@Transactional
public class UsuariosServicios {

	
	@Autowired
	private UsuariosRepositorios repositorio;
	
	public UsuariosServicios() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void crear(Usuarios nuevoUsuario) {
		
		repositorio.save(nuevoUsuario);
	}
	
	public void borrar(Integer codUsuarioEliminar) {
		
		repositorio.deleteById(codUsuarioEliminar);
	}
	
	public List<Usuarios> BuscarUsuarios(){
		
		List<Usuarios> lista= (List<Usuarios>) repositorio.findAll();
		return lista;
	}
	
	public Usuarios BuscarporCodigo(Integer CodigoBusqueda) {
	
		Usuarios usuario = repositorio.findById(CodigoBusqueda).get();
		return usuario;
	}
	
	public void actualizar(Usuarios usuarioActualizar) {
		
		Usuarios usuarioExistente = this.BuscarporCodigo(usuarioActualizar.getCodUsuario());
		usuarioExistente.setApeUsuario(usuarioActualizar.getApeUsuario());
		usuarioExistente.setCorreo(usuarioActualizar.getCorreo());
		repositorio.save(usuarioExistente);
				
	}

}
