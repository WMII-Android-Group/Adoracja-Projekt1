package wmii.android.factory.factoryObject;

import wmii.android.factory.factoryObject.iFactory.iFactoryOB;
import wmii.android.factory.factoryObject.iFactory.DB.iFactoryDB;
import wmii.android.factory.factoryObject.iFactory.XML.iFactoryXML;

public class FactoryObject {
	
	public static iFactoryOB getObject(String criteria)
	{
		 if ("XML".equals(criteria) ) {
			 return new iFactoryXML();
		 } else if("DB".equals(criteria) ) {
			 return new iFactoryDB();
		 }
			 
		 throw new IllegalArgumentException();
	}
}
