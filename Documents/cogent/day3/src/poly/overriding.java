package poly;


	class Person{
		
		public void behavior() {
			System.out.println("Person:Neutral");
		}
		
	}
	
	class Parent extends Person{
		
		@Override
		public void behavior() {
			System.out.println("Parent:More REspect");
		}
		
	}
	class Child extends Person{
		
		@Override
		public void behavior() {
			System.out.println("Child: More Care");
		}
		
	}
	
	class Friend extends Person{
		
		@Override
		public void behavior() {
			System.out.println("Friend: More Fun");
		}
		
	}
	
	class SO extends Person{
		
		@Override
		public void behavior() {
			System.out.println("SO: More Love");
		}
		
	}
	
	
	
	


