package test3;

import java.awt.Color;

public class Start {
	private int timer=6000;
	public Start(Subject subject){

		while(true){		//��ʼѭ��
			changeColor(false, false, false, true, subject);		//��
			try{
				Thread.sleep(timer);//�̵߳ȴ�6��
				}catch(Exception e){}
			changeColor(true, false, false, false, subject);		//��
			try{
				Thread.sleep(timer);//�̵߳ȴ�6��
				}catch(Exception e){}
			changeColor(false, true, false, false, subject);		//��
			try{
				Thread.sleep(timer);//�̵߳ȴ�6��
				}catch(Exception e){}
			changeColor(false, false, true, false, subject);		//��
			try{
				Thread.sleep(timer);//�̵߳ȴ�6��
				}catch(Exception e){}
		}//while
	}
	public void changeColor(Boolean e,Boolean s,Boolean w,Boolean n,Subject subject){	//���ݲ���������ɫ
		//�г�
		if(e){MainFrame.eastP.setBackground(Color.GREEN);
		MainFrame.eastP.setText("����ͨ��");
		subject.setInfo("�����Ƕ����̵�, ���� �ĳ�����ֱ��,����������ȴ�\n"
						+"���˿���ͨ�����ߺ��ϱ�·��\n\n");
		subject.notifyObservers();	//֪ͨ�۲���
		}
		else{MainFrame.eastP.setBackground(Color.RED);
		MainFrame.eastP.setText("��ֹͨ��");}
		
		if(s){MainFrame.southP.setBackground(Color.GREEN);
		MainFrame.southP.setText("����ͨ��");
		subject.setInfo("�������ϱ��̵�, ���� �ĳ�����ֱ��,����������ȴ�\n"
						+"���˿���ͨ�����ߺ�����·��\n\n");
		subject.notifyObservers();	//֪ͨ�۲���
		}
		else{MainFrame.southP.setBackground(Color.RED);
		MainFrame.southP.setText("��ֹͨ��");}
		
		if(w){MainFrame.westP.setBackground(Color.GREEN);
		MainFrame.westP.setText("����ͨ��");
		subject.setInfo("�����������̵�, ���� �ĳ�����ֱ��,����������ȴ�\n"
						+"���˿���ͨ�����ߺ��ϱ�·��\n\n");
		subject.notifyObservers();	//֪ͨ�۲���
		}
		else{MainFrame.westP.setBackground(Color.RED);
		MainFrame.westP.setText("��ֹͨ��");}
		
		if(n){MainFrame.northP.setBackground(Color.GREEN);
		MainFrame.northP.setText("����ͨ��");
		subject.setInfo("�����Ǳ����̵�, �ϱ� �ĳ�����ֱ��,����������ȴ�\n"
						+"���˿���ͨ�����ߺ�����·��\n\n");
		subject.notifyObservers();	//֪ͨ�۲���
		}
		else{MainFrame.northP.setBackground(Color.RED);
		MainFrame.northP.setText("��ֹͨ��");}
		
		
		//����
		if(e||w){
			MainFrame.northP1.setBackground(Color.GREEN);MainFrame.southP1.setBackground(Color.GREEN);
			MainFrame.northP1.setText("����ͨ��");;MainFrame.southP1.setText("����ͨ��");
		}
		else{
			MainFrame.northP1.setBackground(Color.RED);MainFrame.southP1.setBackground(Color.RED);
			MainFrame.northP1.setText("��ֹͨ��");;MainFrame.southP1.setText("��ֹͨ��");
		}
		
		if(s||n){
			MainFrame.westP1.setBackground(Color.GREEN);MainFrame.eastP1.setBackground(Color.GREEN);
			MainFrame.westP1.setText("����ͨ��");;MainFrame.eastP1.setText("����ͨ��");
		}
		else{
			MainFrame.westP1.setBackground(Color.RED);MainFrame.eastP1.setBackground(Color.RED);
			MainFrame.westP1.setText("��ֹͨ��");MainFrame.eastP1.setText("��ֹͨ��");
		}
	}
}
