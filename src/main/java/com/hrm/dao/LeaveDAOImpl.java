package com.hrm.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hrm.domain.Leave;
import com.hrm.domain.LeaveStatus;

public class LeaveDAOImpl implements LeaveDAO {
	private static int idCount = 1;
	private Map<Integer, Leave> leaves = new HashMap<Integer, Leave>();

	public LeaveDAOImpl() {
		requestLeave(new Leave(new Date(), new Date(), "sick leaeve for one day", "sick", 1.0, 12.0, 5.0, 124,LeaveStatus.SUBMITTED));
	}

	public void requestLeave(Leave leave) {
		leave.setLeaveId(idCount);
		leaves.put(idCount, leave);
		idCount++;

	}

	public void updateLeave(Leave leave) {
		// TODO Auto-generated method stub

	}

	public List<Leave> getAllLeave() {
		// TODO Auto-generated method stub
		return null;
	}

	public Leave getLeaveDetail(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
