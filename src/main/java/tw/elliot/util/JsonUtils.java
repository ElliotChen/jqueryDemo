package tw.elliot.util;

import org.codehaus.jackson.map.ObjectMapper;

import tw.elliot.model.Page;
import tw.elliot.to.DataTableTO;

public class JsonUtils {
//	private static JsonMapper mapper = JsonMapper.buildNonDefaultMapper();
	public static final String toJson(Page<?> page, String sEcho) {
		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(Feature., false);
		String result = "Fail";
		try {
			result = mapper.writeValueAsString(toDataTableTO(page, sEcho));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	protected static <T> DataTableTO<T> toDataTableTO(Page<T> page, String sEcho) {
		DataTableTO<T> to = new DataTableTO<T>();
		to.setAaData(page.getResults());
		to.setiTotalDisplayRecords(page.getPageSize());
		to.setiTotalRecords(page.getTotalCount());
		to.setsEcho(sEcho);
		return to;
	}
}
