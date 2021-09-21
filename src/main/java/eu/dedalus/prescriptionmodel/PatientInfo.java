package eu.dedalus.prescriptionmodel;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PatientInfo implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
	@org.kie.api.definition.type.Label("id")
    private java.lang.String id;

	@org.kie.api.definition.type.Label("patient age")
    private Integer patientAge; 

	@org.kie.api.definition.type.Label("patient gender")
	private java.lang.String gender;

	@org.kie.api.definition.type.Label("patient region of residence")
	private java.lang.String patientRegion;

	@org.kie.api.definition.type.Label("Esenzioni paziente")
	private java.util.List<eu.dedalus.prescriptionmodel.Exemption> patientExemptions;

	@org.kie.api.definition.type.Label("intolleranze farmacologiche")
	private java.util.List<eu.dedalus.prescriptionmodel.DrugIntolerance> intolerances;

	@org.kie.api.definition.type.Label("alleriga glutine")
	private boolean gluten = false;

	@org.kie.api.definition.type.Label("allergia lattosio")
	private boolean lactose = false;

	@org.kie.api.definition.type.Label("terapia continuativa")
	private java.util.List<eu.dedalus.prescriptionmodel.ContinuousTherapy> continuousTherapy;
	
	@org.kie.api.definition.type.Label("piani terapeutici del paziente")
	private java.util.List<eu.dedalus.prescriptionmodel.CarePlan> carePlans;


    public java.util.List<eu.dedalus.prescriptionmodel.CarePlan> getCarePlans() {
		return this.carePlans;
	}

	public void setCarePlans(
			java.util.List<eu.dedalus.prescriptionmodel.CarePlan> carePlans) {
		this.carePlans = carePlans;
	}
   

	public java.util.List<eu.dedalus.prescriptionmodel.ContinuousTherapy> getContinuousTherapy() {
		return this.continuousTherapy;
	}

	public void setContinuousTherapy(
			java.util.List<eu.dedalus.prescriptionmodel.ContinuousTherapy> continuousTherapy) {
		this.continuousTherapy = continuousTherapy;
	}
	
	
	public java.util.List<eu.dedalus.prescriptionmodel.DrugIntolerance> getIntolerances() {
		return this.intolerances;
	}

	public void setIntolerances(
			java.util.List<eu.dedalus.prescriptionmodel.DrugIntolerance> intolerances) {
		this.intolerances = intolerances;
	}
	
    public PatientInfo() {
    }

    public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
    
    public Integer getPatientAge() {
			return patientAge;
		}

		public void setPatientAge(Integer patientAge) {
			this.patientAge = patientAge;
		}
		public java.lang.String getGender() {
			return gender;
		}

		public void setGender(java.lang.String gender) {
			this.gender = gender;
		}

		
		public java.lang.String getPatientRegion() {
			return patientRegion;
		}

		public void setPatientRegion(java.lang.String patientRegion) {
			this.patientRegion = patientRegion;
		}

		public java.util.List<eu.dedalus.prescriptionmodel.Exemption> getPatientExemptions() {
			return this.patientExemptions;
		}

		public void setPatientExemptions(
				java.util.List<eu.dedalus.prescriptionmodel.Exemption> patientExemptions) {
			this.patientExemptions = patientExemptions;
		}


		public boolean isGluten() {
			return this.gluten;
		}

		public void setGluten(boolean gluten) {
			this.gluten = gluten;
		}

		public boolean isLactose() {
			return this.lactose;
		}

		public void setLactose(boolean lactose) {
			this.lactose = lactose;
		}

		public PatientInfo(java.lang.Integer patientAge, java.lang.String gender,
				java.lang.String patientRegion,
				java.util.List<eu.dedalus.prescriptionmodel.Exemption> patientExemptions,
				java.util.List<eu.dedalus.prescriptionmodel.DrugIntolerance> intolerances,
				java.util.List<eu.dedalus.prescriptionmodel.ContinuousTherapy> continuousTherapy, 
				boolean gluten, boolean lactose,
				java.util.List<eu.dedalus.prescriptionmodel.CarePlan> carePlans) {
			this.patientRegion = patientRegion;
			this.patientAge = patientAge;
			this.intolerances = intolerances;
			this.patientExemptions = patientExemptions;
			this.gender = gender;
			this.gluten = gluten;
			this.lactose = lactose;
			this.continuousTherapy = continuousTherapy;
			this.carePlans = carePlans;
		}

}