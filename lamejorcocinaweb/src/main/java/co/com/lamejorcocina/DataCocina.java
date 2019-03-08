package co.com.lamejorcocina;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import co.com.lamejorcocinamodel.bussines.CamareroDAO;
import co.com.lamejorcocinamodel.bussines.CocineroDAO;
import co.com.lamejorcocinamodel.bussines.MesaDAO;
import co.com.lamejorcocinamodel.model.Camarero;
import co.com.lamejorcocinamodel.model.Cocinero;
import co.com.lamejorcocinamodel.model.Mesa;

@ManagedBean(name = "DataCocina")
@SessionScoped
public class DataCocina {

	@EJB
	private CamareroDAO camareroDAO;
	@EJB
	private MesaDAO mesaDAO;
	@EJB
	private CocineroDAO cocineroDAO;

	private List<Camarero> listCamareros;
	private List<Mesa> listMesa;
	private List<Cocinero> listCocinero;

	@PostConstruct
	public void init() {
		listCocinero = cocineroDAO.findAll(null, null);
		listCamareros = camareroDAO.findAll(null, null);
		listMesa = mesaDAO.findAll(null, null);
	}

	/**
	 * @return the listCamareros
	 */
	public List<Camarero> getListCamareros() {
		return listCamareros;
	}

	/**
	 * @param listCamareros the listCamareros to set
	 */
	public void setListCamareros(List<Camarero> listCamareros) {
		this.listCamareros = listCamareros;
	}

	/**
	 * @return the listMesa
	 */
	public List<Mesa> getListMesa() {
		return listMesa;
	}

	/**
	 * @param listMesa the listMesa to set
	 */
	public void setListMesa(List<Mesa> listMesa) {
		this.listMesa = listMesa;
	}

	/**
	 * @return the listCocinero
	 */
	public List<Cocinero> getListCocinero() {
		return listCocinero;
	}

	/**
	 * @param listCocinero the listCocinero to set
	 */
	public void setListCocinero(List<Cocinero> listCocinero) {
		this.listCocinero = listCocinero;
	}
}
