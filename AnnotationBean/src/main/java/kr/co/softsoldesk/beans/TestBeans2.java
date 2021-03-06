package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class TestBeans2 {
   @Value("100")
   private int data1;
   @Value("Soldesk")
   private String data2;
   @Autowired
   private DataBean3 data3;
   @Autowired
   private DataBean4 data4;

   public TestBeans2() {
   }

   public TestBeans2(int data1, String data2, DataBean3 data3, DataBean4 data4) {
      this.data1 = data1;
      this.data2 = data2;
      this.data3 = data3;
      this.data4 = data4;
   }

   public int getData1() {
      return data1;
   }

   public String getData2() {
      return data2;
   }

   public DataBean3 getData3() {
      return data3;
   }

   public DataBean4 getData4() {
      return data4;
   }

}