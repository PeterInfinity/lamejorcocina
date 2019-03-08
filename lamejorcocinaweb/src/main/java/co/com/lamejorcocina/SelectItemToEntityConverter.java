package co.com.lamejorcocina;

import java.util.List;
import java.util.function.Predicate;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "SelectItemToEntityConverter")
public class SelectItemToEntityConverter<T> implements Converter {

	@Override
	public Object getAsObject(FacesContext ctx, UIComponent comp, String value) {
		Object o = null;
		if (!(value == null || value.isEmpty())) {
			o = this.getSelectedItemAsEntity(comp, value);
		}
		return o;
	}

	@Override
	public String getAsString(FacesContext ctx, UIComponent comp, Object value) {
		String s = "";
		if (value != null) {
			@SuppressWarnings("unchecked")
			T type = ((T) value);
			if (type.toString() != null) {
				s = type.toString();
			}
		}
		return s;
	}

	@SuppressWarnings("unchecked")
	private T getSelectedItemAsEntity(UIComponent comp, String value) {
		T item = null;

		List<T> selectItems = null;
		for (UIComponent uic : comp.getChildren()) {
			if (uic instanceof UISelectItems) {
				selectItems = (List<T>) ((UISelectItems) uic).getValue();

				if (value != null && selectItems != null && !selectItems.isEmpty()) {
					Predicate<T> predicate = i -> i.toString().equals(value);
					item = selectItems.stream().filter(predicate).findFirst().orElse(null);
				}
			}
		}

		return item;
	}
}
