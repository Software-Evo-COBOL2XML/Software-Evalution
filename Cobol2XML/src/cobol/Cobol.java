/*
 * @(#)Cobol.java	 0.0.1

 *
 * Copyright (c) 2019 Julian M. Bass
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package cobol;

import java.util.ArrayList;

import utensil.*;

/**
 * @author stephenmccallion
 *
 */
public class Cobol implements PubliclyCloneable {
	protected String commentLine;
	protected String program_id;
	protected String sectionName;
	protected String divisionName;
	protected int dayDateWritten = 0;
	protected String monthDateWritten;
	protected int yearDateWritten = 0;
	protected String constantName;
	protected double constantValue; 
	protected String remarks;
	protected String mainLogic;
    protected int lineNumber = 0;
    protected String decimalToBase;
    protected String baseToDecimal;
    protected String statement;
    protected String perform;
    
    protected String variableName;
    protected String HexValueData;
    protected String variableType;
    protected int variableRange;
    protected int numVar;
    protected String numVarName;
    protected boolean redefine;
    protected String redefinedVariableName;
    protected String entry_char;
    protected String hexDecTable;
    
    
    
    
    public String getHexDecTable() {
		return hexDecTable;
	}

	public void setHexDecTable(String hexDecTable) {
		this.hexDecTable = hexDecTable;
	}

	public String getEntry_char() {
		return entry_char;
	}

	public void setEntry_char(String entry_char) {
		this.entry_char = entry_char;
	}

	public boolean isRedefine() {
		return redefine;
	}

	public void setRedefine(boolean redefine) {
		this.redefine = redefine;
	}

	public String getRedefinedVariableName() {
		return redefinedVariableName;
	}

	public void setRedefinedVariableName(String redefinedVariableName) {
		this.redefinedVariableName = redefinedVariableName;
	}

	public String getNumVarName() {
		return numVarName;
	}

	public void setNumVarName(String numVarName) {
		this.numVarName = numVarName;
	}

	public int getNumVar() {
		return numVar;
	}

	public void setNumVar(int numVar) {
		this.numVar = numVar;
	}

	public int getVariableRange() {
		return variableRange;
	}

	public void setVariableRange(int variableRange) {
		this.variableRange = variableRange;
	}
    
