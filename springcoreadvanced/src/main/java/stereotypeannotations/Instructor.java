package stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Instructor {

	//@Value("#{T(java.lang.Math).abs(-111)}")
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int id = 1;
	@Value("#{'Maria Sharapova'.toUpperCase()}")
	private String name = "Serena";
	@Value("true")
	private boolean active;
	
	@Value("#{majors}")
	private List<String> grandslams;

	@Autowired
	private Profile profile;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", grandslams=" + grandslams
				+ ", profile=" + profile + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getGrandslams() {
		return grandslams;
	}

	public void setGrandslams(List<String> grandslams) {
		this.grandslams = grandslams;
	}

}
