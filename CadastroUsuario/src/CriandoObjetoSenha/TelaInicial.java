package CriandoObjetoSenha;

import javax.swing.*;
import CriandoObjetoSenha.Senha;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends Component {
    private JPanel panel1;
    private JLabel jlusuario;
    private JLabel jlsenha;
    private JLabel jlConfirmeaSenha;
    private JTextField txtusuario;
    private JPasswordField passsenha;
    private JPasswordField passConfirmeaSenha;
    private JButton btncadastrar;
    private JButton btnpesquisar;
    private JButton btnatualizar;
    private JButton btnexcluir;
    public Senha senhasempre;
    Senha s1 = new Senha();

    public TelaInicial() {
        btncadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                senhasempre = TrataBotaoInserir(s1);
            }
        });
        btnpesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrataPesquisa(senhasempre);
            }
        });
        btnatualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrataAtualizar(senhasempre);
            }
        });
        btnexcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrataExcluir(senhasempre);
            }
        });
    }

    public Senha TrataBotaoInserir (Senha s) {

    s.setUsuario(txtusuario.getText());
    s.setSenha(new String(passsenha.getPassword()));
    s.setConfirmeaSenha(new String(passConfirmeaSenha.getPassword()));

    if(s.getSenha().equals(s.getConfirmeaSenha())) {
        JOptionPane.showMessageDialog(this, "Senha Cadastrada com Sucesso!" + s.getUsuario());
    }
    else {
        JOptionPane.showMessageDialog(this, "Inválido! Digite a senha igual!");
    }

        return s;

    }

    public void TrataPesquisa (Senha s) {
        System.out.print(s.getUsuario());

        if (txtusuario.getText().equals(s.getUsuario())) {
            txtusuario.setText(s.getUsuario());
            passConfirmeaSenha.setText(s.getConfirmeaSenha());
            passsenha.setText(s.getSenha());
        }
        else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado!");
        }
    }

    public Senha TrataAtualizar (Senha s) {
        txtusuario.getText().equals(s.getUsuario());
        txtusuario.setText(s.getUsuario());
        passConfirmeaSenha.setText(s.getConfirmeaSenha());
        passsenha.setText(s.getSenha());

        s.setUsuario(txtusuario.getText());
        s.setSenha(new String(passsenha.getPassword()));
        s.setConfirmeaSenha(new String(passConfirmeaSenha.getPassword()));

        if(s.getSenha().equals(s.getConfirmeaSenha())) {
            JOptionPane.showMessageDialog(this, "Senha Cadastrada com Sucesso!" + s.getUsuario());
        }
        else {
            JOptionPane.showMessageDialog(this, "Inválido! Digite a senha igual!");
        }

        return s;
    }

    public void TrataExcluir (Senha s) {
        txtusuario.getText().equals(s.getUsuario());
        txtusuario.setText(s.getUsuario());
        passConfirmeaSenha.setText(s.getConfirmeaSenha());
        passsenha.setText(s.getSenha());

        if (s==null) {
            JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!" );
        }
        else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado!" );
        }
    }

}