package calc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;

import javax.swing.BoxLayout;
import javax.xml.crypto.Data;

public class ShowData implements ListSelectionListener, ActionListener,
        WindowListener {

    private JFrame frmNavegaoProduto;
    private JTable table;
    private JPanel mainPanel;
    private JPanel topPanel;
    private JLabel l1;
    private JLabel l0;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JTextField tf0;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JScrollPane scrollPane;
    private TableModel tableModel;

    private int linhaSel;
    private JButton btnFBW;
    private JButton btnSBW;
    private JButton btnSFW;
    private JButton btnFFW;
    private JButton btn_ordmuninome;
    private JButton btn_quantmunirep;
    private JButton btn_munisulkax;
    private JButton btn_municentoesmenos100;
    private JButton btn_municenoest50a150;
    private JButton bnt_ordenamunicipopula;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ShowData window = new ShowData();
                    window.frmNavegaoProduto.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ShowData() {
        initialize();
    }

    private void initialize() {
        frmNavegaoProduto = new JFrame();
        frmNavegaoProduto.setTitle("Navega\u00E7\u00E3o - Produto");
        frmNavegaoProduto.setSize(new Dimension(450, 530));
        frmNavegaoProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmNavegaoProduto.setLocationRelativeTo(null);
        frmNavegaoProduto.addWindowListener(this);

        mainPanel = new JPanel();
        frmNavegaoProduto.getContentPane().add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(null);

        // config. campos texto
        topPanel = new JPanel();
        topPanel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        topPanel.setBorder(new TitledBorder(null, "Produto",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        topPanel.setBounds(0, 0, 434, 170);
        mainPanel.add(topPanel);
        GridBagLayout gbl_topPanel = new GridBagLayout();
        gbl_topPanel.columnWidths = new int[]{95, 280};
        gbl_topPanel.rowHeights = new int[]{23, 23, 23, 23, 23};
        gbl_topPanel.columnWeights = new double[]{0.0, 0.0};
        gbl_topPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
        topPanel.setLayout(gbl_topPanel);

        l0 = new JLabel("Bobina:");
        GridBagConstraints gbc_l0 = new GridBagConstraints();
        gbc_l0.fill = GridBagConstraints.BOTH;
        gbc_l0.insets = new Insets(0, 0, 5, 5);
        gbc_l0.gridx = 0;
        gbc_l0.gridy = 0;
        topPanel.add(l0, gbc_l0);

        tf0 = new JTextField();
        GridBagConstraints gbc_tf0 = new GridBagConstraints();
        gbc_tf0.anchor = GridBagConstraints.NORTH;
        gbc_tf0.fill = GridBagConstraints.HORIZONTAL;
        gbc_tf0.insets = new Insets(0, 0, 5, 0);
        gbc_tf0.gridx = 1;
        gbc_tf0.gridy = 0;
        topPanel.add(tf0, gbc_tf0);
        tf0.setColumns(10);
        l1 = new JLabel("Cliente:");
        GridBagConstraints gbc_l1 = new GridBagConstraints();
        gbc_l1.fill = GridBagConstraints.BOTH;
        gbc_l1.insets = new Insets(0, 0, 5, 5);
        gbc_l1.gridx = 0;
        gbc_l1.gridy = 1;
        topPanel.add(l1, gbc_l1);

        tf1 = new JTextField();
        GridBagConstraints gbc_tf1 = new GridBagConstraints();
        gbc_tf1.anchor = GridBagConstraints.NORTH;
        gbc_tf1.fill = GridBagConstraints.HORIZONTAL;
        gbc_tf1.insets = new Insets(0, 0, 5, 0);
        gbc_tf1.gridx = 1;
        gbc_tf1.gridy = 1;
        topPanel.add(tf1, gbc_tf1);
        tf1.setColumns(10);
        l2 = new JLabel("Thickness:");
        GridBagConstraints gbc_l2 = new GridBagConstraints();
        gbc_l2.fill = GridBagConstraints.BOTH;
        gbc_l2.insets = new Insets(0, 0, 5, 5);
        gbc_l2.gridx = 0;
        gbc_l2.gridy = 2;
        topPanel.add(l2, gbc_l2);

        tf2 = new JTextField();
        GridBagConstraints gbc_tf2 = new GridBagConstraints();
        gbc_tf2.anchor = GridBagConstraints.NORTH;
        gbc_tf2.fill = GridBagConstraints.HORIZONTAL;
        gbc_tf2.insets = new Insets(0, 0, 5, 0);
        gbc_tf2.gridx = 1;
        gbc_tf2.gridy = 2;
        topPanel.add(tf2, gbc_tf2);
        tf2.setColumns(10);
        l3 = new JLabel("Lenght:");
        GridBagConstraints gbc_l3 = new GridBagConstraints();
        gbc_l3.fill = GridBagConstraints.BOTH;
        gbc_l3.insets = new Insets(0, 0, 5, 5);
        gbc_l3.gridx = 0;
        gbc_l3.gridy = 3;
        topPanel.add(l3, gbc_l3);

        tf3 = new JTextField();
        GridBagConstraints gbc_tf3 = new GridBagConstraints();
        gbc_tf3.anchor = GridBagConstraints.NORTH;
        gbc_tf3.fill = GridBagConstraints.HORIZONTAL;
        gbc_tf3.insets = new Insets(0, 0, 5, 0);
        gbc_tf3.gridx = 1;
        gbc_tf3.gridy = 3;
        topPanel.add(tf3, gbc_tf3);
        tf3.setColumns(10);
        l4 = new JLabel("Atrib:");
        GridBagConstraints gbc_l4 = new GridBagConstraints();
        gbc_l4.fill = GridBagConstraints.BOTH;
        gbc_l4.insets = new Insets(0, 0, 0, 5);
        gbc_l4.gridx = 0;
        gbc_l4.gridy = 4;
        topPanel.add(l4, gbc_l4);

        tf4 = new JTextField();
        GridBagConstraints gbc_tf4 = new GridBagConstraints();
        gbc_tf4.fill = GridBagConstraints.BOTH;
        gbc_tf4.gridx = 1;
        gbc_tf4.gridy = 4;
        topPanel.add(tf4, gbc_tf4);
        tf4.setColumns(10);

        // config. bot�es
        JPanel middlePanel = new JPanel();
        middlePanel.setBounds(0, 171, 434, 131);
        mainPanel.add(middlePanel);
        middlePanel.setLayout(new FlowLayout());
//		middlePanel.setLayout(null);

        btn_ordmuninome = new JButton(" Ordene a lista de Municipios por nome ");
        btn_ordmuninome.addActionListener(this);

        middlePanel.add(btn_ordmuninome);

        btn_quantmunirep = new JButton(" quantas vezes cada municipio se repete");
        btn_quantmunirep.addActionListener(this);

        middlePanel.add(btn_quantmunirep);

        btn_munisulkax = new JButton(" liste municipios da regiao Sul K a X ");
        btn_munisulkax.addActionListener(this);

        middlePanel.add(btn_munisulkax);

        btn_municentoesmenos100 = new JButton("liste municipios regiao Centro-oeste menos 100 mil");
        btn_municentoesmenos100.addActionListener(this);

        middlePanel.add(btn_municentoesmenos100);

        btn_municenoest50a150 = new JButton(" munic�pios regi�o centro-oeste popula��o 50.000 a 150.000 ");
        btn_municenoest50a150.addActionListener(this);

        middlePanel.add(btn_municenoest50a150);

        btnFBW = new JButton("<<");
        btnFBW.setBounds(63, 49, 72, 20);
        btnFBW.addActionListener(this);
        middlePanel.add(btnFBW);

        btnSBW = new JButton("<");
        btnSBW.setBounds(141, 49, 72, 20);
        btnSBW.addActionListener(this);
        middlePanel.add(btnSBW);

        btnSFW = new JButton(">");
        btnSFW.setBounds(214, 49, 72, 20);
        btnSFW.addActionListener(this);
        middlePanel.add(btnSFW);

        btnFFW = new JButton(">>");
        btnFFW.setBounds(293, 49, 72, 20);
        btnFFW.addActionListener(this);
        middlePanel.add(btnFFW);

        // config tabela
        tableModel = new TableModel();
        table = new JTable(tableModel);
        table.setFillsViewportHeight(true);
        table.getSelectionModel().addListSelectionListener(this);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 321, 434, 190);
        mainPanel.add(scrollPane);
        scrollPane.setViewportView(table);
        configTableColumns();
    }

    private void configTableColumns() {
        // // BOBINA
        // DefaultTableCellRenderer cr_0 = new DefaultTableCellRenderer();
        // cr_0.setHorizontalAlignment(JLabel.CENTER);
        // table.getColumnModel().getColumn(0).setCellRenderer(cr_0);
        //
        // // CLIENTE
        // DefaultTableCellRenderer cr_1 = new DefaultTableCellRenderer();
        // cr_1.setHorizontalAlignment(JLabel.CENTER);
        // table.getColumnModel().getColumn(1).setCellRenderer(cr_1);
        //
        // // THICKNESS
        // DefaultTableCellRenderer cr_2 = new DefaultTableCellRenderer();
        // cr_2.setHorizontalAlignment(JLabel.RIGHT);
        // table.getColumnModel().getColumn(2).setCellRenderer(cr_2);
        //
        // // LENGHT
        // DefaultTableCellRenderer cr_3 = new DefaultTableCellRenderer();
        // cr_3.setHorizontalAlignment(JLabel.RIGHT);
        // table.getColumnModel().getColumn(3).setCellRenderer(cr_3);
        //
        // // ATRIB
        // DefaultTableCellRenderer cr_4 = new DefaultTableCellRenderer();
        // cr_4.setHorizontalAlignment(JLabel.CENTER);
        // table.getColumnModel().getColumn(4).setCellRenderer(cr_4);

        // centralizar tudo
        DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(String.class, cr);
    }

    @Override
    public void valueChanged(ListSelectionEvent g0) {
        // l� valores da linha selecionada
        String[] rData = (String[]) tableModel.getRowData(table
                .getSelectedRow());
        System.out.println("\nvalueChanged(): " + rData[0] + ", " + rData[1]
                + ", " + rData[2] + ", " + rData[3] + ", " + rData[4]);
        // preenche formul�rio com valores da linha selecionada
        tf0.setText(rData[0]);
        tf1.setText(rData[1]);
        tf2.setText(rData[2]);
        tf3.setText(rData[3]);
        tf4.setText(rData[4]);
        // habilita/desabilita navegacao
        linhaSel = table.getSelectedRow();
        habilitaNavegacao();
        System.out.println("valueChanged(), selectedRow: " + linhaSel
                + " habilitou navegacao");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnFFW) {
            linhaSel = table.getRowCount() - 1;
            table.requestFocus();
            table.changeSelection(linhaSel, 0, false, false);
        }
        if (e.getSource() == btnSFW) {
            linhaSel++;
            table.requestFocus();
            table.changeSelection(linhaSel, 0, false, false);
        }
        if (e.getSource() == btnSBW) {
            linhaSel--;
            table.requestFocus();
            table.changeSelection(linhaSel, 0, false, false);
        }
        if (e.getSource() == btnFBW) {
            linhaSel = 0;
            table.requestFocus();
            table.changeSelection(linhaSel, 0, false, false);
        }
        if (e.getSource() == bnt_ordenamunicipopula) {
            System.out.println("2");
        }
        if (e.getSource() == btn_municenoest50a150) {
            List<Municipio> munis = null;
            String[][] data = (String[][]) DataLoader.getData();
            munis = DataLoader.dataToList(data);
            String[][] datai = (String[][]) DataLoader.voltaDatai(munis);
            List<Municipio> relt = ControllerShowData.municenoest50a150(munis);
            DataLoader.setData(datai);
            SuporteArquivo.imprimeArq(relt);
        }
        if (e.getSource() == btn_quantmunirep) {

            List<Municipio> munis = null;
            String[][] data = (String[][]) DataLoader.getData();
            munis = DataLoader.dataToList(data);
            String[][] datai = (String[][]) DataLoader.voltaDatai(munis);
            List<String> relt = ControllerShowData.quntosMunicipiorepet(munis);
            DataLoader.setData(datai);
            for (int i = 0; i < relt.size(); i++) {
                System.out.println(relt.get(i).toString());
            }

        }
        if (e.getSource() == btn_municentoesmenos100) {
            System.out.println("2");
        }
        if (e.getSource() == btn_ordmuninome) {
            List<Municipio> munis = null;
            String[][] data = (String[][]) DataLoader.getData();
            munis = DataLoader.dataToList(data);
            ControllerShowData.ordenaNome(munis);
            String[][] datai = (String[][]) DataLoader.voltaDatai(munis);
            tableModel.setdata(datai);
            DataLoader.setData(datai);

        }
//                if (e.getSource() == btn_ordenamunicipio) {
        // guarda Data em uma variavel
//			  String[][] data =  (String[][]) DataLoader.getData(); 
        // Converte matriz em lista ...
//		munis = DataLoader.dataToList(data);
        //Ordena a lista de municipio em ordem alfabetica   
//		munis = ControllerShowData.ordenaNome(munis);
        //transforma em data e set...                 
//             DataLoader.convertData(munis);
//		  String[] vet=new String[27];
//          String[] vet2=new String[27];
//          
//          vet[0]= "AC"; vet2[0] = "Acre";  
//          vet[1]= "AL";  vet2[1] = "Alagoas";  
//          vet[2]= "AP";  vet2[2] = "Amapa";  
//          vet[3]= "AM"; vet2[3] = "Amazonas"; 
//          vet[4]="BA"; vet2[4] ="Bahia" ; 
//          vet[5]="CE";vet2[5] = "Ceara"; 
//          vet[6]="DF";vet2[6] = "Distrito Federal";
//          vet[7]="ES";vet2[7] = "Espirito Santo";
//          vet[8]="GO";vet2[8] = "Goias";
//          vet[9]="MA"; vet2[9] = "Maranhao";
//          vet[10]="MT";vet2[10] = "Mato Grosso"; 
//          vet[11]="MS";vet2[11] = "Mato Grosso do Sul";
//          vet[12]="MG";vet2[12] = "Minas Gerais"; 
//          vet[13]="PA";vet2[13] = "Para";
//          vet[14]="PB";vet2[14] = "Paraiba";
//          vet[15]="PR";vet2[15] = "Parana"; 
//          vet[16]="PE";vet2[16] = "Pernambuco"; 
//          vet[17]="PI";vet2[17] = "Piaua";
//          vet[18]="RR";vet2[18] = "Roraima"; 
//          vet[19]="RO";vet2[19] = "Rondonia";
//          vet[20]="RJ";vet2[20] = "Rio de Janeiro"; 
//         vet[21]= "RN";vet2[21] = "Rio Grande do Norte"; 
//         vet[22]="RS";vet2[22] = "Rio Grande do Sul"; 
//          vet[23]="SC"; vet2[23] = "Santa Catarina";
//          vet[24]= "SP"; vet2[24] = "Sao Paulo";
//          vet[25]= "SE";vet2[25] = "Sergipe"; 
//          vet[26]= "TO";vet2[26] = "Tocantins";
//          System.out.println("");
//          System.out.println("quantidade de minucipios por estado \n");
//            @#$@%$#¨%$¨$#$  falta set na Jtable XD @@##$@#%@%$¨$¨#
//		}

//                    if (e.getSource() == btn_) {
//                        List<Municipio>munis =null; 
//                      String[][] data =  (String[][]) DataLoader.getData();  
//                      munis = DataLoader.dataToList( data);
//                      
//                       DataLoader.convertData(munis);
        //            @#$@%$#¨%$¨$#$  falta set na Jtable XD @@##$@#%@%$¨$¨#
//		}
    }

    // carrega o formulario com os valores da primeira linha da tabela
    @Override
    public void windowActivated(WindowEvent arg0) {
        // obtem a primeira linha da tabela
        String[] rData = (String[]) tableModel.getRowData(0);
        System.out.println("\nwindowActivated(): " + rData[0] + ", " + rData[1]
                + ", " + rData[2] + ", " + rData[3] + ", " + rData[4]);
        // carrega os campos do formulario
        tf0.setText(rData[0]);
        tf1.setText(rData[1]);
        tf2.setText(rData[2]);
        tf3.setText(rData[3]);
        tf4.setText(rData[4]);
        // seleciona a primeira linha da tabela
        linhaSel = 0;
        table.setRowSelectionInterval(0, 0);
        // posiciona o foco na primeira calula da tabela
        table.requestFocus();
        table.changeSelection(linhaSel, 0, false, false);
        // habilita navegacao
        habilitaNavegacao();
        System.out.println("windowActivated(): habilitou navegacao:)");
    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    private void habilitaNavegacao() {
        System.out.println("habilitaNavegacao(): linhaSel: " + linhaSel
                + " table.getRowCount(): " + table.getRowCount());
        if (linhaSel == 0) {
            System.out.println("INI--->linhaSel: " + linhaSel);
            btnSBW.setEnabled(false);
            btnFBW.setEnabled(false);
            btnSFW.setEnabled(true);
            btnFFW.setEnabled(true);
        } else if (linhaSel == table.getRowCount() - 1) {
            System.out.println("FIM--->linhaSel: " + linhaSel);
            btnSBW.setEnabled(true);
            btnFBW.setEnabled(true);
            btnSFW.setEnabled(false);
            btnFFW.setEnabled(false);
        } else {
            System.out.println("MEIO--->linhaSel: " + linhaSel);
            btnSBW.setEnabled(true);
            btnFBW.setEnabled(true);
            btnSFW.setEnabled(true);
            btnFFW.setEnabled(true);
        }
    }
}
