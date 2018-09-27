package test3;

import java.awt.Color;

public class Start {
	private int timer=6000;
	public Start(Subject subject){

		while(true){		//开始循环
			changeColor(false, false, false, true, subject);		//北
			try{
				Thread.sleep(timer);//线程等待6秒
				}catch(Exception e){}
			changeColor(true, false, false, false, subject);		//东
			try{
				Thread.sleep(timer);//线程等待6秒
				}catch(Exception e){}
			changeColor(false, true, false, false, subject);		//南
			try{
				Thread.sleep(timer);//线程等待6秒
				}catch(Exception e){}
			changeColor(false, false, true, false, subject);		//西
			try{
				Thread.sleep(timer);//线程等待6秒
				}catch(Exception e){}
		}//while
	}
	public void changeColor(Boolean e,Boolean s,Boolean w,Boolean n,Subject subject){	//根据参数设置颜色
		//行车
		if(e){MainFrame.eastP.setBackground(Color.GREEN);
		MainFrame.eastP.setText("可以通行");
		subject.setInfo("现在是东边绿灯, 西边 的车可以直行,其他车辆请等待\n"
						+"行人可以通过北边和南边路口\n\n");
		subject.notifyObservers();	//通知观测者
		}
		else{MainFrame.eastP.setBackground(Color.RED);
		MainFrame.eastP.setText("禁止通行");}
		
		if(s){MainFrame.southP.setBackground(Color.GREEN);
		MainFrame.southP.setText("可以通行");
		subject.setInfo("现在是南边绿灯, 北边 的车可以直行,其他车辆请等待\n"
						+"行人可以通过东边和西边路口\n\n");
		subject.notifyObservers();	//通知观测者
		}
		else{MainFrame.southP.setBackground(Color.RED);
		MainFrame.southP.setText("禁止通行");}
		
		if(w){MainFrame.westP.setBackground(Color.GREEN);
		MainFrame.westP.setText("可以通行");
		subject.setInfo("现在是西边绿灯, 东边 的车可以直行,其他车辆请等待\n"
						+"行人可以通过北边和南边路口\n\n");
		subject.notifyObservers();	//通知观测者
		}
		else{MainFrame.westP.setBackground(Color.RED);
		MainFrame.westP.setText("禁止通行");}
		
		if(n){MainFrame.northP.setBackground(Color.GREEN);
		MainFrame.northP.setText("可以通行");
		subject.setInfo("现在是北边绿灯, 南边 的车可以直行,其他车辆请等待\n"
						+"行人可以通过东边和西边路口\n\n");
		subject.notifyObservers();	//通知观测者
		}
		else{MainFrame.northP.setBackground(Color.RED);
		MainFrame.northP.setText("禁止通行");}
		
		
		//行人
		if(e||w){
			MainFrame.northP1.setBackground(Color.GREEN);MainFrame.southP1.setBackground(Color.GREEN);
			MainFrame.northP1.setText("可以通行");;MainFrame.southP1.setText("可以通行");
		}
		else{
			MainFrame.northP1.setBackground(Color.RED);MainFrame.southP1.setBackground(Color.RED);
			MainFrame.northP1.setText("禁止通行");;MainFrame.southP1.setText("禁止通行");
		}
		
		if(s||n){
			MainFrame.westP1.setBackground(Color.GREEN);MainFrame.eastP1.setBackground(Color.GREEN);
			MainFrame.westP1.setText("可以通行");;MainFrame.eastP1.setText("可以通行");
		}
		else{
			MainFrame.westP1.setBackground(Color.RED);MainFrame.eastP1.setBackground(Color.RED);
			MainFrame.westP1.setText("禁止通行");MainFrame.eastP1.setText("禁止通行");
		}
	}
}
