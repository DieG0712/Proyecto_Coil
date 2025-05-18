package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import abuelo.Producto;
import arreglo.Arreglo_Productos;
import hijo.Camisa;
import hijo.Carne;
import hijo.Frutas;
import hijo.Microondas;
import hijo.Pantalon;
import hijo.Refrigeradora;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class gui extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox cboProducto;
	private JLabel lblNewLabel_1;
	private JTextField txtNomProducto;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtPrecioProducto;
	private JLabel lblNewLabel_4;
	private JTextField txtCantStock;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtMarcaElectro;
	private JLabel lblNewLabel_7;
	private JTextField txtModeloElectro;
	private JLabel lblNewLabel_8;
	private JTextField txtGarantiaElectro;
	private JLabel lblNewLabel_9;
	private JTextField txtTallaRopa;
	private JTextField txtColorRopa;
	private JTextField txtMarcaRopa;
	private JTextField txtModeloRopa;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Seleccionar Producto");
			lblNewLabel.setBounds(10, 11, 125, 14);
			contentPane.add(lblNewLabel);
		}
		{
			cboProducto = new JComboBox();
			cboProducto.addItemListener(this);
			cboProducto.setModel(new DefaultComboBoxModel(new String[] {"Electrodomesticos", "Ropa", "Alimentos"}));
			cboProducto.setBounds(141, 7, 155, 22);
			contentPane.add(cboProducto);
		}
		{
			lblNewLabel_1 = new JLabel("Nombre del Producto:");
			lblNewLabel_1.setBounds(10, 42, 125, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtNomProducto = new JTextField();
			txtNomProducto.setBounds(145, 39, 111, 20);
			contentPane.add(txtNomProducto);
			txtNomProducto.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("ROPA");
			lblNewLabel_2.setForeground(Color.BLUE);
			lblNewLabel_2.setBackground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(357, 120, 47, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Precio del Producto:");
			lblNewLabel_3.setBounds(266, 39, 121, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtPrecioProducto = new JTextField();
			txtPrecioProducto.setColumns(10);
			txtPrecioProducto.setBounds(404, 36, 111, 20);
			contentPane.add(txtPrecioProducto);
		}
		{
			lblNewLabel_4 = new JLabel("Cantidad de Stock:");
			lblNewLabel_4.setBounds(525, 42, 111, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtCantStock = new JTextField();
			txtCantStock.setColumns(10);
			txtCantStock.setBounds(667, 36, 111, 20);
			contentPane.add(txtCantStock);
		}
		{
			lblNewLabel_5 = new JLabel("ELECTRODOMESTICOS");
			lblNewLabel_5.setForeground(new Color(255, 128, 0));
			lblNewLabel_5.setBackground(Color.WHITE);
			lblNewLabel_5.setBounds(322, 67, 136, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("Marca del Producto:");
			lblNewLabel_6.setBounds(10, 98, 121, 14);
			contentPane.add(lblNewLabel_6);
		}
		{
			txtMarcaElectro = new JTextField();
			txtMarcaElectro.setColumns(10);
			txtMarcaElectro.setBounds(145, 95, 111, 20);
			contentPane.add(txtMarcaElectro);
		}
		{
			lblNewLabel_7 = new JLabel("Modelo del Producto:");
			lblNewLabel_7.setBounds(266, 95, 121, 14);
			contentPane.add(lblNewLabel_7);
		}
		{
			txtModeloElectro = new JTextField();
			txtModeloElectro.setColumns(10);
			txtModeloElectro.setBounds(404, 95, 111, 20);
			contentPane.add(txtModeloElectro);
		}
		{
			lblNewLabel_8 = new JLabel("Garantia del Producto:");
			lblNewLabel_8.setBounds(525, 98, 131, 14);
			contentPane.add(lblNewLabel_8);
		}
		{
			txtGarantiaElectro = new JTextField();
			txtGarantiaElectro.setColumns(10);
			txtGarantiaElectro.setBounds(667, 95, 111, 20);
			contentPane.add(txtGarantiaElectro);
		}
		{
			lblNewLabel_9 = new JLabel("ALIMENTOS");
			lblNewLabel_9.setForeground(new Color(64, 0, 128));
			lblNewLabel_9.setBackground(Color.WHITE);
			lblNewLabel_9.setBounds(344, 176, 80, 14);
			contentPane.add(lblNewLabel_9);
		}
		
		JLabel lblNewLabel_10 = new JLabel("Talla:");
		lblNewLabel_10.setBounds(53, 148, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		txtTallaRopa = new JTextField();
		txtTallaRopa.setEditable(false);
		txtTallaRopa.setColumns(10);
		txtTallaRopa.setBounds(86, 145, 93, 20);
		contentPane.add(txtTallaRopa);
		
		JLabel lblNewLabel_11 = new JLabel("Color:");
		lblNewLabel_11.setBounds(217, 148, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		txtColorRopa = new JTextField();
		txtColorRopa.setEditable(false);
		txtColorRopa.setColumns(10);
		txtColorRopa.setBounds(273, 145, 93, 20);
		contentPane.add(txtColorRopa);
		
		JLabel lblNewLabel_12 = new JLabel("Marca:");
		lblNewLabel_12.setBounds(390, 148, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		txtMarcaRopa = new JTextField();
		txtMarcaRopa.setEditable(false);
		txtMarcaRopa.setColumns(10);
		txtMarcaRopa.setBounds(446, 145, 93, 20);
		contentPane.add(txtMarcaRopa);
		
		JLabel lblNewLabel_13 = new JLabel("Modelo:");
		lblNewLabel_13.setBounds(568, 148, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		txtModeloRopa = new JTextField();
		txtModeloRopa.setEditable(false);
		txtModeloRopa.setColumns(10);
		txtModeloRopa.setBounds(624, 145, 93, 20);
		contentPane.add(txtModeloRopa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 350, 768, 265);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnNewButton = new JButton("REGISTRAR");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(10, 316, 107, 23);
		contentPane.add(btnNewButton);
		{
			btnNewButton_1 = new JButton("MOSTRAR INFORMACIÓN");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(127, 316, 187, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			lblNewLabel_14 = new JLabel("Fecha de Vencimiento:");
			lblNewLabel_14.setBounds(240, 204, 136, 14);
			contentPane.add(lblNewLabel_14);
		}
		{
			txtFeVenciAlimentos = new JTextField();
			txtFeVenciAlimentos.setEditable(false);
			txtFeVenciAlimentos.setBounds(372, 201, 86, 20);
			contentPane.add(txtFeVenciAlimentos);
			txtFeVenciAlimentos.setColumns(10);
		}
		{
			lblNewLabel_15 = new JLabel("Peso:");
			lblNewLabel_15.setBounds(468, 204, 46, 14);
			contentPane.add(lblNewLabel_15);
		}
		{
			txtPesoAlimentos = new JTextField();
			txtPesoAlimentos.setEditable(false);
			txtPesoAlimentos.setBounds(510, 201, 86, 20);
			contentPane.add(txtPesoAlimentos);
			txtPesoAlimentos.setColumns(10);
		}
		{
			lblNewLabel_16 = new JLabel("Conservación:");
			lblNewLabel_16.setBounds(606, 204, 93, 14);
			contentPane.add(lblNewLabel_16);
		}
		{
			txtConserAlimentos = new JTextField();
			txtConserAlimentos.setEditable(false);
			txtConserAlimentos.setBounds(692, 201, 86, 20);
			contentPane.add(txtConserAlimentos);
			txtConserAlimentos.setColumns(10);
		}
		{
			lblNewLabel_17 = new JLabel("Nombre de la Alimento:");
			lblNewLabel_17.setBounds(10, 204, 136, 14);
			contentPane.add(lblNewLabel_17);
		}
		{
			txtNomAlimento = new JTextField();
			txtNomAlimento.setEditable(false);
			txtNomAlimento.setBounds(144, 201, 86, 20);
			contentPane.add(txtNomAlimento);
			txtNomAlimento.setColumns(10);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	private JButton btnNewButton_1;
	private JTextArea txtS;
	private JLabel lblNewLabel_14;
	private JTextField txtFeVenciAlimentos;
	private JLabel lblNewLabel_15;
	private JTextField txtPesoAlimentos;
	private JLabel lblNewLabel_16;
	private JTextField txtConserAlimentos;
	private JLabel lblNewLabel_17;
	private JTextField txtNomAlimento;
	void Imprimir(String s)
	{
		txtS.append(s+"\n");
	}
	void Listado(Producto p)
	{
		 StringBuilder sb = new StringBuilder();
		    sb.append("📦 Producto Registrado 📦\n");
		    sb.append("---------------------------\n");
		    sb.append("Nombre: ").append(p.getNomProducto()).append("\n");
		    sb.append("Precio: S/ ").append(p.getPrecio()).append("\n");
		    sb.append("Stock: ").append(p.getCantStok()).append(" unidades\n");
		    sb.append("---------------------------\n");
		    sb.append(p.registrar()).append("\n");
		    sb.append(p.mostrarInfo()).append("\n");
		    sb.append("===========================\n");

		    Imprimir(sb.toString());
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) 
	{
		txtS.setText("");
		int posi = cboProducto.getSelectedIndex();
		String nomProducto = txtNomProducto.getText();
		double precio = Double.parseDouble(txtPrecioProducto.getText());
		int cantStock = Integer.parseInt(txtCantStock.getText());
		Producto prod = null;
		switch (posi) {
		case 0://Electrodomesticos
			String marcaele = txtMarcaElectro.getText();
			String modeloele = txtModeloElectro.getText();
			String garantia = txtGarantiaElectro.getText();
			
			if(nomProducto.equalsIgnoreCase("Microondas"))
			{
				prod = new Microondas(nomProducto, precio, cantStock, marcaele, modeloele, cantStock);
				Listado(prod);
			}
			else if (nomProducto.equalsIgnoreCase("Refrigeradora"))
			{
				prod = new Refrigeradora(nomProducto, precio, cantStock, marcaele, modeloele, cantStock);
				Listado(prod);
			}
			break;
		case 1://Ropa
			double talla = Double.parseDouble(txtTallaRopa.getText());
			String color = txtColorRopa.getText();
			String marca = txtMarcaRopa.getText();
			String modelo = txtModeloRopa.getText();
			
			if(nomProducto.equalsIgnoreCase("Camisa"))
			{
				prod = new Camisa(nomProducto, precio, cantStock, cantStock, color, marca, modelo);
				Listado(prod);
			}
			else if (nomProducto.equalsIgnoreCase("Pantalon"))
			{
				prod = new Pantalon(nomProducto, precio, cantStock, cantStock, color, marca, modelo);
				Listado(prod);
			}
			else {
	            JOptionPane.showMessageDialog(null, "Nombre de prenda no válida. Por ahora solo se puede registrar 'Camisa' o 'Pantalon'.");
	            return;
	        }
			break;

		case 2://Alimentos
			String FechaVencimiento = txtFeVenciAlimentos.getText();
			double peso = Double.parseDouble(txtPesoAlimentos.getText());
			String conserva = txtConserAlimentos.getText();
			String nomAlime = txtNomAlimento.getText();
			
			if(nomProducto.equalsIgnoreCase("Frutas"))
			{
				prod = new Frutas(nomProducto, precio, cantStock, FechaVencimiento, peso, conserva, nomAlime);
				Listado(prod);
			}
			else if (nomProducto.equalsIgnoreCase("Carne"))
			{
				prod = new Carne(nomProducto, precio, cantStock, FechaVencimiento, peso, conserva, nomAlime);
				Listado(prod);
			}
			else {
	            JOptionPane.showMessageDialog(null, "Nombre de Alimento no válido. Por ahora solo se puede registrar 'Frutas' o 'Carne'.");
	            return;
	        }
			break;
		}
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) 
	{
		
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboProducto) {
			do_comboBox_itemStateChanged(e);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent e) 
	{
		
		Desactivar();
		int posi = cboProducto.getSelectedIndex();
		switch (posi) {
		case 0://Electrodomesticos
			txtMarcaElectro.setEditable(true);
			txtModeloElectro.setEditable(true);
			txtGarantiaElectro.setEditable(true);
			txtNomProducto.setText("");
			txtPrecioProducto.setText("");
			txtCantStock.setText("");
			txtMarcaElectro.setText("");
			txtModeloElectro.setText("");
			txtGarantiaElectro.setText("");
			txtNomAlimento.setText("");
			txtFeVenciAlimentos.setText("");
			txtPesoAlimentos.setText("");
			txtConserAlimentos.setText("");
			txtTallaRopa.setText("");
			txtColorRopa.setText("");
			txtMarcaRopa.setText("");
			txtModeloRopa.setText("");
			
			break;
		case 1://Ropa
			txtTallaRopa.setEditable(true);
			txtColorRopa.setEditable(true);
			txtMarcaRopa.setEditable(true);
			txtModeloRopa.setEditable(true);
			txtNomProducto.setText("");
			txtPrecioProducto.setText("");
			txtCantStock.setText("");
			txtMarcaElectro.setText("");
			txtModeloElectro.setText("");
			txtGarantiaElectro.setText("");
			txtNomAlimento.setText("");
			txtFeVenciAlimentos.setText("");
			txtPesoAlimentos.setText("");
			txtConserAlimentos.setText("");
			txtTallaRopa.setText("");
			txtColorRopa.setText("");
			txtMarcaRopa.setText("");
			txtModeloRopa.setText("");
			break;

		default://Alimentos
			txtFeVenciAlimentos.setEditable(true);
			txtPesoAlimentos.setEditable(true);
			txtConserAlimentos.setEditable(true);
			txtNomAlimento.setEditable(true);
			txtNomProducto.setText("");
			txtPrecioProducto.setText("");
			txtCantStock.setText("");
			txtMarcaElectro.setText("");
			txtModeloElectro.setText("");
			txtGarantiaElectro.setText("");
			txtNomAlimento.setText("");
			txtFeVenciAlimentos.setText("");
			txtPesoAlimentos.setText("");
			txtConserAlimentos.setText("");
			txtTallaRopa.setText("");
			txtColorRopa.setText("");
			txtMarcaRopa.setText("");
			txtModeloRopa.setText("");
			
			break;
		}
	}
	void Desactivar()
	{
		txtMarcaElectro.setEditable(false);
		txtModeloElectro.setEditable(false);
		txtGarantiaElectro.setEditable(false);
		txtTallaRopa.setEditable(false);
		txtColorRopa.setEditable(false);
		txtMarcaRopa.setEditable(false);
		txtModeloRopa.setEditable(false);
		txtFeVenciAlimentos.setEditable(false);
		txtPesoAlimentos.setEditable(false);
		txtConserAlimentos.setEditable(false);
		txtNomAlimento.setEditable(false);
		
	}
	void Limpiar()
	{
		txtS.setText("");
	}
}

