package eu.dedalus.prescriptionmodel;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import eu.dedalus.prescriptionmodel.Exemption;
import eu.dedalus.prescriptionmodel.Diagnosis;
/**
 * This class define the common properties 
 * between drug and observation
 */

public class CommonData implements java.io.Serializable, Cloneable, CommonDataInterface {

    static final long serialVersionUID = 1L;
    
    public CommonData() { }
    
    @org.kie.api.definition.type.Label("identificativo dell'elemento")
	private String id;

	@org.kie.api.definition.type.Label("Tipologia dell'elemento")
	private String type;

    @org.kie.api.definition.type.Label("Induttore")
	private String inductor;
	
	@org.kie.api.definition.type.Label("Dematerializzabile (default true)")
	private boolean demat = true;
	
    @org.kie.api.definition.type.Label("Esenzione selezionata")
	private Exemption exemption  ;
	
	@org.kie.api.definition.type.Label("Esenzioni applicabili")
	private List<Exemption> availableExemptions= new ArrayList<>();
	
	@org.kie.api.definition.type.Label("notifice di errore post validazione")
	private List<Notification> errors = new ArrayList<>();

	private List<Notification> warnings = new ArrayList<>();

	@org.kie.api.definition.type.Label("validation information results")
	private List<Notification> informations = new ArrayList<>();

	@org.kie.api.definition.type.Label("Concesso SSN (di default e' il concedibile ma il medico/drools puo' cambiare)")
	private boolean granted = false;
	
	@org.kie.api.definition.type.Label("Not print reason")
	private String overTheCounterReason;
	
	@org.kie.api.definition.type.Label("Diagnosis for the element")
	private List<Diagnosis> diagnosis;
	
	@org.kie.api.definition.type.Description(value = "map for flags inducer etc..")
	private Map<String, Boolean> checkFlags = new HashMap<>();
	
	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}
	
	public String getInductor() {
		return this.inductor;
	}

	public void setInductor(String inductor) {
		this.inductor = inductor;
	}

	public boolean isDemat() {
		return this.demat;
	}

	public void setDemat(boolean demat) {
		this.demat = demat;
	}
	
	public List<Exemption> getAvailableExemptions() {
		return this.availableExemptions;
	}

	public void setAvailableExemptions(List<Exemption> availableExemptions) {
		this.availableExemptions = availableExemptions;
	}

	public Exemption getExemption() {
		return this.exemption;
	}

	public void setExemption(Exemption exemption) {
		this.exemption = exemption;
	}
	
	public List<Notification> getErrors() {
	    if(this.errors == null)
	        this.errors = new ArrayList<>();
		return this.errors;
	}

	public void setErrors(List<Notification> errors) {
		this.errors = errors;
	}

	public List<Notification> getWarnings() {
	     if(this.warnings == null)
	        this.warnings = new ArrayList<>();
		return this.warnings;
	}

	public void setWarnings(List<Notification> warnings) {
		this.warnings = warnings;
	}
	
	public List<Notification> getInformations() {
	    if(this.informations == null)
	        this.informations = new ArrayList<>();
		return this.informations;
	}

	public void setInformations(List<Notification> informations) {
		this.informations = informations;
	}
	
	public boolean isGranted() {
		return this.granted;
	}

	public void setGranted(boolean granted) {
		this.granted = granted;
	}
	
	public String getOverTheCounterReason() {
		return this.overTheCounterReason;
	}

	public void setOverTheCounterReason(String overTheCounterReason) {
		this.overTheCounterReason = overTheCounterReason;
	}

	public List<Diagnosis> getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public Map<String, Boolean> getCheckFlags() {
		return this.checkFlags;
	}

	public void setCheckFlags(Map<String, Boolean> checkFlags) {
		this.checkFlags = checkFlags;
	}
	
	public void addCheckFlags(String key , Boolean value) {
		if(this.checkFlags == null){
		    this.checkFlags = new HashMap<>();
		}
		this.checkFlags.put(key, value);
	}
	
	public void addAvailableExemptions(String code, String type) {
		Exemption e = new Exemption();
		e.setCode(code);
		e.setType(type);
		e.setWeight(-1);
		this.availableExemptions.add(e);
	}
	
	@Override
	public CommonData clone() throws CloneNotSupportedException {
		// Define a shallow copy for CommonData element
		return (CommonData) super.clone();
	}

}