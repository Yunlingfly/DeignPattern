package test7;

class IsoscelesTriangleCommand implements DrawCommand{
	Triangle triangle;
	public IsoscelesTriangleCommand(Triangle t){
		triangle=t;
	}
	public void execute() {
		System.out.println("������ӵ���ֱ��������Ŷ");
		TestJFrame.panel_1.add(triangle,"South");
		triangle.drawIsoscelesTriangle();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("׼���Ƴ�...");
	}
}
