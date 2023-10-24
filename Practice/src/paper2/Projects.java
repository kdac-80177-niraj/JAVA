package paper2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Projects implements Serializable{
	private int id;
	private String title;
	private int teamSize;
	private Date startDate;
	private String technology;
	
	public Projects() {
		super();
	}
	public Projects(int id, String title, int teamSize, Date startDate, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.startDate = startDate;
		this.technology = technology;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Projects [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", startDate=" + startDate
				+ ", technology=" + technology + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Projects) {
			Projects other = (Projects) obj;
			return id == other.id;
		}
		return false;
	}
	
	
}
