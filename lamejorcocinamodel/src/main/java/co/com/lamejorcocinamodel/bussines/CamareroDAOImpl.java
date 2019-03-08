package co.com.lamejorcocinamodel.bussines;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import co.com.lamejorcocinamodel.dao.GenericDaoImpl;
import co.com.lamejorcocinamodel.model.Camarero;
import co.com.lamejorcocinamodel.to.TotalVendidoCamarero;

/**
 * 
 * @author Peter
 *
 */
@Stateless
public class CamareroDAOImpl extends GenericDaoImpl<Camarero> implements CamareroDAO {

	/**
	 * @author Peter
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TotalVendidoCamarero> consultarTotalVendido() {
		StringBuilder sql = new StringBuilder();
		sql.append(" select p.id, f.fecha, count(f.id), sum(df.importe) from persona p ");
		sql.append(" left join factura f on p.id = f.camarero_id ");
		sql.append(" left join detallefactura df on df.factura_id = f.id ");
		sql.append(" where dtype = 'Camarero' group by f.fecha, p.id order by p.id");

		Query query = em.createNativeQuery(sql.toString());
		List<Object[]> resultList = query.getResultList();
		if (resultList == null || resultList.isEmpty()) {
			return new ArrayList<>();
		}

		List<TotalVendidoCamarero> listTotalVendidoCamarero = new ArrayList<>();
		resultList.forEach(t -> listTotalVendidoCamarero.add(new TotalVendidoCamarero(//
				find(Long.parseLong(t[0].toString())), //
				Long.parseLong(t[2] != null ? t[2].toString() : "0"), //
				Long.parseLong(t[3] != null ? t[3].toString() : "0"), //
				((Date) t[1])))//
		);

		return listTotalVendidoCamarero;
	}
}
