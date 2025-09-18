package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Modelo.Fecha;

public class VistaFecha extends JFrame implements ActionListener {
	JTextField tfdia1, tfdia2, tfmes1, tfmes2, tfanno1, tfanno2, tfdiastotal;
	JLabel results;
	JButton calcular;
	
	public VistaFecha() {
		super("Calculo de días entre fechas");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Estructura
		this.setLayout(new GridBagLayout());
		GridBagConstraints reglas = new GridBagConstraints();
		
		// Fila 1
		
		JLabel etiquetaf1 = new JLabel("FECHA 1:",JLabel.CENTER);
		
		reglas.gridx = 0;
		reglas.gridy = 0;
		reglas.gridwidth = 3;
		reglas.weightx = 1.0;
		reglas.weighty = 1.0;
		reglas.fill = GridBagConstraints.BOTH;
		
		this.add(etiquetaf1,reglas);
		
		// Fila 2
		
		tfdia1 = new JTextField();
		
		reglas.gridx = 0;
		reglas.gridy = 1;
		reglas.gridwidth = 1;
		reglas.insets = new Insets(20, 20, 20, 20);
		
		this.add(tfdia1,reglas);
		
		tfmes1 = new JTextField();
		
		reglas.gridx = 1;
		
		this.add(tfmes1,reglas);
		
		tfanno1 = new JTextField();
		
		reglas.gridx = 2;
		
		this.add(tfanno1,reglas);
		
		// Fila 3
		
		JLabel etiquetaf2 = new JLabel("FECHA 2:",JLabel.CENTER);
		
		reglas.gridx = 0;
		reglas.gridy = 2;
		reglas.gridwidth = 3;
		
		this.add(etiquetaf2,reglas);
		
		// Fila 4
		
		tfdia2 = new JTextField();
		
		reglas.gridx = 0;
		reglas.gridy = 3;
		reglas.gridwidth = 1;
		
		this.add(tfdia2,reglas);
		
		tfmes2 = new JTextField();
		
		reglas.gridx = 1;
		
		this.add(tfmes2,reglas);
		
		tfanno2 = new JTextField();
		
		reglas.gridx = 2;
		
		this.add(tfanno2,reglas);
		
		// Fila 5
		
		calcular = new JButton("CALCULAR");
		calcular.addActionListener(this);
		
		reglas.gridx = 1;
		reglas.gridy = 4;
		
		this.add(calcular,reglas);
		
		// Fila 6
		
		results = new JLabel("LOS DIAS FALTANTES:",JLabel.CENTER);
		
		reglas.gridx = 0;
		reglas.gridy = 5;
		reglas.gridwidth = 2;
		
		this.add(results,reglas);
		
		tfdiastotal = new JTextField();
		tfdiastotal.setEditable(false);
		
		reglas.gridx = 2;
		reglas.gridwidth = 1;
		
		this.add(tfdiastotal,reglas);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		if(btn == calcular) {
			Fecha fecha1 = null; 
			Fecha fecha2= null;
			int dia1,mes1,anno1;
			
			dia1 = Integer.parseInt(tfdia1.getText());
			mes1 = Integer.parseInt(tfmes1.getText());
			anno1 = Integer.parseInt(tfanno1.getText());
			
			int dia2,mes2,anno2;
			
			dia2 = Integer.parseInt(tfdia2.getText());
			mes2 = Integer.parseInt(tfmes2.getText());
			anno2 = Integer.parseInt(tfanno2.getText());
			
			if(dia1 > 30 || dia1 < 0)
				JOptionPane.showMessageDialog(null, "El dia de la fecha 1 es invalido.");
			else if (mes1 > 12 || mes1 < 0)
				JOptionPane.showMessageDialog(null, "El mes de la fecha 1 es invalido.");
			else if (anno1 < 0)
				JOptionPane.showMessageDialog(null, "El año de la fecha 1 es invalido.");
			else
				fecha1 = new Fecha(dia1, mes1, anno1);
			
			if(dia2 > 30 || dia2 < 0)
				JOptionPane.showMessageDialog(null, "El dia de la fecha 2 es invalido.");
			else if (mes2 > 12 || mes2 < 0)
				JOptionPane.showMessageDialog(null, "El mes de la fecha 2 es invalido.");
			else if (anno2 < 0)
				JOptionPane.showMessageDialog(null, "El año de la fecha 2 es invalido.");
			else
				fecha2 = new Fecha(dia2, mes2, anno2);
			
			if(fecha1 != null && fecha2 != null) {
				int totaldias = fecha2.dia - fecha1.dia + (fecha2.mes - fecha1.mes)*30 + (fecha2.anno - fecha1.anno)*365;
				
				if (totaldias > 0) {
					tfdiastotal.setText(""+totaldias);
					results.setText("LOS DIAS FALTANTES :");
				}else {
					results.setText("LOS DIAS PASADOS :");
					tfdiastotal.setText(""+totaldias*-1);
				}
					
			}
		}

	}

}
