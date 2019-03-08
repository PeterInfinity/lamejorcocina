package co.com.lamejorcocinamodel.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Persona {

	private String observaciones;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Factura> listFacturas;

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
