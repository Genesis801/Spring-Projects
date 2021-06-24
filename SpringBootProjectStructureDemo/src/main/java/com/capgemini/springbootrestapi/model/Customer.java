package com.capgemini.springbootrestapi.model;

public class Customer {

		private int custId;
		private String custName;
		private String custEmail;
		private int custMobileNo;
		public Customer(int custId, String custName, String custEmail, int custMobileNo) {
			super();
			this.custId = custId;
			this.custName = custName;
			this.custEmail = custEmail;
			this.custMobileNo = custMobileNo;
		}
		public Customer() {
			super();
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustEmail() {
			return custEmail;
		}
		public void setCustEmail(String custEmail) {
			this.custEmail = custEmail;
		}
		public int getCustMobileNo() {
			return custMobileNo;
		}
		public void setCustMobileNo(int custMobileNo) {
			this.custMobileNo = custMobileNo;
		}
		
		
}
