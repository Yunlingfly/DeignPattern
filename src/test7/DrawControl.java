package test7;

import java.util.ArrayList;

class DrawControl {
	ArrayList<DrawCommand> dcommand=new ArrayList<DrawCommand>();

	public void addCommand(DrawCommand dc){
		
		dcommand.add(dc);
	}
	public void removeCommand(DrawCommand dc){
	for(int i=0;i<dcommand.size();i++)
		if(dcommand.get(i).getClass().equals(getClass())){
			dcommand.remove(i);
		}
	}
	public void executeCommand(){
		for(int i=0;i<dcommand.size();i++)
			dcommand.get(i).execute();
		}
	public void undoCommand(){
		if (dcommand.size() > 0) {
			dcommand.get(dcommand.size() - 1).undo();	//�Ƴ�֮ǰ
			dcommand.remove(dcommand.size() - 1);		//�Ƴ����һ��Ԫ��
		} else
			System.out.println("�Ѿ�û��Ԫ�ؿ��Գ�����");
		}
}
