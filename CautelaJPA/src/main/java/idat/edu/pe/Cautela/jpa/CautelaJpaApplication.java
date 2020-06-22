package idat.edu.pe.Cautela.jpa;

import java.util.List;

import javax.swing.text.TextAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.Cautela.jpa.modelo.Usuarios;
import idat.edu.pe.Cautela.jpa.servicios.UsuariosServicios;

@SpringBootApplication
public class CautelaJpaApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx = SpringApplication.run(CautelaJpaApplication.class, args);	
	// testCrearUsuario(ctx);
	
	//testBuscarUsuario(ctx);
	
	testActualizarUsuario(ctx);
	
	}

	
	private static void testCrearUsuario(ConfigurableApplicationContext ctx) {
		
		UsuariosServicios servicio = ctx.getBean(UsuariosServicios.class);
		
		
		Usuarios nuevoUsuario= new Usuarios(4, "Carlsen Carlsen", "Magnus", "Noruega", "Cliente", "Magnus@Gmail.com","457");
		servicio.crear(nuevoUsuario);
	}
	
	
	
	private static void testBuscarUsuario(ConfigurableApplicationContext ctx)
	{
		UsuariosServicios servicio = ctx.getBean(UsuariosServicios.class);
		
		 List<Usuarios> listaUsuarios = servicio.BuscarUsuarios();
		
		 System.out.println("LISTA DE USUARIOS DE LA BASE DE DATOS CAUTELA:   ");
		 System.out.println(listaUsuarios);
		
	}
	
	
	private static void testActualizarUsuario(ConfigurableApplicationContext ctx) {
		
		UsuariosServicios servicio = ctx.getBean(UsuariosServicios.class);
		
		Usuarios usuarioActualizar = new Usuarios(1, "Urbina Torres", "Lester", "Bakú", "Cliente", "Kasparov@gmail.com", "784");
		servicio.actualizar(usuarioActualizar);
	}
	
	
	

}
