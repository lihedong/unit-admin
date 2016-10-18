package unit.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unit.admin.dao.IDataHandler;

@Service
public class DataMapperService implements IDataHandler {
	@Autowired
	private IDataHandler dataMapper;

	public List<Map<String, Object>> selectByPrimaryKey(String key) {
		List<Map<String, Object>> list = dataMapper.selectByPrimaryKey(key);
		return list;
	}

}
