package Persistance;

public class Userdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistance fp=new FilePersistance();
		fp.persist();
		Persistance dp=new DataPersistance();
		dp.persist();
		}
		}


