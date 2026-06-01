package m5;
//Here I create a fixed list of emergency codes for hospitals 
		enum Hospital {
//All the codes with their meaning
	Code_Red("Fire"), 
	Code_Blue("Cardiac Arrest "),
	Code_Yellow("Bomb Threat "),
    Code_Orange("Hazardous Material Spill "),
	Code_Green("Evacuation."), 
    Code_Clear("Situation has been resolved ");
//I save the meanings of the code 
 private final String descripcoin;
			// constructer for each one above 
 //Then I will give them an automatic value 
	Hospital(String descripcoin) { //I save the meanings of the code 
		this.descripcoin = descripcoin;
	}
			// the methed to read it Then I create it so that I can get it back 
		public String getDescripcoin() {
			return descripcoin;
			}
		}
		public class m5 {
			public static void desp(Hospital code) {
				switch(code){ 
				//Your program must include a function to display the instructions for each code. For example: 
				//All the codes with their meaning with brake and case 
				case Code_Red:
					System.out.println("Call Fire Department and activate code Green ");
					break;
					
					case Code_Blue:
						System.out.println("Call cardiologist in charge");
						break;
						
					case Code_Yellow:
						System.out.println("Call 911 and activate code Green");
						break;
						
					case Code_Orange:
						System.out.println("Call Health and Safety ");
						break;
						
					case Code_Green:
						System.out.println("push the emergency button or alert hospital workers.");
						break;
						
					case Code_Clear:
						System.out.println("deactivate all code.");
						break;
						}
				}
		public static void main(String[] args) {
			//for (Hospital.values()): automatically goes through all the codes 
			for (Hospital code :Hospital.values()){
				System.out.println("code "+code);
				System.out.println(code.getDescripcoin());
				desp(code);// runs the instructions function for each code 
			}
                            
		}

}
