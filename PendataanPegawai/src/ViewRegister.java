
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ViewRegister extends JFrame implements ActionListener, ListenerPegawai{
    
    JLabel luser = new JLabel("Username           :");
    JLabel lpw = new JLabel("Password           :");
    JTextField fuser = new JTextField(20);
    JTextField fpw = new JTextField(20);
    JButton bregister = new JButton("Register");
    JButton breset = new JButton("Reset");
    JButton bkembali = new JButton("Kembali");
    ControllerPegawai controller = new ControllerPegawai();
    ModelPegawai model = new ModelPegawai();
    
    public ViewRegister(){
        setTitle("Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(290, 145);
        setVisible(true);
        setLocationRelativeTo(null);
        
        setLayout(null);
        add(luser);
        add(fuser);
        add(lpw);
        add(fpw);
        add(bregister);
        add(breset);
        add(bkembali);
        
        luser.setBounds(10, 10, 120, 20);
        lpw.setBounds(10, 35, 120, 20);
        fuser.setBounds(140, 10, 120, 20);
        fpw.setBounds(140, 35, 120, 20);
        bkembali.setBounds(5, 80, 85, 20);
        bregister.setBounds(95, 80, 85, 20);
        breset.setBounds(185, 80, 85, 20);
        
        bregister.addActionListener(this);
        breset.addActionListener(this);
        bkembali.addActionListener(this);
        
        model.setPegawaiListener(this);
        controller.setMp(model);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bkembali || e.getSource() == bregister){
            this.dispose();
            new ViewLogin();
        }
        if(e.getSource() == breset){
            controller.resetFormR(this);
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
}
