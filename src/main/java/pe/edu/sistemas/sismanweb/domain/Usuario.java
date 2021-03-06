package pe.edu.sistemas.sismanweb.domain;
// Generated 31/08/2017 12:03:58 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "modelogeneralfisi")
public class Usuario implements java.io.Serializable {

	private Integer idUsuario;
	private Persona persona;
	private TipoUsuario tipoUsuario;
	private Integer usuarioActivo;
	private int sistemaIdSistema;

	public Usuario() {
	}

	public Usuario(Persona persona, TipoUsuario tipoUsuario, int sistemaIdSistema) {
		this.persona = persona;
		this.tipoUsuario = tipoUsuario;
		this.sistemaIdSistema = sistemaIdSistema;
	}

	public Usuario(Persona persona, TipoUsuario tipoUsuario, Integer usuarioActivo, int sistemaIdSistema) {
		this.persona = persona;
		this.tipoUsuario = tipoUsuario;
		this.usuarioActivo = usuarioActivo;
		this.sistemaIdSistema = sistemaIdSistema;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_USUARIO", unique = true, nullable = false)
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSONA_ID_PERSONA", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIPO_USUARIO_IDTIPO_USUARIO", nullable = false)
	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Column(name = "USUARIO_ACTIVO")
	public Integer getUsuarioActivo() {
		return this.usuarioActivo;
	}

	public void setUsuarioActivo(Integer usuarioActivo) {
		this.usuarioActivo = usuarioActivo;
	}

	@Column(name = "SISTEMA_ID_SISTEMA", nullable = false)
	public int getSistemaIdSistema() {
		return this.sistemaIdSistema;
	}

	public void setSistemaIdSistema(int sistemaIdSistema) {
		this.sistemaIdSistema = sistemaIdSistema;
	}

}
