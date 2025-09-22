package Vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class VistaEjemplo extends JFrame {
	
	public VistaEjemplo() {
		super("EJEMPLO GUI");
		this.setSize(500, 450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Estructura
		this.setLayout(new GridBagLayout());
		GridBagConstraints reglas = new GridBagConstraints();
		
		// Fila 1
		JLabel titulo = new JLabel("EJEMPLO DE INTERFACE GRAFICA", JLabel.CENTER);
		titulo.setFont(new Font("", Font.BOLD, 22));
		titulo.setForeground(Color.BLUE);
		
		reglas.gridx = 0;
		reglas.gridy = 0;
		reglas.gridwidth = 3;
		reglas.fill = GridBagConstraints.BOTH;
		reglas.insets = new Insets(5, 5, 5, 5);
		reglas.weighty = 0.2;
		
		this.add(titulo,reglas);
		
		// Fila 2
		
		reglas.gridx = 0;
		reglas.gridy = 1;
		reglas.gridwidth = 1;
		reglas.weightx = 0.1;
		
		this.add(new JLabel("VALOR A:",JLabel.RIGHT),reglas);
		
		JTextField campoTexto = new JTextField();
		
		reglas.gridx = 1;
		reglas.weightx = 0.8;
		
		this.add(campoTexto,reglas);
		
		JButton botonAlto = new JButton("BOTON ALTO");
		botonAlto.setBackground(Color.GREEN);
		botonAlto.setFont(new Font("", Font.PLAIN, 7));
		botonAlto.setMargin(new Insets(2, 2, 2, 2));
		
		reglas.gridx = 2;
		reglas.fill = GridBagConstraints.NONE;
		reglas.anchor = GridBagConstraints.BASELINE_LEADING;
		reglas.weightx = 0.1;
		
		this.add(botonAlto,reglas);
		
		// Fila 3
		
		JPanel panelBotones = new JPanel(new GridBagLayout());
		
		JPanel panelChecks = new JPanel(new GridBagLayout());
		panelChecks.setBorder(new TitledBorder(new LineBorder(Color.GRAY), "CHECK"));
		
		reglas.gridx = 0;
		reglas.gridy = 0;
		reglas.anchor = GridBagConstraints.CENTER;
		panelChecks.add(new JCheckBox("CHECK A"),reglas);
		
		reglas.gridy = 1;
		panelChecks.add(new JCheckBox("CHECK B"),reglas);
		
		reglas.gridy = 2;
		panelChecks.add(new JCheckBox("CHECK C"),reglas);
		
		reglas.gridy = 0;
		reglas.insets = new Insets(5, 10, 5, 10);
		reglas.fill = GridBagConstraints.BOTH;
		panelBotones.add(panelChecks,reglas);
		
		JPanel panelRadio = new JPanel(new GridBagLayout());
		panelRadio.setBorder(new TitledBorder(new LineBorder(Color.GRAY), "RADIO"));
		
		ButtonGroup grupoRadio = new ButtonGroup();
		
		JRadioButton bA = new JRadioButton("RADIO A");
		JRadioButton bB = new JRadioButton("RADIO B");
		JRadioButton bC = new JRadioButton("RADIO C");
		
		grupoRadio.add(bA);
		grupoRadio.add(bB);
		grupoRadio.add(bC);
		
		reglas.gridx = 0;
		reglas.gridy = 0;
		reglas.insets = new Insets(5, 5, 5, 5);
		reglas.fill = GridBagConstraints.NONE;
		panelRadio.add(bA,reglas);
		
		reglas.gridy = 1;
		panelRadio.add(bB,reglas);
		
		reglas.gridy = 2;
		panelRadio.add(bC,reglas);
		
		reglas.gridx = 1;
		reglas.gridy = 0;
		reglas.fill = GridBagConstraints.BOTH;
		panelBotones.add(panelRadio,reglas);
		
		reglas.gridx = 0;
		reglas.gridy = 2;
		reglas.gridwidth = 3;
		reglas.anchor = GridBagConstraints.CENTER;
		reglas.weighty = 0.8;
		reglas.insets = new Insets(5, 10, 5, 10);
		
		this.add(panelBotones,reglas);
		
		// Fila 4 
		
		JComboBox<String> combobox = new JComboBox<String>();
		combobox.addItem("COMBO VALOR A");
		combobox.addItem("COMBO VALOR B");
		combobox.addItem("COMBO VALOR C");
		combobox.setForeground(Color.RED);
		
		reglas.gridy = 3;
		reglas.fill = GridBagConstraints.HORIZONTAL;
		reglas.anchor = GridBagConstraints.BASELINE;
		this.add(combobox,reglas);
		
		// Fila 5
		
		JPanel panelBtSur = new JPanel(new GridLayout(1, 3));
		
		JButton b1 = new JButton("BOTON 1");
		b1.setBackground(Color.YELLOW);
		
		JButton b2 = new JButton("BOTON 2");
		b2.setBackground(Color.BLUE);
		
		JButton b3 = new JButton("BOTON 3");
		b3.setBackground(Color.RED);
		
		panelBtSur.add(b1);
		panelBtSur.add(b2);
		panelBtSur.add(b3);
		
		reglas.gridy = 4;
		reglas.anchor = GridBagConstraints.SOUTH;
		reglas.insets = new Insets(0, 0, 0, 0);
		this.add(panelBtSur,reglas);
		
	}
	
}
