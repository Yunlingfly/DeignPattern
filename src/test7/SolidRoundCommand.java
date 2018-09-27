package test7;

class SolidRoundCommand implements DrawCommand{
	 Circular circular;
		public SolidRoundCommand(Circular c){
			circular=c;
		}
		public void execute() {
			System.out.println("正在添加实心圆哦");
			TestJFrame.panel_1.add(circular,"South");
			circular.drawSolidRound();
		}
		public void undo() {
			// TODO Auto-generated method stub
			System.out.println("准备移除...");
		}
	}
