package idat.edu.pe.Cautela.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodUsuario")
	private Integer CodUsuario;
	
	@Column(name="ApeUsuario")
	private String ApeUsuario;
	
	@Column(name="NomUsuario")
	private String NomUsuario;
	
	@Column(name="CiudUsuario")
	private String CiudUsuario;
	
	@Column(name="Perfil")
	private String Perfil;
	
	@Column(name="Correo")
	private String Correo;
	
	@Column(name="ClaveUsuario")
	private String ClaveUsuario;
	
	
	
	public Usuarios() {
		// TODO Auto-generated constructor stub
	}



	public Usuarios(Integer codUsuario, String apeUsuario, String nomUsuario, String ciudUsuario, String perfil,
			String correo, String claveUsuario) {
		super();
		CodUsuario = codUsuario;
		ApeUsuario = apeUsuario;
		NomUsuario = nomUsuario;
		CiudUsuario = ciudUsuario;
		Perfil = perfil;
		Correo = correo;
		ClaveUsuario = claveUsuario;
	}



	public Integer getCodUsuario() {
		return CodUsuario;
	}



	public void setCodUsuario(Integer codUsuario) {
		CodUsuario = codUsuario;
	}



	public String getApeUsuario() {
		return ApeUsuario;
	}



	public void setApeUsuario(String apeUsuario) {
		ApeUsuario = apeUsuario;
	}



	public String getNomUsuario() {
		return NomUsuario;
	}



	public void setNomUsuario(String nomUsuario) {
		NomUsuario = nomUsuario;
	}



	public String getCiudUsuario() {
		return CiudUsuario;
	}



	public void setCiudUsuario(String ciudUsuario) {
		CiudUsuario = ciudUsuario;
	}



	public String getPerfil() {
		return Perfil;
	}



	public void setPerfil(String perfil) {
		Perfil = perfil;
	}



	public String getCorreo() {
		return Correo;
	}



	public void setCorreo(String correo) {
		Correo = correo;
	}



	public String getClaveUsuario() {
		return ClaveUsuario;
	}



	public void setClaveUsuario(String claveUsuario) {
		ClaveUsuario = claveUsuario;
	}



	@Override
	public String toString() {
		return "Usuarios [CodUsuario=" + CodUsuario + ", ApeUsuario=" + ApeUsuario + ", NomUsuario=" + NomUsuario
				+ ", CiudUsuario=" + CiudUsuario + ", Perfil=" + Perfil + ", Correo=" + Correo + ", ClaveUsuario="
				+ ClaveUsuario + "]";
	}

	
	
	
	
}
