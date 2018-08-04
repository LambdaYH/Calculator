import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rua {
    static double[] num={0,0};
    static double result_temp; //更高精度可以考虑BigDecimal
    public static void main(String[] args) {
        Rua that = new Rua();
        that.go();
    }
    private void go(){
        JFrame frame = new JFrame("计算器");
        JMenuBar menuBar=new JMenuBar();
        JMenu menu =new JMenu("关于");
        JMenuItem menuItem= new JMenuItem("使用方法");
        JMenuItem menuItem1= new JMenuItem("关于");
        menu.add(menuItem);
        menu.add(menuItem1);
        menuItem.addActionListener(new menugy());
        menuItem1.addActionListener(new menugy1());
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setContentPane(new UI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setVisible(true);
    }
    private  class menugy implements ActionListener{
        public void actionPerformed(ActionEvent e){
             JOptionPane.showMessageDialog(null,"使用方法:\n对于加减乘除来说，每次点击符号会在下部\n的运算框中显示前一次计算的结果\n \n对于各种改变本身值的运算:\n例如sin、根号之类，需要先输入值再进行运算\n \n \nBugs:\n退格号暂时不可用","使用说明",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private  class menugy1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"hhqsb");
        }
    }

}
