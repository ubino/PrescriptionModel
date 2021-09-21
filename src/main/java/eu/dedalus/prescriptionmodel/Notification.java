package eu.dedalus.prescriptionmodel;
import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Notification implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("the code of the notification")
	private String code;
	@org.kie.api.definition.type.Label("the display of the message")
	private String message;

	@org.kie.api.definition.type.Label("null, NONE, MULTI o SINGLE type for the choices list")
	private String choiceType = null;
	private List<Entry<String, String>> choices = null;

	@org.kie.api.definition.type.Label("the identifier to other object")
	private java.lang.String referenceCode;

	@org.kie.api.definition.type.Label(value = "display for reference")
	private java.lang.String referenceDisplay;

	public Notification() {
	}

	public Notification(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Entry<String, String>> getChoices() {
		return choices;
	}

	public void setChoices(List<Entry<String, String>> choices) {
		this.choices = choices;
	}

	public void addChoice(String key, String value) {
		if (this.choices == null) {
			this.choices = new ArrayList<>();
		}
		this.choices.add(new SimpleImmutableEntry<String, String>(key, value));
	}

	public String toString() {
		return "Notification[code=" + code + ", message=" + message + " ]";
	}

	public String getChoiceType() {
		return this.choiceType;
	}

	public void setChoiceType(String choiceType) {
		this.choiceType = choiceType;
	}

	public java.lang.String getReferenceCode() {
		return this.referenceCode;
	}

	public void setReferenceCode(java.lang.String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public java.lang.String getReferenceDisplay() {
		return this.referenceDisplay;
	}

	public void setReferenceDisplay(java.lang.String referenceDisplay) {
		this.referenceDisplay = referenceDisplay;
	}

	public Notification(java.lang.String code, java.lang.String message,
			java.lang.String choiceType, java.lang.String referenceCode,
			java.lang.String referenceDisplay) {
		this.code = code;
		this.message = message;
		this.choiceType = choiceType;
		this.referenceCode = referenceCode;
		this.referenceDisplay = referenceDisplay;
	}
}