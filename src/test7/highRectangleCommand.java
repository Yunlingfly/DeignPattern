package test7;

class highRectangleCommand implements DrawCommand{
	Rectangle rectangle;
	public highRectangleCommand(Rectangle r){
		rectangle=r;
	}
	public void execute() {
		System.out.println("������ӷ���Ŷ");
		TestJFrame.panel_1.add(rectangle,"South");
		rectangle.drawhighRectangle();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("׼���Ƴ�...");
	}
}
