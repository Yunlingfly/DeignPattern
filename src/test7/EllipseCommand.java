package test7;

class EllipseCommand implements DrawCommand{
	 Circular circular;

		public EllipseCommand(Circular c){
			circular=c;
		}
		public void execute() {
			System.out.println("正在添加椭圆哦");
			TestJFrame.panel_1.add(circular,"South");
			circular.drawEllipse();
		}
		
		public void undo() {
//			DrawFrame.getJFrame().add(circular);
			System.out.println("准备移除...");
		}

	}
