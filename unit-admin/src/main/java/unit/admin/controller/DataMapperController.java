package unit.admin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.internal.logging.Logger;
import unit.admin.service.DataMapperService;


@RestController
@RequestMapping("/db")
public class DataMapperController {
	private static final Logger logger = Logger.getLogger(DataMapperController.class);

	@Autowired
	private DataMapperService dataMapperService;

	@RequestMapping(value = "/select/{key}", method = RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> selectDataByPrimaryKey(@PathVariable("key") String key) {
		List<Map<String, Object>> list = dataMapperService.selectByPrimaryKey(key);
		logger.info("result:key=" + key + ";size=" + list.size());
		return list;
	}

	/**
	 * 测试示例：xxx:xxx/projectName/query?key=xxx
	 * */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public String queryOne(HttpServletRequest request) {
		String key = request.getParameter("key");
		logger.info("result:key=" + key);
		return key;
	}

}
