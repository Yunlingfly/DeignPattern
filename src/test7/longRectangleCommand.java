package test7;

class longRectangleCommand implements DrawCommand{
	Rectangle rectangle;
	public longRectangleCommand(Rectangle r){
		rectangle=r;
	}
	public void execute() {
		System.out.println("������ӳ�����Ŷ");
		TestJFrame.panel_1.add(rectangle,"South");
		rectangle.drawlongRectangle();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("׼���Ƴ�...");
	}
}
