package co.com.lamejorcocinamodel.bussines;

import javax.ejb.Stateless;

import co.com.lamejorcocinamodel.dao.GenericDaoImpl;
import co.com.lamejorcocinamodel.model.DetalleFactura;

@Stateless
public class DetalleFacturaDAOImpl extends GenericDaoImpl<DetalleFactura> implements DetalleFacturaDAO {

}
