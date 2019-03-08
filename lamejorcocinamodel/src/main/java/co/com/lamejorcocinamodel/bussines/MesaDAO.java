package co.com.lamejorcocinamodel.bussines;

import javax.ejb.Local;

import co.com.lamejorcocinamodel.dao.GenericDao;
import co.com.lamejorcocinamodel.model.Mesa;

@Local
public interface MesaDAO extends GenericDao<Mesa> {

}
