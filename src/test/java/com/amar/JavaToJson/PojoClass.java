/*
 * This class is used as POJO class for the PropertyToJson.java class which 
 * converts property file into Json body
 * @author Amar Masote
 * @version 24-03-2017 
 * 
 */ 
package com.amar.JavaToJson;
 

public class PojoClass {

	/**
	 * This class contains the same variables present in property file as key field.
	 */
	
		public String userName;
		public String idNo;
		
		

        public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getIdNo() {
			return idNo;
		}


		public void setIdNo(String idNo) {
			this.idNo = idNo;
		}


		public PojoClass(String userName, String idNo) {
			super();
			this.userName = userName;
			this.idNo = idNo;
		}


		
		public String toString()
		   {
		      return "PojoClass [userName=" + userName + ", idNo=" + idNo +  "]";
		   }

}
