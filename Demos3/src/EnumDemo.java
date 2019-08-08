enum Mango {
	Brooks, Manilla, Alphanso, Kesar, Maya
}

class EnumDemo { 
	public static void main (String args[])
	{ 
		Mango ap;
		ap = Mango.Maya;
		System.out.println("value of ap: " + ap);
		System.out.println();
		ap = Mango.Maya;
		if (ap == Mango.Manilla) 
		{ 
			System.out.println ("ap contains Manilla.\n"); 
		}
		
		switch(ap) {
		case Brooks:
			System.out.println("Brooks is red.");
			break;
		case Manilla:
			System.out.println("Golden Delicious is Yellow.");
			break;
		case Alphanso:
			System.out.println("Red Delicious is red.");
			break;
		case Kesar:
			System.out.println("Kesar is red.");
			break;
		case Maya:
			System.out.println("Brooks is red.");
			break;
		}
	}
}
