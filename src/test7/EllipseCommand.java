package test7;

class EllipseCommand implements DrawCommand{
	 Circular circular;

		public EllipseCommand(Circular c){
			circular=c;
		}
		public void execute() {
			System.out.println("���������ԲŶ");
			TestJFrame.panel_1.add(circular,"South");
			circular.drawEllipse();
		}
		
		public void undo() {
//			DrawFrame.getJFrame().add(circular);
			System.out.println("׼���Ƴ�...");
		}

	}
