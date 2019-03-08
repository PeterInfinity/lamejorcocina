package co.com.lamejorcocinamodel.to;

import java.io.Serializable;
import java.util.Date;

import co.com.lamejorcocinamodel.model.Camarero;

/**
 * 
 * @author Peter
 *
 */
public class TotalVendidoCamarero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Camarero camarero;
	private Long numeroFacturas;
	private Long totalVendido;
	private Date fecha;

	public TotalVendidoCamarero() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param camarero
	 * @param numeroFacturas
	 * @param totalVendido
	 * @param fecha
	 */
	public TotalVendidoCamarero(Camarero camarero, Long numeroFacturas, Long totalVendido, Date fecha) {
		super();
		this.camarero = camarero;
		this.numeroFacturas = numeroFacturas;
		this.totalVendido = totalVendido;
		this.fecha = fecha;
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

	/**
	 * @return the numeroFacturas
	 */
	public Long getNumeroFacturas() {
		return numeroFacturas;
	}

	/**
	 * @param numeroFacturas the numeroFacturas to set
	 */
	public void setNumeroFacturas(Long numeroFacturas) {
		this.numeroFacturas = numeroFacturas;
	}

	/**
	 * @return the totalVendido
	 */
	public Long getTotalVendido() {
		return totalVendido;
	}

	/**
	 * @param totalVendido the totalVendido to set
	 */
	public void setTotalVendido(Long totalVendido) {
		this.totalVendido = totalVendido;
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
}
