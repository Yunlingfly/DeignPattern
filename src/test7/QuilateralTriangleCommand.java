package test7;

class QuilateralTriangleCommand implements DrawCommand{
	Triangle triangle;
	public QuilateralTriangleCommand(Triangle t){
		triangle=t;
	}
	public void execute() {
		System.out.println("������ӵȱ�������Ŷ");
		TestJFrame.panel_1.add(triangle,"South");
		triangle.draweQuilateralTriangle();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("׼���Ƴ�...");
	}
}
