package co.com.lamejorcocinamodel.bussines;

import javax.ejb.Stateless;

import co.com.lamejorcocinamodel.dao.GenericDaoImpl;
import co.com.lamejorcocinamodel.model.Factura;

@Stateless
public class FacturaDAOImpl extends GenericDaoImpl<Factura> implements FacturaDAO {

}
