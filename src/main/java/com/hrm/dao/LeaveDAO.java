package com.hrm.dao;

import java.util.List;

import com.hrm.domain.Leave;

public interface LeaveDAO {
	public void requestLeave(Leave leave);

	public void updateLeave(Leave leave);

	public List<Leave> getAllLeave();

	public Leave getLeaveDetail(int id);

}
