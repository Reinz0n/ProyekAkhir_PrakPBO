
public class ModelPegawai {
    
    private String user, password;
    private ListenerPegawai listenerPegawai;
    
    protected void fireOnChange(){
        if(listenerPegawai != null){
            listenerPegawai.onChange(this);
        }
    }
    
    public void setPegawaiListener(ListenerPegawai listenerPegawai){
        this.listenerPegawai = listenerPegawai;
    }
    
    //Username
    public void setUser(String user){
        this.user = user;
        fireOnChange();
    }
    
    public String getUser(){
        return this.user;
    }
    
    //Password
    public void setPassword(String password){
        this.password = password;
        fireOnChange();
    }
    
    public String getPassword(){
        return this.password;
    }
    
    //Reset
    public void resetForm(){
        setUser("");
        setPassword("");
    }
}
