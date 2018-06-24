package _01.jackson.data.bind;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // json dosyasinda olan ancak pojo da olmayan property icin hata vermez ve direk ignore eder.
public class Student {

	private int id;

	private String firstName;

	private String lastName;

	private boolean active;

	private Address address;

	// private String[] languages2;
	// json array icin List<String> ve ya String[] olabilir.
	private List<String> languages;

	@JsonIgnore // -> ilgili property json dosyasindan gelen veriyle bind islemi yapilmaz. Degeri null olur 
	private String ignoreProperties;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public String getIgnoreProperties() {
		return ignoreProperties;
	}

	public void setIgnoreProperties(String ignoreProperties) {
		this.ignoreProperties = ignoreProperties;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active
				+ ", address=" + address + ", languages=" + languages + ", ignoreProperties=" + ignoreProperties + "]";
	}

}
