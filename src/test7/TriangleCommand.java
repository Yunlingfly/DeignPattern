package test7;

class TriangleCommand  implements DrawCommand{
	Triangle triangle;
	public TriangleCommand(Triangle t){
		triangle=t;
	}
	public void execute() {
		System.out.println("�������������Ŷ");
		TestJFrame.panel_1.add(triangle,"South");
		triangle.drawTriangle();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("׼���Ƴ�...");
	}
}
