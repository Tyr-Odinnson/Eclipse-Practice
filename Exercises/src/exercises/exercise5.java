package exercises;

public class exercise5 {
	public static void main(String[] args) {
		DataObject[] dataObjects = new DataObject[5];
		
		DataObject dataObject = new DataObject();
		dataObject.count = 5;
		dataObject.code = "Friday";
		dataObjects[0] = dataObject;
		
		dataObject = new DataObject();
		dataObject.count = 7;
		dataObject.code = "friday";
		dataObjects[1] = dataObject;
		
		dataObject = new DataObject();
		dataObject.count = 9;
		dataObject.code = "saturday";
		dataObjects[2] = dataObject;
		
		dataObject = new DataObject();
		dataObject.count = 11;
		dataObject.code = "saturday";
		dataObjects[3] = dataObject;
		
		dataObject = new DataObject();
		dataObject.count = 13;
		dataObject.code = "saturday";
		dataObjects[4] = dataObject;
		
		 int sum = 0;
		 for(int i=0; i < dataObjects.length; i++){
		 if("friday".equals(dataObjects[i].code)){
		 sum = sum + dataObjects[i].count;
		 }
		 }
		 System.out.println("Sum: " + sum);
		 }
		}