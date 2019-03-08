package co.com.lamejorcocinamodel.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long numeroMaximoComensales;

	private String ubicacion;

	@OneToMany(mappedBy = "mesa", fetch = FetchType.LAZY)
	private List<Factura> listFacturas;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the numeroMaximoComensales
	 */
	public Long getNumeroMaximoComensales() {
		return numeroMaximoComensales;
	}

	/**
	 * @param numeroMaximoComensales the numeroMaximoComensales to set
	 */
	public void setNumeroMaximoComensales(Long numeroMaximoComensales) {
		this.numeroMaximoComensales = numeroMaximoComensales;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the listFacturas
	 */
	public List<Factura> getListFacturas() {
		return listFacturas;
	}

	/**
	 * @param listFacturas the listFacturas to set
	 */
	public void setListFacturas(List<Factura> listFacturas) {
		this.listFacturas = listFacturas;
	}
}
