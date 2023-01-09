package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("comapany name is RSMIPL");
	}
private void companyID() {
	System.out.println("company id is 1234");
}
private void companyAddress() {
	System.out.println("company address is no 12 4th street OMR chennai-600078");
}
public static void main(String[] args) {
	CompanyInfo companyDetails=new CompanyInfo();
	companyDetails.companyName();
	companyDetails.companyID();
	companyDetails.companyAddress();
}
}
