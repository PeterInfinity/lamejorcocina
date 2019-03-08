package co.com.lamejorcocinamodel.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

@Local
public interface GenericDao<T> {

	long countAll(Map<String, Object> params);

	T create(T t);

	void delete(Object id);

	T find(Object id);

	T update(T t);

	List<T> findAll(Map<String, Object> params, Map<String, Object> orderParams);
}
