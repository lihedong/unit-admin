package unit.admin.dao;

import java.util.List;
import java.util.Map;

public interface IDataHandler {

	/**
	 * @author jacky
	 * @return list
	 * @param key
	 */
	public List<Map<String, Object>> selectByPrimaryKey(String key);
	

}
