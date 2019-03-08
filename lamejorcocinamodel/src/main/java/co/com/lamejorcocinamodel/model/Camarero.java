package co.com.lamejorcocinamodel.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Camarero extends Persona {

	@OneToMany(mappedBy = "camarero", fetch = FetchType.LAZY)
	private List<Factura> listFacturas;

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
