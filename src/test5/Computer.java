package test5;

public  class Computer {

	protected ComputerFactory createComputer(String item,String[] arr){
		ComputerFactory computer=null;
		if(item.equals("student")){
			computer=new StudentComputerFactory();
		}
		if(item.equals("home")){
			computer=new HomeComputerFactory();
		}
		computer.createCpu(arr);
		computer.createMainboard(arr);
		computer.createGraphicsCard(arr);
		computer.createRam(arr);
		computer.createCaliche(arr);
		computer.displayPrice();
		return computer;
	}
}

