package tw.elliot.util;

import java.util.ArrayList;

import org.junit.Test;

import tw.elliot.model.Page;
import tw.elliot.model.User;

public class JsonUtilsTest {

	@Test
	public void test() {
		Page<User> page = new Page<User>();
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(new User("1","A"));
		users.add(new User("2","B"));
		
		page.setResults(users);
		page.setPageSize(10);
		page.setTotalCount(100);
		System.out.println(JsonUtils.toJson(page));
	}

}
