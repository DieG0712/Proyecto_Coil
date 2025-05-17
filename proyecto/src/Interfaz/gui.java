package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;

public class gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1;
	private JTextField txtNomProducto;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtPrecioProducto;
	private JLabel lblNewLabel_4;
	private JTextField txtCantStock;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField;
	private JLabel lblNewLabel_7;
	private JTextField textField_1;
	private JLabel lblNewLabel_8;
	private JTextField textField_2;
	private JLabel lblNewLabel_9;

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
		setBounds(100, 100, 804, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Seleccionar Producto");
			lblNewLabel.setBounds(10, 11, 121, 14);
			contentPane.add(lblNewLabel);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Electrodomesticos", "Alimentos", "Ropa"}));
			comboBox.setBounds(125, 7, 121, 22);
			contentPane.add(comboBox);
		}
		{
			lblNewLabel_1 = new JLabel("Nombre del Producto:");
			lblNewLabel_1.setBounds(10, 71, 125, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtNomProducto = new JTextField();
			txtNomProducto.setBounds(145, 68, 111, 20);
			contentPane.add(txtNomProducto);
			txtNomProducto.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("ROPA");
			lblNewLabel_2.setForeground(Color.BLUE);
			lblNewLabel_2.setBackground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(357, 209, 47, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Precio del Producto:");
			lblNewLabel_3.setBounds(266, 68, 121, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtPrecioProducto = new JTextField();
			txtPrecioProducto.setColumns(10);
			txtPrecioProducto.setBounds(404, 65, 111, 20);
			contentPane.add(txtPrecioProducto);
		}
		{
			lblNewLabel_4 = new JLabel("Cantidad de Stock:");
			lblNewLabel_4.setBounds(525, 71, 111, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtCantStock = new JTextField();
			txtCantStock.setColumns(10);
			txtCantStock.setBounds(667, 65, 111, 20);
			contentPane.add(txtCantStock);
		}
		{
			lblNewLabel_5 = new JLabel("ELECTRODOMESTICOS");
			lblNewLabel_5.setForeground(new Color(255, 128, 0));
			lblNewLabel_5.setBackground(Color.WHITE);
			lblNewLabel_5.setBounds(322, 96, 136, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("Marca del Producto:");
			lblNewLabel_6.setBounds(10, 127, 121, 14);
			contentPane.add(lblNewLabel_6);
		}
		{
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(145, 124, 111, 20);
			contentPane.add(textField);
		}
		{
			lblNewLabel_7 = new JLabel("Modelo del Producto:");
			lblNewLabel_7.setBounds(266, 124, 121, 14);
			contentPane.add(lblNewLabel_7);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(404, 124, 111, 20);
			contentPane.add(textField_1);
		}
		{
			lblNewLabel_8 = new JLabel("Garantia del Producto:");
			lblNewLabel_8.setBounds(525, 127, 131, 14);
			contentPane.add(lblNewLabel_8);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(667, 124, 111, 20);
			contentPane.add(textField_2);
		}
		{
			lblNewLabel_9 = new JLabel("ALIMENTOS");
			lblNewLabel_9.setForeground(new Color(64, 0, 128));
			lblNewLabel_9.setBackground(Color.WHITE);
			lblNewLabel_9.setBounds(340, 149, 80, 14);
			contentPane.add(lblNewLabel_9);
		}
	}
}
