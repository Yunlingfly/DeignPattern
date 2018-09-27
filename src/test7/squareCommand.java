package test7;

class squareCommand implements DrawCommand{
	Rectangle rectangle;
	public squareCommand(Rectangle r){
		rectangle=r;
	}
	public void execute() {
		System.out.println("正在添加正方形哦");
		TestJFrame.panel_1.add(rectangle,"South");
		rectangle.drawsquare();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("准备移除...");
	}
}
