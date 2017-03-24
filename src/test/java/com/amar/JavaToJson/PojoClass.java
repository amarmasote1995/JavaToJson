package com.amar.JavaToJson;

public class PojoClass {

	
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
