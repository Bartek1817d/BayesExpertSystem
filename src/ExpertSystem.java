import smile.Network;

public class ExpertSystem {
	public static void main(String[] args) {
		Network net = new Network();
		net.readFile("res/expert_system.xdsl");
		
/*
   	//tutaj mo�na by zrobi� jaki� interfejs u�ytkownikam kt�ry wywo�uje poni�sze przypisania
		net.setEvidence("Mathematical_Skills", "Good");			
		net.setEvidence("Technical_Interests", "Yes");
		...
		
	np.: 
		for(String field: evidenceFields) {
			...
			String val = scanner.whatever...
			
			net.setEvidence(field, val);	
			...	
		}
*/
		
		net.updateBeliefs();
		
/*		
 		for(String field: outcome_fields) {
  			String outcomeIDs[] = net.getOutcomeIds(field)
			String outcomeVals[] = net.getNodeValue(field);
			print(field + "da�o nast�puj�ce rezultaty:")
			for(int i = 0; i < outcomeIDs.length; i++) 
				print(outcomeIds[i] + "->" + outcomeVals[i]);
		}

 */
	}
}
