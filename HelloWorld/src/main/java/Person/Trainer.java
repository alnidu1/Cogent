package Person;

import java.util.Map;

public class Trainer {

	private int id;
	private Map<Integer, String> poke;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<Integer, String> getPoke() {
		return poke;
	}
	public void setPoke(Map<Integer, String> poke) {
		this.poke = poke;
	}
}
