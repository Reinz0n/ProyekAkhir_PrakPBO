
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ViewLogin extends JFrame implements ActionListener, ListenerPegawai {
    
    JLabel luser = new JLabel("Username           :");
    JLabel lpw = new JLabel("Password           :");
    JLabel lreg =  new JLabel("Belum punya akun?");
    JTextField fuser = new JTextField(20);
    JTextField fpw = new JTextField(20);
    JButton blogin = new JButton("Login");
    JButton bregister = new JButton("Register");
    JButton breset = new JButton("Reset");
    ControllerPegawai controller = new ControllerPegawai();
    ModelPegawai model = new ModelPegawai();
    
    public ViewLogin(){
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(290, 190);
        setVisible(true);
        setLocationRelativeTo(null);
        
        setLayout(null);
        add(lreg);
        add(bregister);
        add(luser);
        add(fuser);
        add(lpw);
        add(fpw);
        add(blogin);
        add(breset);
        
        lreg.setBounds(50, 10, 120, 20);
        bregister.setBounds(170, 10, 85, 20);
        luser.setBounds(10, 45, 120, 20);
        lpw.setBounds(10, 70, 120, 20);
        fuser.setBounds(140, 45, 120, 20);
        fpw.setBounds(140, 70, 120, 20);
        blogin.setBounds(45, 120, 85, 20);
        breset.setBounds(145, 120, 85, 20);
        
        bregister.addActionListener(this);
        breset.addActionListener(this);
        
        model.setPegawaiListener(this);
        controller.setMp(model);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bregister){
            this.dispose();
            new ViewRegister();
        }
        if(e.getSource() == breset){
            controller.resetFormL(this);
        }
    }
    
    public JTextField getUser(){
        return fuser;
    }
    
    public JTextField getPassword(){
        return fpw;
    }
    
    public void onChange(ModelPegawai modelPegawai){
        fuser.setText(modelPegawai.getUser());
        fpw.setText(modelPegawai.getPassword());
    }
    
    public static void main(String[] args) {
        new ViewLogin();
    }
}
