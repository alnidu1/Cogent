package Person;

public class Scores {

	private Double math;
	private Double physic;
	private Double chemistry;
	public Double getMath() {
		return math;
	}
	public void setMath(Double math) {
		this.math = math;
	}
	public Double getPhysic() {
		return physic;
	}
	public void setPhysic(Double physic) {
		this.physic = physic;
	}
	public Double getChemistry() {
		return chemistry;
	}
	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}
	
	@Override
	public String toString() {
		return "math=" + this.math + ", physic=" + this.physic + ", chemistry=" + this.chemistry ;
	}
	
	
}
