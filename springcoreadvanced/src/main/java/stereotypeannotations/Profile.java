package stereotypeannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("Aggressive")
	private String style;
	@Value("Russia")
	private String country;

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Profile [style=" + style + ", country=" + country + "]";
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
