package co.com.lamejorcocinamodel.bussines;

import javax.ejb.Local;

import co.com.lamejorcocinamodel.dao.GenericDao;
import co.com.lamejorcocinamodel.model.Cocinero;

@Local
public interface CocineroDAO extends GenericDao<Cocinero> {

}
