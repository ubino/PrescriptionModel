package eu.dedalus.prescriptionmodel;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import eu.dedalus.prescriptionmodel.Interaction;
import eu.dedalus.prescriptionmodel.ProcedureInteraction;
import eu.dedalus.prescriptionmodel.Exemption;
import eu.dedalus.prescriptionmodel.Diagnosis;
import eu.dedalus.prescriptionmodel.CommonData;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Procedure
		implements
			java.io.Serializable,
			Cloneable,
			CommonDataInterface {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("price of procedure")
	private java.math.BigDecimal price;

	@org.kie.api.definition.type.Label("chosen Branch")
	private String branch;

	@org.kie.api.definition.type.Label("Appropriatezza prescrittiva: lista di esclusione")
	private java.util.List<ProcedureInteraction> needToInclude = new ArrayList<>();

	@org.kie.api.definition.type.Label("Appropriatezza prescrittiva: lista di inclusione")
	private java.util.List<ProcedureInteraction> needToExclude = new ArrayList<>();

	@org.kie.api.definition.type.Label("Appropriatezza prescrittiva: lista di inclusione")
	private java.util.List<ProcedureInteraction> alreadyInclude = new ArrayList<>();

	@org.kie.api.definition.type.Description(value = "map for procedure properties PNGLA etc..")
	private Map<String, Boolean> procedureFlags = new HashMap<>();

	@org.kie.api.definition.type.Label("catalogue prescription annotation")
	private String note;

	public Procedure() {
	}

	@org.kie.api.definition.type.Label("Definizione dati comuni")
	private CommonData commonData = new CommonData();

	@org.kie.api.definition.type.Label("Descrizione dell'accertamento")
	private String description;

	@org.kie.api.definition.type.Label("Codice Nomenclatore tariffario")
	private String cntCode;

	@org.kie.api.definition.type.Label("Codice catalogo")
	private String catalogueCode;

	@org.kie.api.definition.type.Label("Livello di urgenza")
	private String urgency;

	@org.kie.api.definition.type.Label("lista delle branche")
	private List<String> branches;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCntCode() {
		return cntCode;
	}

	public void setCntCode(String cntCode) {
		this.cntCode = cntCode;
	}

	public String getCatalogueCode() {
		return catalogueCode;
	}

	public void setCatalogueCode(String catalogueCode) {
		this.catalogueCode = catalogueCode;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public List<String> getBranches() {
		return branches;
	}

	public void setBranches(List<String> branches) {
		this.branches = branches;
	}

	public void setCommonData(CommonData data) {
		this.commonData = data;
	}

	@Override
	public Procedure clone() throws CloneNotSupportedException {
		// Define a shallow copy for Drug element
		Procedure p = (Procedure) super.clone();
		p.setCommonData(commonData.clone());
		return p;
	}

	public String toString() {
		return "Procedure[ ]";
	}

	// CommoData decorator

	public String getId() {
		return this.commonData.getId();
	}

	public void setId(String id) {
		this.commonData.setId(id);
	}

	public String getType() {
		return "procedure";
	}

	public void setType(String type) {
		this.commonData.setType(type);
	}

	public String getInductor() {
		return this.commonData.getInductor();
	}

	public void setInductor(String inductor) {
		this.commonData.setInductor(inductor);
	}

	public boolean isDemat() {
		return this.commonData.isDemat();
	}

	public void setDemat(boolean demat) {
		this.commonData.setDemat(demat);
	}

	public List<Exemption> getAvailableExemptions() {
		return this.commonData.getAvailableExemptions();
	}

	public void setAvailableExemptions(List<Exemption> availableExemptions) {
		this.commonData.setAvailableExemptions(availableExemptions);
	}

	public Exemption getExemption() {
		return this.commonData.getExemption();
	}

	public void setExemption(Exemption exemption) {
		this.commonData.setExemption(exemption);
	}

	public Map<String, Boolean> getCheckFlags() {
		return this.commonData.getCheckFlags();
	}

	public void setCheckFlags(Map<String, Boolean> checkFlags) {
		this.commonData.setCheckFlags(checkFlags);
	}

	public void addCheckFlags(String key, Boolean value) {
		this.commonData.addCheckFlags(key, value);
	}

	public List<Notification> getErrors() {
		return this.commonData.getErrors();
	}

	public void setErrors(List<Notification> errors) {
		this.commonData.setErrors(errors);
	}

	public List<Notification> getWarnings() {
		return this.commonData.getWarnings();
	}

	public void setWarnings(List<Notification> warnings) {
		this.commonData.setWarnings(warnings);
	}

	public void addAvailableExemptions(String code, String type) {
		this.commonData.addAvailableExemptions(code, type);
	}

	public boolean isGranted() {
		return this.commonData.isGranted();
	}

	public void setGranted(boolean granted) {
		this.commonData.setGranted(granted);
	}

	public List<Notification> getInformations() {
		return this.commonData.getInformations();
	}

	public void setInformations(List<Notification> informations) {
		this.commonData.setInformations(informations);
	}

	public String getOverTheCounterReason() {
		return this.commonData.getOverTheCounterReason();
	}

	public void setOverTheCounterReason(String overTheCounterReason) {
		this.commonData.setOverTheCounterReason(overTheCounterReason);
	}

	public List<Diagnosis> getDiagnosis() {
		return this.commonData.getDiagnosis();
	}

	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.commonData.setDiagnosis(diagnosis);
	}

	public java.math.BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<ProcedureInteraction> getNeedToInclude() {
		return this.needToInclude;
	}

	public void setNeedToInclude(List<ProcedureInteraction> needToInclude) {
		this.needToInclude = needToInclude;
	}

	public List<ProcedureInteraction> getNeedToExclude() {
		return this.needToExclude;
	}

	public void setNeedToExclude(List<ProcedureInteraction> needToExclude) {
		this.needToExclude = needToExclude;
	}

	public List<ProcedureInteraction> getAlreadyInclude() {
		return this.alreadyInclude;
	}

	public void setAlreadyInclude(List<ProcedureInteraction> alreadyInclude) {
		this.alreadyInclude = alreadyInclude;
	}

	public void setProcedureFlags(Map<String, Boolean> procedureFlags) {
		this.procedureFlags = procedureFlags;
	}

	public Map<String, Boolean> getProcedureFlags() {
		return this.procedureFlags;
	}

	public void addProcedureFlags(String key, Boolean value) {
		this.procedureFlags.put(key, value);
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Procedure(
			java.math.BigDecimal price,
			String branch,
			List<ProcedureInteraction> needToInclude,
			List<ProcedureInteraction> needToExclude,
			List<ProcedureInteraction> alreadyInclude,
			String note,
			CommonData commonData,
			String description, String cntCode,
			String catalogueCode, String urgency,
			java.util.List<String> branches,
			Map<String, Boolean> procedureFlags) {
		this.price = price;
		this.branch = branch;
		this.needToInclude = needToInclude;
		this.needToExclude = needToExclude;
		this.alreadyInclude = alreadyInclude;
		this.note = note;
		this.commonData = commonData;
		this.description = description;
		this.cntCode = cntCode;
		this.catalogueCode = catalogueCode;
		this.urgency = urgency;
		this.branches = branches;
		this.procedureFlags = procedureFlags;
	}
}