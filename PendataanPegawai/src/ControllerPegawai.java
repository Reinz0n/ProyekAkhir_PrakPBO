
public class ControllerPegawai {
    
    private ModelPegawai mp;
    
    public void setMp(ModelPegawai mp){
        this.mp = mp;
    }
    
    public void resetFormL(ViewLogin viewLogin){
        String user = viewLogin.getUser().getText();
        String password = viewLogin.getPassword().getText();
        
        if((user.equals("") && password.equals(""))){
            
        } else{
            mp.resetForm();
        }
    }
    
    public void resetFormR(ViewRegister viewRegister){
        String user = viewRegister.getUser().getText();
        String password = viewRegister.getPassword().getText();
        
        if((user.equals("") && password.equals(""))){
            
        } else{
            mp.resetForm();
        }
    }
}
