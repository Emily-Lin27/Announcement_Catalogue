import java.io.Serializable;
import java.util.Calendar;

public class SingleAnnouncement implements Serializable {
	public String club;
	public String teacher;
	public String student;
	public String topic;
	public String message;
	public Calendar date;
	public String approval;

	public SingleAnnouncement(String clubValue, String teacherValue, String studentValue, String topicValue, String messageValue, Calendar dateValue, String approvalValue) {
		club = clubValue;
		teacher = teacherValue;
		student = studentValue;
		topic = topicValue;
		message = messageValue;
		date = dateValue;
		approval = approvalValue;
	}

	// Getter and Setter for Approval 
	public String getApproval() {
		return approval;
	}

	public void setApproval(String approved) {
		this.approval = approved;
	}

	// Getter and Setter for Club 
	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	// Getter and Setter for Teacher
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	// Getter and Setter for Student
	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	// Getter and Setter for Topic
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	// Getter and Setter for Message
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// Getter and Setter for Date
	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
}
