package test7;

class CircularCommand implements DrawCommand{
	 Circular circular;

	public CircularCommand(Circular c){
		circular=c;
	}
	public void execute() {
		System.out.println("正在添加圆哦");
		TestJFrame.panel_1.add(circular,"South");
		circular.drawCircular();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("准备移除...");
	}
}
