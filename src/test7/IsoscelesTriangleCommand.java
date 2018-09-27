package test7;

class IsoscelesTriangleCommand implements DrawCommand{
	Triangle triangle;
	public IsoscelesTriangleCommand(Triangle t){
		triangle=t;
	}
	public void execute() {
		System.out.println("正在添加等腰直角三角形哦");
		TestJFrame.panel_1.add(triangle,"South");
		triangle.drawIsoscelesTriangle();
	}
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("准备移除...");
	}
}
