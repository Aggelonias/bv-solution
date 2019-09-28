package solution;

public class Test {

	public static void main(String[] args) {
		
		// Usage example
		
		PositionManager pm = new PositionManager();
		
		Unit dioikisi = new Unit(pm, "Διοικητικό Συμβούλιο");
		
		Unit dAnaptixis = new Unit(pm, "Διεύθυνση Ανάπτυξης", dioikisi);
		
		Unit dOikonomikwn = new Unit(pm, "Διεύθυνση Οικονομικών", dioikisi);
		
		Unit tdap = new Unit(pm, "Τμήμα Διοίκησης Ανρθωπίνων πόρων", dAnaptixis);
		
		pm.addNewTypeOfPosition("CEO", "Ο ιδιοκτήτης της εταιρείας.");
		pm.addNewTypeOfPosition("Διευθυντής", "Να διευθύνει.");
		pm.addNewTypeOfPosition("Προϊστάμενος", "Να είναι ένας σωστός προϊστάμενος.");
		pm.addNewTypeOfPosition("Υπάλληλος", "Να εκτελεί.");
		
		dioikisi.addPositions("CEO", 1);
		dAnaptixis.addPositions("Διευθυντής", 1);
		dOikonomikwn.addPositions("Διευθυντής", 1);
		tdap.addPositions("Προϊστάμενος", 1);
		tdap.addPositions("Υπάλληλος", 8);
	}

}
