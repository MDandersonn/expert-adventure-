package C04_DepartmentMVC;

import java.util.Objects;

public class DepartmentVO {
	private int departmentId;
	private String departmentName;
	private int managerId;
	private int location_Id;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocation_Id() {
		return location_Id;
	}
	public void setLocation_Id(int location_Id) {
		this.location_Id = location_Id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(departmentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentVO other = (DepartmentVO) obj;
		return departmentId == other.departmentId;
	}
	@Override
	public String toString() {
		return "DepartmentVO [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	

}