    public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}


	public String getHexValueData() {
		return HexValueData;
	}

	public void setHexValueData(String hexValueData) {
//		System.out.println(getHexValueData());
		HexValueData = hexValueData;
	}

	public String getVariableType() {
		return variableType;
	}

	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}

	public String getBaseToDecimal() {
    	return baseToDecimal;
    }
    
    public void setBaseToDecimal(String baseToDecimal) {
//    	System.out.println("setBaseToDecimal(): " + baseToDecimal);
//    	System.out.println("setBaseToDecimal(): " + getBaseToDecimal());
    	this.baseToDecimal = baseToDecimal;
    }
    
    public String getIfStatement() {
		return ifStatement;
	}
	public void setIfStatement(String ifStatement) {
		this.ifStatement = ifStatement;
	}

	protected String divide;
    protected String search;
    protected String subtraction;
    protected String ifStatement;
    
    public String getSubtraction() {
		return subtraction;
	}
	public void setSubtraction(String substraction) {
		this.subtraction = substraction;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getDivide() {
		return divide;
	}
	public void setDivide(String divide) {
		this.divide = divide;
	}
    
    
	public String getPerform() {
		return perform;
	}
	public void setPerform(String perform) {
		this.perform = perform;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	

    
    public String getMainLogic() {
		return mainLogic;
	}
	public void setMainLogic(String mainLogic) {
		this.mainLogic = mainLogic;
	}
	public String getDecimalToBase() {
		return decimalToBase;
	}
	public void setDecimalToBase(String decimalToBase) {
		this.decimalToBase = decimalToBase;
	}
    
    
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	              
	
	
	public String getProgram_id() {
		return program_id;
	}
	public void setProgram_id(String program_id) {
		this.program_id = program_id;
	}
	public String getConstantName() {
		return constantName;
	}
	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}
	public double getConstantValue() {
		return constantValue;
	}
	public void setConstantValue(double constantValue) {
		this.constantValue = constantValue;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	/**
	 * Return a copy of this object.
	 *
	 * @return a copy of this object
	 */
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError();
		}
	}
	/**
	 * Compares two objects for equality, treating nulls carefullly,
	 * and relying on the first object's implementation of <code>
	 * equals()</code>.
	 *
	 * @param   o1   one object
	 *
	 * @param   o2   the other
	 *
	 * @return  <code>true</code> if the objects are equal and
	 *          <code>false</code> otherwise.
	 */
	public static boolean equal(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return o1 == null && o2 == null;
		}
		return o1.equals(o2);
	}
	/**
	 * Compares this object against the specified object. The 
	 * result is <code>true</code> if and only if the argument is 
	 * not <code>null</code> and is a <code>Coffee</code> object 
	 * whose attributes all equal this object's attributes.
	 *
	 * @param   o   the object to compare with.
	 *
	 * @return  <code>true</code> if the objects are equal and
	 *          <code>false</code> otherwise.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof Cobol)) {
			return false;
		}
		Cobol c = (Cobol) o;
		
		
		if (!equal(program_id, c.program_id)) {
			return false;
		}
		
		if (!equal(sectionName, c.sectionName)) {
			return false;
		}
		

		return true;
	}

	/**
	 * Return line of commented text from the COBOL program.
	 *
	 * @return line of commented text from the COBOL program
	 */
	public String getCommentLine() {
		//System.out.println("getComment()");
		return commentLine;
	}
	

	/**
	 * Return the name of this COBOL program.
	 *
	 * @return the name of this COBOL program
	 */
	public String getProgram_ID() {
		return program_id;
	}

	/**
	 * Return the section name.
	 *
	 * @return the section name
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * Return the division name.
	 *
	 * @return the division name
	 */
	public String getDivisionName() {
		return divisionName;
	}
	
	/**
	 * Return the dayDateWritten of this COBOL program.
	 *
	 * @return the dayDateWritten of this COBOL program
	 */
	public int getDayDateWritten() {
		return dayDateWritten;
	}

	
	/**
	 * Return the monthWritten of this COBOL program.
	 *
	 * @return the monthWritten of this COBOL program
	 */
	public String getMonthDateWritten() {
		return monthDateWritten;
	}
	
	/**
	 * Return the dayDateWritten of this COBOL program.
	 *
	 * @return the dayDateWritten of this COBOL program
	 */
	public int getYearDateWritten() {
		return yearDateWritten;
	}
	
	/**
	 * Set a line of commented text from the COBOL program.
	 *
	 * @return line of commented text from the COBOL program
	 */
	public void setCommentLine(String commentLine) {
		//System.out.println("setComment(): " + commentLine);
		this.commentLine = commentLine;
	}



	/**
	 * Set the name of this cobol file.
	 *
	 * @param   String   the name
	 */
	public void setProgram_ID(String program_idString) {
		this.program_id = program_idString;
	}

	/**
	 * Set the dayDateWritten of this COBOL program.
	 *
	 * @param the dayDateWritten of this COBOL program
	 */
	public void setDayDateWritten(int dayDateWritten) {
		this.dayDateWritten = dayDateWritten;
	}
	
	/**
	 * Return the monthWritten of this COBOL program.
	 *
	 * @return the monthWritten of this COBOL program
	 */
	public void setMonthDateWritten(String monthDateWritten) {
		this.monthDateWritten = monthDateWritten;
	}
	
	/**
	 * Set the yearDateWritten of this COBOL program.
	 *
	 * @param the yearDateWritten of this COBOL program
	 */
	public void setYearDateWritten(int yearDateWritten) {
		this.yearDateWritten = yearDateWritten;
	}
	

	/**
	 * Set the section name 
	 *
	 * @param  String sectionName
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	
	/**
	 * Set the division name 
	 *
	 * @param  String divisionName
	 */
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	/**
	 * Return a textual description of this cobol type.
	 * 
	 * @return a textual description of this cobol type
	 */
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(program_id);
		buf.append(", ");
		buf.append(divisionName);
		buf.append(", ");
		buf.append(sectionName);
		
		return buf.toString();
	}
}
