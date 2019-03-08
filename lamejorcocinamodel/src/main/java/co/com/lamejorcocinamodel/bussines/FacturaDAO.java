package co.com.lamejorcocinamodel.bussines;

import javax.ejb.Local;

import co.com.lamejorcocinamodel.dao.GenericDao;
import co.com.lamejorcocinamodel.model.Factura;

@Local
public interface FacturaDAO extends GenericDao<Factura> {

}
