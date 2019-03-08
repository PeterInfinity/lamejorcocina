package co.com.lamejorcocina;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.lamejorcocinamodel.bussines.CamareroDAO;
import co.com.lamejorcocinamodel.bussines.FacturaDAO;
import co.com.lamejorcocinamodel.model.Cocinero;
import co.com.lamejorcocinamodel.model.DetalleFactura;
import co.com.lamejorcocinamodel.model.Factura;
import co.com.lamejorcocinamodel.to.TotalVendidoCamarero;

@ManagedBean
@ViewScoped
public class KeyboardBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<DetalleFactura> listDetalleFactura = new ArrayList<>();
	private Factura factura = new Factura();;
	private DetalleFactura detalleFacturaNuevo = new DetalleFactura();
	private Cocinero cocinero = new Cocinero();
	private List<TotalVendidoCamarero> listTotalVendidoCamarero = new ArrayList<>();

	@EJB
	private FacturaDAO facturaDAO;
	@EJB
	private CamareroDAO camareroDAO;

	/**
	 * 
	 */
	public void registrarFactura() {
		System.out.println("KeyboardBean::registrarFactura");
		if (listDetalleFactura.isEmpty()) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null,
					new FacesMessage("Problem", "no se puede registrar la factura sin al menos 1 detalle"));
			return;
		}

		factura.setListDetalleFactura(listDetalleFactura);
		factura.setFecha(new Date());
		facturaDAO.create(factura);

		if (factura.getId() != null) {
			System.out.println("factura id = " + factura.getId());

			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage("Successful", "factura registrada correctamente"));
		}

		resetData();

	}

	/**
	 * 
	 */
	public void registrarDetalle() {
		detalleFacturaNuevo.setCocinero(cocinero);
		detalleFacturaNuevo.setFactura(factura);
		listDetalleFactura.add(detalleFacturaNuevo);

		cocinero = new Cocinero();
		detalleFacturaNuevo = new DetalleFactura();
	}

	/**
	 * 
	 */
	private void resetData() {
		listDetalleFactura = new ArrayList<>();
		factura = new Factura();
		detalleFacturaNuevo = new DetalleFactura();
		cocinero = new Cocinero();

	}

	/**
	 * 
	 */
	public void consultarTotalesCamarero() {
		listTotalVendidoCamarero = camareroDAO.consultarTotalVendido();
		System.out.println("totales por camarero::consulta");
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
	 * @return the listDetalleFactura
	 */
	public List<DetalleFactura> getListDetalleFactura() {
		return listDetalleFactura;
	}

	/**
	 * @param listDetalleFactura the listDetalleFactura to set
	 */
	public void setListDetalleFactura(List<DetalleFactura> listDetalleFactura) {
		this.listDetalleFactura = listDetalleFactura;
	}

	/**
	 * @return the detalleFacturaNuevo
	 */
	public DetalleFactura getDetalleFacturaNuevo() {
		return detalleFacturaNuevo;
	}

	/**
	 * @param detalleFacturaNuevo the detalleFacturaNuevo to set
	 */
	public void setDetalleFacturaNuevo(DetalleFactura detalleFacturaNuevo) {
		this.detalleFacturaNuevo = detalleFacturaNuevo;
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

	/**
	 * @return the listTotalVendidoCamarero
	 */
	public List<TotalVendidoCamarero> getListTotalVendidoCamarero() {
		return listTotalVendidoCamarero;
	}

	/**
	 * @param listTotalVendidoCamarero the listTotalVendidoCamarero to set
	 */
	public void setListTotalVendidoCamarero(List<TotalVendidoCamarero> listTotalVendidoCamarero) {
		this.listTotalVendidoCamarero = listTotalVendidoCamarero;
	}

}