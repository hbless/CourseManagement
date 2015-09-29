package test;

public class Course {
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", grade=" + grade + ", discipline="
				+ discipline + ", number=" + number + ", name=" + name
				+ ", type=" + type + ", xuefen=" + xuefen + ", learnhours="
				+ learnhours + ", exphours=" + exphours + ", shangji="
				+ shangji + ", beginend=" + beginend + ", teacher=" + teacher
				+ ", remark=" + remark + "]";
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getXuefen() {
		return xuefen;
	}
	public void setXuefen(String xuefen) {
		this.xuefen = xuefen;
	}
	public String getLearnhours() {
		return learnhours;
	}
	public void setLearnhours(String learnhours) {
		this.learnhours = learnhours;
	}
	public String getExphours() {
		return exphours;
	}
	public void setExphours(String exphours) {
		this.exphours = exphours;
	}
	public String getShangji() {
		return shangji;
	}
	public void setShangji(String shangji) {
		this.shangji = shangji;
	}
	public String getBeginend() {
		return beginend;
	}
	public void setBeginend(String beginend) {
		this.beginend = beginend;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	private int id;
	public Course(int id, String grade, String discipline, String number,
			String name, String type, String xuefen, String learnhours,
			String exphours, String shangji, String beginend, String teacher,
			String remark) {
		super();
		this.id = id;
		this.grade = grade;
		this.discipline = discipline;
		this.number = number;
		this.name = name;
		this.type = type;
		this.xuefen = xuefen;
		this.learnhours = learnhours;
		this.exphours = exphours;
		this.shangji = shangji;
		this.beginend = beginend;
		this.teacher = teacher;
		this.remark = remark;
	}
	private String grade;
	private String  discipline;
	private String  number;
	private String name;
	private String type;
	private String xuefen;
	private String learnhours;
	private String exphours;
	private String shangji;
	private String beginend;
	private String teacher;
	private String remark;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String grade, String discipline, String number, String name,
			String type, String xuefen, String learnhours, String exphours,
			String shangji, String beginend, String teacher, String remark) {
		super();
		this.grade = grade;
		this.discipline = discipline;
		this.number = number;
		this.name = name;
		this.type = type;
		this.xuefen = xuefen;
		this.learnhours = learnhours;
		this.exphours = exphours;
		this.shangji = shangji;
		this.beginend = beginend;
		this.teacher = teacher;
		this.remark = remark;
	}
	
}
