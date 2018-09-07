package controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	public void setAsText(String studentName) {
		if(!(studentName.contains("Mr.") || studentName.contains("Ms."))) {
			studentName="Ms."+ studentName;
		setValue(studentName);	
		}
		else
			setValue(studentName);
	}

}
