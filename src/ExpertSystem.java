import smile.Network;

public class ExpertSystem {
	public static void main(String[] args) {
		Network net = new Network();
		net.readFile("res/expert_system.xdsl");
		
		for(String s : net.getAllNodeIds()) {
			System.out.println(s);
		}
/*
   	//tutaj mo¿na by zrobiæ jakiœ interfejs u¿ytkownikam który wywo³uje poni¿sze przypisania
		net.setEvidence("Mathematical_Skills", "Good");			
		net.setEvidence("Technical_Interests", "Yes");
		...
		
	np.: 
		for(String field: evidenceFields) {
			...
			String val = scanner.whater...
			
			net.setEvidence(field, val);	
			...	
		}
*/
		
		net.updateBeliefs();
		
/*		
 		for(String field: outcome_fields) {
  			String outcomeIDs[] = net.getOutcomeIds(nodeId)
			String outcomeVals[] = net.getNodeValue("Forecast");
			print(field + "da³o nastêpuj¹ce rezultaty:")
			for(int i = 0; i < outcomeIDs.length; i++) 
				print(outcomeIds[i] + "->" + outcomeVals[i]);
		}

 */
	}
}
