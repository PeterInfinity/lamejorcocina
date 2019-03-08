package co.com.lamejorcocinamodel.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DetalleFactura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	private Factura factura;

	private String plato;

	private Long importe;

	@ManyToOne(fetch = FetchType.EAGER)
	private Cocinero cocinero;

	public DetalleFactura() {
		cocinero = new Cocinero();
	}

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
	 * @return the factura
	 */
	public Factura getFactura() {
		return factura;
	}

	/**
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	/**
	 * @return the plato
	 */
	public String getPlato() {
		return plato;
	}

	/**
	 * @param plato the plato to set
	 */
	public void setPlato(String plato) {
		this.plato = plato;
	}

	/**
	 * @return the importe
	 */
	public Long getImporte() {
		return importe;
	}

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(Long importe) {
		this.importe = importe;
	}

	/**
	 * @return the cocinero
	 */
	public Cocinero getCocinero() {
		return cocinero;
	}

	/**
	 * @param cocinero the cocinero to set
	 */
	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

}
