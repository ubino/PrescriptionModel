package eu.dedalus.prescriptionmodel;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import eu.dedalus.prescriptionmodel.Exemption;
import eu.dedalus.prescriptionmodel.Diagnosis;

/**
 * This class was automatically generated by the data modeler tool.
 */

public interface CommonDataInterface {
    
    String getId();

	void setId(String id);

	String getType();

	void setType(String type);

    String getInductor();

	void setInductor(String inductor);
	
	boolean isDemat();

	void setDemat(boolean demat);
	
	List<Exemption> getAvailableExemptions();

	void setAvailableExemptions(List<Exemption> availableExemptions);
	
	Exemption getExemption();

	void setExemption(Exemption exemption);
	
	List<Notification> getErrors();

	void setErrors(List<Notification> errors);

	List<Notification> getWarnings();

	void setWarnings(List<Notification> warnings);
	
	List<Notification> getInformations();

	void setInformations(List<Notification> informations);
	
	boolean isGranted();

	void setGranted(boolean granted);
	
	String getOverTheCounterReason();

	void setOverTheCounterReason(String overTheCounterReason);

	List<Diagnosis> getDiagnosis();

	void setDiagnosis(List<Diagnosis> diagnosis);
	
	void setCheckFlags(Map<String, Boolean> checkFlags);
	
	Map<String, Boolean> getCheckFlags();
	
	void addCheckFlags(String key , Boolean value);
	//for debug purose only
	void addAvailableExemptions(String code, String type);
	
	

}