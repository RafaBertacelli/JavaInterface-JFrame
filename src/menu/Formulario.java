package menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
	
	
    JLabel lbNome, lbCelular, lbEmail, lbMarca, lbModelo, lbCor, lbItens, imagemLabel;
    JTextField txNome, txCelular, txEmail;
    JButton btExibir, btOrcamento;
    JRadioButton rdMarca1, rdMarca2, rdMarca3, rdMarca4;
    ButtonGroup bgMarca;
    JComboBox<String> cbModelo;
    JCheckBox ckDirecaoHidraulica, ckRodasLigaLeve, ckArCondicionado, ckKitMultimidia;
    JComboBox<String> cbCor;

    public Formulario() {
        this.setTitle("Agencia");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        Color COR = new Color(200, 140, 240);
        this.getContentPane().setBackground(COR);

        JLabel bannerLabel = new JLabel();
        bannerLabel.setBounds(200, 0, 800, 100);
        ImageIcon bannerImage = new ImageIcon("E:/curso/DS/Carros/LogoVertical.png");
        bannerLabel.setIcon(bannerImage);
        add(bannerLabel);

        lbNome = new JLabel();
        lbNome.setBounds(20, 120, 60, 20);
        lbNome.setText("Nome");
        add(lbNome);

        txNome = new JTextField();
        txNome.setBounds(60, 120, 150, 20);
        add(txNome);

        lbCelular = new JLabel();
        lbCelular.setBounds(280, 120, 60, 20);
        lbCelular.setText("Celular");
        add(lbCelular);

        txCelular = new JTextField();
        txCelular.setBounds(330, 120, 120, 20);
        add(txCelular);

        lbEmail = new JLabel();
        lbEmail.setBounds(500, 120, 60, 20);
        lbEmail.setText("Email");
        add(lbEmail);

        txEmail = new JTextField();
        txEmail.setBounds(540, 120, 150, 20);
        add(txEmail);

        lbMarca = new JLabel();
        lbMarca.setBounds(20, 160, 100, 20);
        lbMarca.setText("Marca do Carro:");
        add(lbMarca);

        rdMarca1 = new JRadioButton();
        rdMarca1.setBounds(20, 180, 100, 20);
        rdMarca1.setText("Fiat");
        rdMarca1.setBackground(COR);
        add(rdMarca1);

        rdMarca2 = new JRadioButton();
        rdMarca2.setBounds(20, 200, 100, 20);
        rdMarca2.setText("Hyundai");
        rdMarca2.setBackground(COR);
        add(rdMarca2);

        rdMarca3 = new JRadioButton();
        rdMarca3.setBounds(20, 220, 100, 20);
        rdMarca3.setText("Renault");
        rdMarca3.setBackground(COR);
        add(rdMarca3);

        rdMarca4 = new JRadioButton();
        rdMarca4.setBounds(20, 240, 100, 20);
        rdMarca4.setText("Chevrolet");
        rdMarca4.setBackground(COR);
        add(rdMarca4);

        bgMarca = new ButtonGroup();
        bgMarca.add(rdMarca1);
        bgMarca.add(rdMarca2);
        bgMarca.add(rdMarca3);
        bgMarca.add(rdMarca4);

        lbModelo = new JLabel();
        lbModelo.setBounds(20, 280, 100, 20);
        lbModelo.setText("Modelo do Carro:");
        add(lbModelo);

        lbCor = new JLabel();
        lbCor.setBounds(20, 320, 100, 20);
        lbCor.setText("Cor do Carro:");
        add(lbCor);

        cbCor = new JComboBox<>();
        cbCor.setBounds(20, 340, 150, 20);
        cbCor.addItem("Branco");
        cbCor.addItem("Preto");
        cbCor.addItem("Prata");
        cbCor.addItem("Vermelho");
        cbCor.addItem("Azul");
        add(cbCor);
        
        

        cbModelo = new JComboBox<>();
        cbModelo.setBounds(20, 300, 150, 20);
        cbModelo.addItem("Sedan");
        cbModelo.addItem("SUV");
        cbModelo.addItem("Esportivo");
        add(cbModelo);

        imagemLabel = new JLabel();
        imagemLabel.setBounds(230, 260, 330, 200);
        add(imagemLabel);

        lbItens = new JLabel();
        lbItens.setBounds(20, 380, 100, 20);
        lbItens.setText("Itens Opcionais");
        add(lbItens);

        ckDirecaoHidraulica = new JCheckBox("Direção Hidráulica");
        ckDirecaoHidraulica.setBounds(20, 400, 150, 20);
        ckDirecaoHidraulica.setBackground(COR);
        add(ckDirecaoHidraulica);

        ckRodasLigaLeve = new JCheckBox("Rodas de Liga Leve");
        ckRodasLigaLeve.setBounds(20, 420, 150, 20);
        ckRodasLigaLeve.setBackground(COR);
        add(ckRodasLigaLeve);

        ckArCondicionado = new JCheckBox("Ar Condicionado");
        ckArCondicionado.setBounds(20, 440, 150, 20);
        ckArCondicionado.setBackground(COR);
        add(ckArCondicionado);

        ckKitMultimidia = new JCheckBox("Kit Multimídia");
        ckKitMultimidia.setBounds(20, 460, 150, 20);
        ckKitMultimidia.setBackground(COR);
        add(ckKitMultimidia);

        btExibir = new JButton();
        btExibir.setBounds(200, 500, 120, 40);
        btExibir.setText("Exibir Dados");
        btExibir.setBackground(Color.WHITE);
        btExibir.setForeground(Color.BLACK);
        add(btExibir);

        btOrcamento = new JButton();
        btOrcamento.setBounds(450, 500, 120, 40);
        btOrcamento.setText("Orçamento");
        btOrcamento.setBackground(Color.WHITE);
        btOrcamento.setForeground(Color.BLACK);
        add(btOrcamento);

        rdMarca1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarImagemModeloSelecionado("Fiat");
            }
        });

        rdMarca2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarImagemModeloSelecionado("Hyundai");
            }
        });

        rdMarca3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarImagemModeloSelecionado("Renault");
            }
        });

        rdMarca4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarImagemModeloSelecionado("Chevrolet");
            }
        });

        cbModelo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marcaSelecionada = getMarcaSelecionada();
                atualizarImagemModeloSelecionado(marcaSelecionada);
            }
        });

        btExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txNome.getText();
                String celular = txCelular.getText();
                String email = txEmail.getText();
                String modelo = cbModelo.getSelectedItem().toString();
                String marca = getMarcaSelecionada();
                String cor = cbCor.getSelectedItem().toString();
                String itensOpcionais = "";

                if (ckDirecaoHidraulica.isSelected()) {
                    itensOpcionais += "Direção Hidráulica, ";
                }
                if (ckRodasLigaLeve.isSelected()) {
                    itensOpcionais += "Rodas de Liga Leve, ";
                }
                if (ckArCondicionado.isSelected()) {
                    itensOpcionais += "Ar Condicionado, ";
                }
                if (ckKitMultimidia.isSelected()) {
                    itensOpcionais += "Kit Multimídia, ";
                }

                if (!itensOpcionais.isEmpty()) {
                    itensOpcionais = itensOpcionais.substring(0, itensOpcionais.length() - 2);
                    itensOpcionais = "Itens Opcionais: " + itensOpcionais;
                }

                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCelular: " + celular + "\nEmail: " + email +
                        " \nMarca do Carro: " + marca + " \nModelo do Carro: " + modelo + " \nCor do Carro: " + cor +
                        "\n" + itensOpcionais);
            }
        });

        btOrcamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txNome.getText();
                String celular = txCelular.getText();
                String email = txEmail.getText();
                String modelo = cbModelo.getSelectedItem().toString();
                String marca = getMarcaSelecionada();
                String cor = cbCor.getSelectedItem().toString();

                if (nome.isEmpty() || celular.isEmpty() || email.isEmpty() || marca.isEmpty() || modelo.isEmpty() || cor.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    double precoBase = calcularPrecoBase(modelo, marca);
                    double precoComItensOpcionais = adicionarItensOpcionais(precoBase);

                    double precoFinal = calcularPrecoFinal(precoComItensOpcionais, cor);

                    String mensagem = "Orçamento para o carro:\nMarca: " + marca + "\nModelo: " + modelo +
                            "\nCor: " + cor + "\nPreço com Itens Opcionais: R$ " + precoComItensOpcionais +
                            "\nPreço Final: R$ " + precoFinal;

                    Object[] options = {"Comprar", "Cancelar"};
                    int escolha = JOptionPane.showOptionDialog(null, mensagem, "Orçamento", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                    if (escolha == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!", "Compra", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Compra cancelada.", "Compra", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        this.setVisible(true);
    }

    
    	//InnerClass!!
    
    private void atualizarImagemModeloSelecionado(String marcaSelecionada) {
        String modeloSelecionado = cbModelo.getSelectedItem().toString();

        String caminhoImagem = "E:/curso/DS/Carros/" + marcaSelecionada + modeloSelecionado + ".png";

        ImageIcon imagemModelo = new ImageIcon(caminhoImagem);

        if (imagemModelo != null) {
            imagemLabel.setIcon(imagemModelo);
        } else {
            imagemLabel.setIcon(null);
        }
    }

    private double calcularPrecoBase(String modelo, String marca) {
        double precoBase = 0.0;
        if (marca.equals("Fiat")) {
            if (modelo.equals("Sedan")) {
                precoBase = 25000.0;
            } else if (modelo.equals("SUV")) {
                precoBase = 30000.0;
            } else if (modelo.equals("Esportivo")) {
                precoBase = 40000.0;
            }
        } else if (marca.equals("Hyundai")) {
            if (modelo.equals("Sedan")) {
                precoBase = 26000.0;
            } else if (modelo.equals("SUV")) {
                precoBase = 31000.0;
            } else if (modelo.equals("Esportivo")) {
                precoBase = 42000.0;
            }
        } else if (marca.equals("Renault")) {
            if (modelo.equals("Sedan")) {
                precoBase = 24000.0;
            } else if (modelo.equals("SUV")) {
                precoBase = 29000.0;
            } else if (modelo.equals("Esportivo")) {
                precoBase = 41000.0;
            }
        } else if (marca.equals("Chevrolet")) {
            if (modelo.equals("Sedan")) {
                precoBase = 23000.0;
            } else if (modelo.equals("SUV")) {
                precoBase = 28000.0;
            } else if (modelo.equals("Esportivo")) {
                precoBase = 59000.0;
            }
        }

        return precoBase;
    }

    private double adicionarItensOpcionais(double precoBase) {
        double custoItensOpcionais = 0.0;

        if (ckDirecaoHidraulica.isSelected()) {
            custoItensOpcionais += 1000.0;
        }
        if (ckRodasLigaLeve.isSelected()) {
            custoItensOpcionais += 1500.0;
        }
        if (ckArCondicionado.isSelected()) {
            custoItensOpcionais += 2000.0;
        }
        if (ckKitMultimidia.isSelected()) {
            custoItensOpcionais += 1200.0;
        }

        return precoBase + custoItensOpcionais;
    }

    private double calcularPrecoFinal(double precoBase, String cor) {
        if (cor.equals("Vermelho")) {
            precoBase += 1000.0;
        } else if (cor.equals("Azul")) {
            precoBase += 800.0;
        } else if (cor.equals("Preto")) {
            precoBase += 500.0;
        } else if (cor.equals("Branco")) {
            precoBase += 300.0;
        } else if (cor.equals("Prata")) {
            precoBase += 400.0;
        }

        return precoBase;
    }

    private String getMarcaSelecionada() {
        if (rdMarca1.isSelected()) {
            return "Fiat";
        } else if (rdMarca2.isSelected()) {
            return "Hyundai";
        } else if (rdMarca3.isSelected()) {
            return "Renault";
        } else if (rdMarca4.isSelected()) {
            return "Chevrolet";
        }
        return "";
    }

    public void limpar() {
        txNome.setText("");
        txCelular.setText("");
        txEmail.setText("");
        cbModelo.setSelectedIndex(0);
        bgMarca.clearSelection();
    }

    public static void main(String[] args) {
        new Formulario();
    }
}