import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    public JPanel panel1;
    private JButton num_point;
    private JButton num_0;
    private JButton num_7;
    private JButton num_5;
    private JButton num_8;
    private JButton num_4;
    private JButton num_6;
    private JButton num_9;
    private JButton num_eq;
    private JButton num_1;
    private JButton num_2;
    private JButton num_3;
    private JButton tgButton;
    private JTextField tf2;
    private JButton plu;
    private JButton sub;
    private JButton mul;
    private JButton dec;
    private JButton cButton;
    private JButton daoshu;
    private JButton squ;
    private JButton sqr;
    private JButton zf;
    private JButton logButton;
    private JButton lnButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton button_bfz;
    private JButton eButton;
    private JButton PButton;
    private JTextField tf1;
    private int point_flag=0;//小数点标志位
    private int Xcode =1;//小数点用
    private String s;
    private int mode_flag=0;//切换数值存储处
    private int cal_mode=0;//计算模式
    private int cal_mode_temp=0;
    private int launch_sig=0;//第一次运算结束后置1
    private  cal c1=new cal();
    private String tf1s="";
    private boolean iseqsig=false;
    private String sm="";
    private String zt="";
    UI() {
        num_1.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+1;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+1*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }

            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }


            tf1.setText(tf1s+s);
        });
        num_2.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+2;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+2*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);
        });
        num_3.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+3;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+3*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);
        });
        num_4.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+4;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+4*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);
        });
        num_5.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+5;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+5*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);
        });
        num_6.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+6;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+6*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);
        });
        num_7.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+7;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+7*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);
        });
        num_8.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+8;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+8*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);

        });
        num_9.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+9;
            }else{
                Rua.num[mode_flag]=Rua.num[mode_flag]+9*Math.pow(0.1, Xcode++);
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);

        });
        num_0.addActionListener(e -> {
            if(iseqsig){
                tf1s="";
                clear();
                iseqsig=false;
            }
            if(point_flag==0){
                Rua.num[mode_flag]=Rua.num[mode_flag]*10+0;
            }else{
                if(Xcode++==1){
                    zt=zt+".";
                }
                zt=zt+"0";
                Rua.num[mode_flag]=(double)Math.round(Rua.num[mode_flag]*Math.pow(10,Xcode-1))/Math.pow(10,Xcode-1);
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            s=s.concat(zt);
            tf1.setText(tf1s+s);


        });
        num_point.addActionListener(e -> {
            point_flag=1;
            tf1.setText(tf1.getText()+".");
        });
        plu.addActionListener(e -> {
            if(iseqsig){
                tf1.setText(sm);
                iseqsig=false;
            }
            if(launch_sig==0) {cal_mode=1;launch_sig=1;}
            c1.go(cal_mode);
            tf1s =tf1.getText()+"+";
            cal_mode_temp=cal_mode;
            cal_mode=1;
            Rua.num[mode_flag]=0;
            if(++mode_flag>1) mode_flag=0;
            sm=Double.toString(Rua.result_temp);
            if(sm.indexOf(".") > 0){
                sm = sm.replaceAll("0+?$", "");
                sm = sm.replaceAll("[.]$", "");
            }
            tf1.setText(tf1.getText()+"+");
            tf2.setText(sm);
            point_flag=0;
            Xcode=1;
            zt="";
        });
        sub.addActionListener(e -> {
            if(iseqsig){
                tf1.setText(sm);
                iseqsig=false;
            }
            if(launch_sig==0) {cal_mode=2;launch_sig=1;}
            c1.go(cal_mode);
            tf1s =tf1.getText()+"-";
            cal_mode_temp=cal_mode;
            cal_mode=2;
            Rua.num[mode_flag]=0;
            if(++mode_flag>1) mode_flag=0;

            sm = Double.toString(Rua.result_temp);
            if(sm.indexOf(".") > 0){
                sm = sm.replaceAll("0+?$", "");
                sm = sm.replaceAll("[.]$", "");
            }
            tf1.setText(tf1.getText()+"-");
            tf2.setText(sm);
            point_flag=0;
            Xcode=1;
            zt="";
        });
        mul.addActionListener(e -> {
            if(iseqsig){
                tf1.setText(sm);
                iseqsig=false;
            }
            if(launch_sig==0) {cal_mode=3;launch_sig=1;}
            c1.go(cal_mode);
            tf1s =tf1.getText()+"×";
            cal_mode_temp=cal_mode;
            cal_mode=3;
            Rua.num[mode_flag]=0;
            if(++mode_flag>1) mode_flag=0;
            c1.mode_t=mode_flag;
            sm = Double.toString(Rua.result_temp);
            if(sm.indexOf(".") > 0){
                sm = sm.replaceAll("0+?$", "");
                sm = sm.replaceAll("[.]$", "");
            }
            tf1.setText(tf1.getText()+"×");
            tf2.setText(sm);
            point_flag=0;
            Xcode=1;
            zt="";
        });
        dec.addActionListener(e -> {
            if(iseqsig){
                tf1.setText(sm);
                iseqsig=false;
            }
            if(launch_sig==0) {cal_mode=4;launch_sig=1;}
            c1.go(cal_mode);
            tf1s =tf1.getText()+"÷";
            cal_mode_temp=cal_mode;
            cal_mode=4;
            Rua.num[mode_flag]=0;
            if(++mode_flag>1) mode_flag=0;
            c1.mode_t=mode_flag;
            sm = Double.toString(Rua.result_temp);
            if(sm.indexOf(".") > 0){
                sm = sm.replaceAll("0+?$", "");
                sm = sm.replaceAll("[.]$", "");
            }
            tf1.setText(tf1.getText()+"÷");
            tf2.setText(sm);
            point_flag=0;
            Xcode=1;
            zt="";
        });
        cButton.addActionListener(e -> {
            tf1s="";
            clear();
            sm = Double.toString(Rua.result_temp);
            if(sm.indexOf(".") > 0){
                sm = sm.replaceAll("0+?$", "");
                sm = sm.replaceAll("[.]$", "");
            }
            tf1.setText("0");
            tf2.setText(sm);
        });
        num_eq.addActionListener(e -> {
            if(launch_sig==0) {cal_mode=0;launch_sig=1;}
            c1.go(cal_mode);
            tf1s =tf1.getText()+"=";
            cal_mode=0;
            Rua.num[mode_flag]=0;
            if(++mode_flag>1) mode_flag=0;
            c1.mode_t=mode_flag;
            sm = Double.toString(Rua.result_temp);
            if(sm.indexOf(".") > 0){
                sm = sm.replaceAll("0+?$", "");
                sm = sm.replaceAll("[.]$", "");
            }
            tf1.setText(tf1.getText()+"=");
            tf2.setText(sm);
            iseqsig=true;
            zt="";
        });
        tgButton.addActionListener(e -> {
            if(point_flag==0){
                Rua.num[mode_flag]= (Rua.num[mode_flag]-Rua.num[mode_flag]%10)/10;
            }else{
                if(Rua.num[mode_flag]%1==0) {
                    point_flag = 0;
                    Rua.num[mode_flag]= (Rua.num[mode_flag]-Rua.num[mode_flag]%10)/10;
                }else {
                    //暂时不会
                }
            }
            if(Rua.num[mode_flag]==0){
                cal_mode=cal_mode_temp;
            }
            s=Double.toString(Rua.num[mode_flag]);
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");
                s = s.replaceAll("[.]$", "");
            }
            tf1.setText(tf1s+s);
        });
    }
    private void clear(){
        cal_mode=0;
        launch_sig=0;
        Rua.result_temp=0;
        Rua.num[0]=0;
        Rua.num[1]=0;
        point_flag=0;
        Xcode=1;
        iseqsig=false;
        zt="";
    }

}
