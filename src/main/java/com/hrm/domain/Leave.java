package com.hrm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_leave")
public class Leave {
	@Id
	@GeneratedValue
	private int leaveId;
	private Date startDate;
	private Date endDate;
	private String description;
	private String leaveType;
	private Double noOfDays;
	private Double totalLeaves;
	private Double remainingLeaves;
	private int employeeId;
	private String myname;

	@Enumerated(EnumType.STRING)
	private LeaveStatus status;

	public Leave(int leaveId, Date startDate, Date endDate, String description, String leaveType, Double noOfDays,
			Double totalLeaves, Double remainingLeaves, int employeeId, LeaveStatus status) {
		super();
		this.leaveId = leaveId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.leaveType = leaveType;
		this.noOfDays = noOfDays;
		this.totalLeaves = totalLeaves;
		this.remainingLeaves = remainingLeaves;
		this.employeeId = employeeId;
		this.status = status;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public Double getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Double noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Double getTotalLeaves() {
		return totalLeaves;
	}

	public void setTotalLeaves(Double totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

	public Double getRemainingLeaves() {
		return remainingLeaves;
	}

	public void setRemainingLeaves(Double remainingLeaves) {
		this.remainingLeaves = remainingLeaves;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
