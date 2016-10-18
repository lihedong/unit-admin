package unit.admin.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import unit.admin.service.DataMapperService;

public class InitTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
		DataMapperService dataMapperService=(DataMapperService) context.getBean("dataMapperService");
        List<Map<String, Object>> list=dataMapperService.selectByPrimaryKey("1047861961");
        System.out.println(list);
        context.close();
	}
}
