class Friendsdetails{
	static String names[]={"Manjula","Radika","Lakshmi","Muskan","Rani","Soumya","Deepa","Nisarga","pooji","Shewtha","Anitha","Akshat","Barath","Shethal","Akshay","shankar","ullas","Harshit","Mahesh","umesh","arun","prakash","Naeen","santosh","Hemanth","prabuling","Lakappa"};
	static void printAll(){
		for(int index=0;index<names.length;index++){
			System.out.print(names[index]+"\t");
			
		}
		System.out.println();
	}
		static void updateName(String oldName ,String newName){
			for (int index=0;index<names.length;index++){
				if(oldName.equals(names[index])){
					names[index]=newName;
				}
			}
		}
	}