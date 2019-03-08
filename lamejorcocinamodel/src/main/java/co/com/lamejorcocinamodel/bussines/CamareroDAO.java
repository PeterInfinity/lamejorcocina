package co.com.lamejorcocinamodel.bussines;

import java.util.List;

import javax.ejb.Local;

import co.com.lamejorcocinamodel.dao.GenericDao;
import co.com.lamejorcocinamodel.model.Camarero;
import co.com.lamejorcocinamodel.to.TotalVendidoCamarero;

@Local
public interface CamareroDAO extends GenericDao<Camarero> {

	List<TotalVendidoCamarero> consultarTotalVendido();

}
