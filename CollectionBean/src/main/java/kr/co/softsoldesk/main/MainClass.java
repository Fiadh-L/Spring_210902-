package kr.co.softsoldesk.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.CollectionBean;
import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#1
		TestBean t1=ctx.getBean("t1", TestBean.class);
		List<String> list1 = t1.getList1();
		
		for(String str: list1) {
			System.out.printf("list1 : %s\n", str);
		}
		System.out.println("------------------------------------");
		//#2
		List<Integer> list2 = t1.getList2();
		
		for(int itg: list2) {
			System.out.printf("list2 : %d\n", itg);
		}
		System.out.println("------------------------------------");
		//#3
		List<DataBean> list3 = t1.getList3();
		
		for(DataBean db: list3) {
			System.out.printf("list3 : %s\n", db);
		}
		
		System.out.println("------------------------------------");
		//#4
		Set<String> set1 = t1.getSet1();
		
		for(String sst: set1) {
			System.out.printf("set1 : %s\n", sst);
		}
		
		System.out.println("------------------------------------");
		//#5
		Set<Integer> set2 = t1.getSet2();
		
		for(Integer itg: set2) {
			System.out.printf("set2 : %d\n", itg);
		}
		
		System.out.println("------------------------------------");
		//#6
		Set<DataBean> set3 = t1.getSet3();
		
		for(DataBean dbs: set3) {
			System.out.printf("set3 : %s\n", dbs);
		}
		
		System.out.println("------------------------------------");
		//#7
		Map<String, Object> map1 = t1.getMap1();
		
		String a1=(String)map1.get("a1");
		int a2=(Integer)map1.get("a2");
		DataBean a3=(DataBean)map1.get("a3");
		DataBean a4=(DataBean)map1.get("a4");
		List<String> a5=(List<String>)map1.get("a5");
		
		System.out.printf("a1 : %s\n",a1);
		System.out.printf("a2 : %d\n",a2);
		System.out.printf("a3 : %s\n",a3);
		System.out.printf("a4 : %s\n",a4);
		
		for(String str:a5) {
			System.out.printf("a5 : %s\n",str);
		}
		
		System.out.println("------------------------------------");
		//#6
		Properties prop1 = t1.getProp1();
		
		String p1=prop1.getProperty("p1");
		String p2=prop1.getProperty("p2");
		String p3=prop1.getProperty("p3");
		
		System.out.printf("p1 : %s\n", p1);
		System.out.printf("p2 : %s\n", p2);
		System.out.printf("p3 : %s\n", p3);

		System.out.println("방법 1");
	      Iterator<String> it = map1.keySet().iterator();
	      
	      while(it.hasNext()) {
	         
	         String key = it.next();
	         System.out.println("key값 : "+key+"|||| value값 : "+map1.get(key));
	      }
	      
	      System.out.println("방법 2");
	      
	      for(String s : map1.keySet()) {
	         System.out.println(map1.get(s));
	      }
	      
	      System.out.println("방법 3");
	      
	      for(Map.Entry<String,Object> map : map1.entrySet()) {
	         System.out.println(map.getKey()+" = "+map.getValue());
	      }
	      
	      System.out.println("------------------------------------");
			//#2
	      CollectionBean addr=ctx.getBean("addr", CollectionBean.class);
			List<String> addrList = (List<String>)addr.getAddressList();
			
			for(String add: addrList) {
				System.out.printf("cbaddr : %s\n", add);
			}
			
		ctx.close();
		
	}

}
