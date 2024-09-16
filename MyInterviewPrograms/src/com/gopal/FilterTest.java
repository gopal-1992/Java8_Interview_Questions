package com.gopal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterTest {
	public static List<Map<String, Object>> filterResult(List<Map<String, Object>> data, Map<String, Filter> filters) {
		
		
	       return data.stream()
	                  .filter(item -> {
	                      for (Map.Entry<String, Filter> entry : filters.entrySet()) {
	                          String fKey = entry.getKey();
	                          Filter filter = entry.getValue();
	                          if (!filter.getValues().stream().anyMatch(val -> {
	                              if (nullCheck(val) && nullCheck(item.get(fKey))) return true;
	                              if (nullCheck(val) || nullCheck(item.get(fKey))) return false;
	                              return item.get(fKey).toString().equals(val.toString());
	                          })) {
	                              return false;
	                          }
	                      }
	                      return true;
	                  })
	                  .collect(Collectors.toList());
	   }
	   private static boolean nullCheck(Object obj) {
	       return obj == null || obj.toString().isEmpty();
	   }
	   public static class Filter {
	       private List<String> values;
	       public List<String> getValues() {
	           return values;
	       }
	       public void setValues(List<String> values) {
	           this.values = values;
	       }
	   }
	   public static void main(String[] args) {
		  
		   
		   Map<String, Object> map = new HashMap<>();
		   Employee emp = new Employee();
		   emp.setAge(29);
		   emp.setCity("BLR");
		   emp.setName("BJP");
		   map.put("101", emp);
		   List<Map<String, Object>> data = new ArrayList<>();
		   data.add(map);
		   
		   Map<String, Filter> filter = new HashMap<>();
		   Filter fil = new Filter();
		   fil.setValues(Arrays.asList("1","2","3"));
		   filter.put("originId", fil);
		   
		   System.out.println("fillter data "+  filterResult(data, filter));
	   }

}
