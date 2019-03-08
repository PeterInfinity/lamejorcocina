package co.com.lamejorcocinamodel.bussines;

import javax.ejb.Stateless;

import co.com.lamejorcocinamodel.dao.GenericDaoImpl;
import co.com.lamejorcocinamodel.model.Cocinero;

@Stateless
public class CocineroDAOImpl extends GenericDaoImpl<Cocinero> implements CocineroDAO {

}
