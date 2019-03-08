package co.com.lamejorcocinamodel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date fecha;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.EAGER)
	private Mesa mesa;

	@ManyToOne(fetch = FetchType.EAGER)
	private Camarero camarero;

	@OneToMany(mappedBy = "factura", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<DetalleFactura> listDetalleFactura;

	/**
	 * 
	 */
	public Factura() {
		cliente = new Cliente();
		mesa = new Mesa();
		camarero = new Camarero();
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
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the listDetalleFactura
	 */
	public List<DetalleFactura> getListDetalleFactura() {
		if (listDetalleFactura == null) {
			listDetalleFactura = new ArrayList<>();
		}
		return listDetalleFactura;
	}

	/**
	 * @param listDetalleFactura the listDetalleFactura to set
	 */
	public void setListDetalleFactura(List<DetalleFactura> listDetalleFactura) {
		this.listDetalleFactura = listDetalleFactura;
	}

	/**
	 * @return the mesa
	 */
	public Mesa getMesa() {
		return mesa;
	}

	/**
	 * @param mesa the mesa to set
	 */
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	/**
	 * @return the camarero
	 */
	public Camarero getCamarero() {
		return camarero;
	}

	/**
	 * @param camarero the camarero to set
	 */
	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

}
