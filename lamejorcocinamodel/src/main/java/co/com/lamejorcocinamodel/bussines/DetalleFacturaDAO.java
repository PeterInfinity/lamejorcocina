package co.com.lamejorcocinamodel.bussines;

import javax.ejb.Local;

import co.com.lamejorcocinamodel.dao.GenericDao;
import co.com.lamejorcocinamodel.model.DetalleFactura;

@Local
public interface DetalleFacturaDAO extends GenericDao<DetalleFactura> {

}
