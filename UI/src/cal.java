import javax.swing.*;

public class cal {
    private int launch_sig=0;
    int mode_t;
    void clear(){
        launch_sig=0;
        mode_t=0;
    }
    void go(int cal_mode){
        switch(cal_mode){
            case 1: Rua.result_temp=Rua.num[0]+Rua.num[1]+Rua.result_temp;launch_sig=1;break;
            case 2: if(launch_sig==0) {
                        Rua.result_temp = Rua.num[0];
                        launch_sig=1;
                     }else{
                        Rua.result_temp=Rua.result_temp-Rua.num[0]-Rua.num[1];
                     }
                     break;
            case 3: if(launch_sig==0) {
                        Rua.result_temp = Rua.num[0] * 1;
                        launch_sig=1;
                     }else{
                        Rua.result_temp=Rua.result_temp*Rua.num[mode_t];
                    }
                    break;
            case 4:if(launch_sig==0) {
                        Rua.result_temp = Rua.num[0] / 1;
                        launch_sig = 1;
                    }else{
                        if(Rua.num[mode_t]!=0){
                            Rua.result_temp = Rua.result_temp/Rua.num[mode_t];
                        }else{
                           JOptionPane.showMessageDialog(null, "除数不能为0,请重新运算", "错误", JOptionPane.ERROR_MESSAGE);

                        }

                    }
                    break;

        }

    }
}

