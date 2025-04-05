package com.infy.Fa1;

public class FaDTO {
	private int annotationId;
	private String annotationGroup;
	private String annotationName;
	private String annotationDes;
	public int getAnnotationId() {
		return annotationId;
	}
	public void setAnnotationId(int annotationId) {
		this.annotationId = annotationId;
	}
	public String getAnnotationGroup() {
		return annotationGroup;
	}
	public void setAnnotationGroup(String annotationGroup) {
		this.annotationGroup = annotationGroup;
	}
	public String getAnnotationName() {
		return annotationName;
	}
	public void setAnnotationName(String annotationName) {
		this.annotationName = annotationName;
	}
	public String getAnnotationDes() {
		return annotationDes;
	}
	public void setAnnotationDes(String annotationDes) {
		this.annotationDes = annotationDes;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
