package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VentanaPrincipal extends javax.swing.JFrame {
	private JComboBox jCombTipo;
	private JLabel jLblNomArb;
	private JLabel jLblApeArb;
	private JLabel jLblCedArb;
	private JTextField jTxtCodEq;
	private JLabel jLblCodEqu;
	private JTextField jTxtCant;
	private JLabel jLblCant;
	private JTextField jTxtFecNac;
	private JLabel jLblFecNac;
	private JLabel jLblNomEq;
	private JLabel jLblEstadio;
	private JButton jBtnGuardar;
	private JButton jBtn;
	private JTextField jTxtEstadio;
	private JTextField jTxtCiudad;
	private JLabel jLblCiudad;
	private JTextField jTxtAno;
	private JLabel jLblAno;
	private JTextField jTxtNomEq;
	private JTextField jTxtApeArb;
	private JTextField jTxtCedArb;
	private JTextField jTxtNomArb;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public VentanaPrincipal() {
		super();
		initGUI();
		ocultarTodo();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					ComboBoxModel jCombTipoModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					jCombTipo = new JComboBox();
					getContentPane().add(jCombTipo);
					jCombTipo.setModel(jCombTipoModel);
					jCombTipo.setBounds(269, 25, 119, 24);
				}
				{
					jLblNomArb = new JLabel();
					getContentPane().add(jLblNomArb);
					jLblNomArb.setText("Nombre");
					jLblNomArb.setBounds(159, 150, 61, 16);
				}
				{
					jTxtNomArb = new JTextField();
					getContentPane().add(jTxtNomArb);
					jTxtNomArb.setBounds(159, 184, 109, 23);
				}
				{
					jLblApeArb = new JLabel();
					getContentPane().add(jLblApeArb);
					jLblApeArb.setText("Apellido");
					jLblApeArb.setBounds(341, 150, 69, 16);
				}
				{
					jLblCedArb = new JLabel();
					getContentPane().add(jLblCedArb);
					jLblCedArb.setText("Cedula");
					jLblCedArb.setBounds(258, 68, 50, 16);
				}
				{
					jTxtCedArb = new JTextField();
					getContentPane().add(jTxtCedArb);
					jTxtCedArb.setBounds(258, 101, 98, 23);
				}
				{
					jTxtApeArb = new JTextField();
					getContentPane().add(jTxtApeArb);
					jTxtApeArb.setBounds(341, 184, 112, 23);
				}
				{
					jLblFecNac = new JLabel();
					getContentPane().add(jLblFecNac);
					jLblFecNac.setText("Fecha Nacimiento");
					jLblFecNac.setBounds(158, 225, 132, 16);
				}
				{
					jTxtFecNac = new JTextField();
					getContentPane().add(jTxtFecNac);
					jTxtFecNac.setBounds(158, 258, 110, 23);
				}
				{
					jLblCant = new JLabel();
					getContentPane().add(jLblCant);
					jLblCant.setText("Cantidad partidos");
					jLblCant.setBounds(341, 225, 101, 16);
				}
				{
					jTxtCant = new JTextField();
					getContentPane().add(jTxtCant);
					jTxtCant.setBounds(341, 258, 69, 23);
				}
				{
					jLblCodEqu = new JLabel();
					getContentPane().add(jLblCodEqu);
					jLblCodEqu.setText("Codigo");
					jLblCodEqu.setBounds(191, 68, 61, 16);
				}
				{
					jTxtCodEq = new JTextField();
					getContentPane().add(jTxtCodEq);
					jTxtCodEq.setBounds(189, 97, 119, 23);
				}
				{
					jLblNomEq = new JLabel();
					getContentPane().add(jLblNomEq);
					jLblNomEq.setText("Nombre");
					jLblNomEq.setBounds(355, 68, 61, 16);
				}
				{
					jTxtNomEq = new JTextField();
					getContentPane().add(jTxtNomEq);
					jTxtNomEq.setBounds(355, 97, 127, 23);
				}
				{
					jLblAno = new JLabel();
					getContentPane().add(jLblAno);
					jLblAno.setText("Año de fundacion");
					jLblAno.setBounds(189, 155, 127, 16);
				}
				{
					jTxtAno = new JTextField();
					getContentPane().add(jTxtAno);
					jTxtAno.setBounds(189, 177, 119, 23);
				}
				{
					jLblCiudad = new JLabel();
					getContentPane().add(jLblCiudad);
					jLblCiudad.setText("Ciudad");
					jLblCiudad.setBounds(355, 155, 54, 16);
				}
				{
					jTxtCiudad = new JTextField();
					getContentPane().add(jTxtCiudad);
					jTxtCiudad.setBounds(355, 177, 127, 23);
				}
				{
					jLblEstadio = new JLabel();
					getContentPane().add(jLblEstadio);
					jLblEstadio.setText("Estadio");
					jLblEstadio.setBounds(277, 234, 61, 16);
				}
				{
					jTxtEstadio = new JTextField();
					getContentPane().add(jTxtEstadio);
					jTxtEstadio.setBounds(277, 256, 120, 23);
				}
				{
					jBtn = new JButton();
					getContentPane().add(jBtn);
					jBtn.setText("Incluir jugadores");
					jBtn.setBounds(527, 146, 133, 39);
				}
				{
					jBtnGuardar = new JButton();
					getContentPane().add(jBtnGuardar);
					jBtnGuardar.setText("Guardar");
					jBtnGuardar.setBounds(269, 348, 122, 35);
				}

			}
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			this.setSize(713, 432);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void agregarListener(ActionListener accion){
		this.jBtnGuardar.addActionListener(accion);
		this.jBtn.addActionListener(accion);
		this.jCombTipo.addActionListener(accion);
		
	}
	
	public void agregarTipo(String[] tipo){
		ComboBoxModel cmbTipoFiguraModel = new DefaultComboBoxModel(tipo);
		jCombTipo.setModel(cmbTipoFiguraModel);
		
	}

	public void ocultarTodo(){
		jLblAno.setVisible(false);
		jLblCiudad.setVisible(false);
		jLblCodEqu.setVisible(false);
		jLblEstadio.setVisible(false);
		
		jLblNomEq.setVisible(false);
		jTxtAno.setVisible(false);
		jTxtCiudad.setVisible(false);
		jTxtCodEq.setVisible(false);
		jTxtEstadio.setVisible(false);
		jBtn.setVisible(false);
		jTxtNomEq.setVisible(false);
		jTxtFecNac.setVisible(false);
		jLblFecNac.setVisible(false);
		jLblApeArb.setVisible(false);
		jLblCant.setVisible(false);
		jLblCedArb.setVisible(false);
		jLblNomArb.setVisible(false);
		jTxtApeArb.setVisible(false);
		jTxtCant.setVisible(false);
		jTxtCedArb.setVisible(false);
		jTxtNomArb.setVisible(false);
	}
	
	public void setVisibleEquipo(boolean valor)
	{
		jLblAno.setVisible(valor);
		jLblCiudad.setVisible(valor);
		jLblCodEqu.setVisible(valor);
		jLblEstadio.setVisible(valor);
		
		jLblNomEq.setVisible(valor);
		jTxtAno.setVisible(valor);
		jTxtCiudad.setVisible(valor);
		jTxtCodEq.setVisible(valor);
		jTxtEstadio.setVisible(valor);
		jBtn.setVisible(valor);
		jTxtNomEq.setVisible(valor);
		
		
	}
	
	public void setVisibleArbitro(boolean valor2)
	{
		jTxtFecNac.setVisible(valor2);
		jLblFecNac.setVisible(valor2);
		jLblApeArb.setVisible(valor2);
		jLblCant.setVisible(valor2);
		jLblCedArb.setVisible(valor2);
		jLblNomArb.setVisible(valor2);
		jTxtApeArb.setVisible(valor2);
		jTxtCant.setVisible(valor2);
		jTxtCedArb.setVisible(valor2);
		jTxtNomArb.setVisible(valor2);
	}
	
	public String getCodigo(){
		return this.jTxtCodEq.getText();
	}
	
	public String getNombre(){
		return this.jTxtNomEq.getText();
	}
	
	public float getAno(){
		return Integer.parseInt(this.jTxtAno.getText());
	}
	
	public String getCiudad(){
		return this.jTxtCiudad.getText();
	}
	
	public String getEstadio(){
		return this.jTxtEstadio.getText();
	}

	public String getTipo() {
		return 	jCombTipo.getSelectedItem().toString();
	}


	public String getApellidoArbitro(){
		
		return this.jTxtApeArb.getText();
	}
	
    public String getCedulaArbitro(){
		
		return this.jTxtCedArb.getText();
	}
    
    public String getNombreArbitro(){
    	
		return this.jTxtNomArb.getText();
	}
    
    public String getFechaNac(){
		
		return this.jTxtFecNac.getText();
	}
    
    public String getCantidad(){
    	
    	return this.jTxtCant.getText();
    }
	
    public void limpiar(){
    	this.jTxtAno.setText("");
    	this.jTxtApeArb.setText("");
    	this.jTxtCant.setText("");
    	this.jTxtCedArb.setText("");
    	this.jTxtCiudad.setText("");
    	this.jTxtCodEq.setText("");
    	this.jTxtEstadio.setText("");
    	this.jTxtFecNac.setText("");
    	this.jTxtNomArb.setText("");
    	this.jTxtNomEq.setText("");
    }
    
    public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(this, mensaje);
	}
	
}
