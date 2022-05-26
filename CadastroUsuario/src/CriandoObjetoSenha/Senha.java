package CriandoObjetoSenha;

public class Senha {

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    private String Usuario;

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    private String Senha;


    public String getConfirmeaSenha() {
        return ConfirmeaSenha;
    }

    public void setConfirmeaSenha(String confirmeaSenha) {
        ConfirmeaSenha = confirmeaSenha;
    }

    private String ConfirmeaSenha;

}
