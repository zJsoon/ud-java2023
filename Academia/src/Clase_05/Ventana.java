package Clase_05;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	private JPanel pCentral, pCentroArriba, pCentroAbajo, pSur;
	private JLabel lblName, lblEdad;
	private JTextField txtName, txtEdad;
	private JButton btnAdd, btnVerListado;
	private JFrame ventanaActual;
	
	public Ventana() {
		super();
		ventanaActual = this;
		setBounds(200,300,600,400);
		/*El layout por defecto de un panel es FlowLayout*/
		pCentroArriba = new JPanel();
		pCentroAbajo = new JPanel();
		pSur = new JPanel();
		pCentral = new JPanel();
		
		pCentral.setLayout(new GridLayout(2, 1));
		pCentral.add(pCentroArriba);
		pCentral.add(pCentroAbajo);
		getContentPane().add(pCentral, BorderLayout.CENTER);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		
		lblName = new JLabel("Introduce tu nombre: ");
		lblEdad = new JLabel("Introduce tu edad: ");
		txtName = new JTextField(20);
		txtEdad = new JTextField(20);
		pCentroArriba.add(lblName);
		pCentroArriba.add(txtName);
		pCentroAbajo.add(lblEdad);
		pCentroAbajo.add(txtEdad);
		
		
		btnAdd = new JButton("ADD PERSONA");
		btnVerListado = new JButton("VER LISTADO");
		pSur.add(btnAdd);
		pSur.add(btnVerListado);
		
		/*EVENTOS*/
		btnAdd.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				int edad = Integer.parseInt(txtEdad.getText());
				Persona p = new Persona(name, edad);
				Academia.insertarPersona(p);
				JOptionPane.showMessageDialog(null, "Persona añadida", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
				
				txtName.setText("");
				txtEdad.setText("");
				
				
			}
		});
		btnVerListado.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaListado(ventanaActual);		
				ventanaActual.setVisible(false);
			}
		});
		setVisible(true);
	}
}
