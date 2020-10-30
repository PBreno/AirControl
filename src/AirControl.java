import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class AirControl extends JFrame{

	private JLabel lblInput_data;
	private JLabel lblX_input;
	private JLabel lblY_input;
	private JLabel lblRadius_input;
	private JLabel lblAngle_input;
	private JLabel lblVelocity_input;
	private JLabel lblDiretion_input;
	private JLabel lblradar;
	private JLabel lblDatagrid;
	private JLabel lblRelatory;
	private JLabel lblFunc_Trans;
	private JLabel lblX_transfer;
	private JLabel lblY_transfer;
	private JLabel lblX_echelon;
	private JLabel lblY_echelon;
	private JLabel lblX_rotate;
	private JLabel lblY_rotate;
	private JLabel lblrotate_center;
	private JLabel lblAngle_rotate;
	private JLabel lblTrackFunction;
	private JLabel lblDistance_track;
	private JLabel lblDistanceMin_track;
	private JLabel lblTime_track;
	private JTextField txtX_Input;
	private JTextField txtY_Input;
	private JTextField txtRadius_Input;
	private JTextField txtAngle_Input;
	private JTextField txtVelocity_Input;
	private JTextField txtDiretion_Input;
	private JTextField txtX_transfer;
	private JTextField txtY_transfer;
	private JTextField txtX_Echelon;
	private JTextField txtY_Echelon;
	private JTextField txtX_rotate;
	private JTextField txtY_rotate;
	private JTextField txtAngle_rotate;
	private JTextField txtDistance_track;
	private JTextField txtDistanceMin_track;
	private JTextField txtTime_track;
	private JTextArea  txtArelatory;
	private JButton btnInsert;
	private JButton btnTransfer;
	private JButton btnechelon;
	private JButton btnrotate;
	private JButton btnAirplane;
	private JButton btnAirplaneNear;
	private JButton btncolisionroute;
//	private JPanel pnlInput_data;
	
	public AirControl () {
		
		setTitle("Air Control");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setSize(1050, 650);
		
		//Data input 
		lblInput_data = new JLabel("Entrada de dados");
		lblInput_data.setBounds(100, 40, 147, 15);
		getContentPane().add(lblInput_data);
		
		lblX_input = new JLabel("X:");
		lblX_input.setBounds(75, 75, 27, 15);
		getContentPane().add(lblX_input);
		
		txtX_Input = new JTextField();
		txtX_Input.setBounds(86, 70, 47, 21);
		getContentPane().add(txtX_Input);
		
		lblY_input = new JLabel("Y:");
		lblY_input.setBounds(185, 75, 27, 15);
		getContentPane().add(lblY_input);
		
		txtY_Input = new JTextField();
		txtY_Input.setBounds(196, 70, 47, 21);
		getContentPane().add(txtY_Input);
		
		lblRadius_input = new JLabel("Raio:");
		lblRadius_input.setBounds(60, 110, 40, 15);
		getContentPane().add(lblRadius_input);
		
		txtRadius_Input = new JTextField();
		txtRadius_Input.setBounds(85, 105, 47, 21);
		getContentPane().add(txtRadius_Input);
		
		lblAngle_input = new JLabel("Ângulo:");
		lblAngle_input.setBounds(160, 110, 50, 15);
		getContentPane().add(lblAngle_input);
		
		txtAngle_Input = new JTextField();
		txtAngle_Input.setBounds(196, 105, 47, 21);
		getContentPane().add(txtAngle_Input);
		
		lblVelocity_input = new JLabel("Velocidade:");
		lblVelocity_input.setBounds(30, 150, 70, 15);
		getContentPane().add(lblVelocity_input);
		
		txtVelocity_Input = new JTextField();
		txtVelocity_Input.setBounds(85, 145, 47, 21);
		getContentPane().add(txtVelocity_Input);
		
		lblDiretion_input = new JLabel("Direção:");
		lblDiretion_input.setBounds(155, 150, 50, 15);
		getContentPane().add(lblDiretion_input);
		
		txtDiretion_Input = new JTextField();
		txtDiretion_Input.setBounds(196, 145, 47, 21);
		getContentPane().add(txtDiretion_Input);
		
		btnInsert = new JButton("Inserir");
		btnInsert.setBounds(105, 175, 75, 25);
		getContentPane().add(btnInsert);	
		
		//Transformation function
		lblFunc_Trans = new JLabel("Funções de Transformação");
		lblFunc_Trans.setBounds(90,220, 147, 15);
		getContentPane().add(lblFunc_Trans);
		
		// Transfer
		lblX_transfer = new JLabel("X:");
		lblX_transfer.setBounds(25, 250, 27, 15);
		getContentPane().add(lblX_transfer);
		
		txtX_transfer = new JTextField();
		txtX_transfer.setBounds(36, 245, 35, 21);
		getContentPane().add(txtX_transfer);
		
		lblY_transfer = new JLabel("Y:");
		lblY_transfer.setBounds(80,250, 27, 15);
		getContentPane().add(lblY_transfer);
		
		txtY_transfer = new JTextField();
		txtY_transfer.setBounds(90,245, 35, 21);
		getContentPane().add(txtY_transfer);
		
		btnTransfer = new JButton("Transladar");
		btnTransfer.setBounds(40, 270, 85, 25);
		getContentPane().add(btnTransfer);
		
		//Echelon 
		lblX_echelon = new JLabel("X:");
		lblX_echelon.setBounds(140, 250, 27, 15);
		getContentPane().add(lblX_echelon);
		
		txtX_Echelon = new JTextField();
		txtX_Echelon.setBounds(151, 245, 35, 21);
		getContentPane().add(txtX_Echelon);
		
		lblY_echelon = new JLabel("Y:");
		lblY_echelon.setBounds(195,250, 27, 15);
		getContentPane().add(lblY_echelon);
		
		txtY_Echelon = new JTextField();
		txtY_Echelon.setBounds(206,245, 35, 21);
		getContentPane().add(txtY_Echelon);
		
		btnechelon = new JButton("Escalonar");
		btnechelon.setBounds(155, 270, 80, 25);
		getContentPane().add(btnechelon);
		
		lblAngle_rotate = new JLabel("Ângulo:");
		lblAngle_rotate.setBounds(25, 330, 40, 15);
		getContentPane().add(lblAngle_rotate);
		
		txtAngle_rotate = new JTextField();
		txtAngle_rotate.setBounds(65, 325, 50, 21);
		getContentPane().add(txtAngle_rotate);
		
		lblrotate_center = new JLabel("Centro Rotação");
		lblrotate_center.setBounds(150,330, 80, 15);
		getContentPane().add(lblrotate_center);
		
		lblX_rotate = new JLabel("X:");
		lblX_rotate.setBounds(140, 355, 27, 15);
		getContentPane().add(lblX_rotate);
		
		txtX_rotate = new JTextField();
		txtX_rotate.setBounds(151, 350, 35, 21);
		getContentPane().add(txtX_rotate);
		
		lblY_rotate = new JLabel("Y:");
		lblY_rotate.setBounds(195,355, 27, 15);
		getContentPane().add(lblY_rotate);
		
		txtY_rotate = new JTextField();
		txtY_rotate.setBounds(206,350, 35, 21);
		getContentPane().add(txtY_rotate);
		
		btnrotate = new JButton("Rotacionar");
		btnrotate.setBounds(25, 350, 90, 25);
		getContentPane().add(btnrotate);
		
		//Tracking function
		lblTrackFunction = new JLabel("Funções de Rastreamento");
		lblTrackFunction.setBounds(90, 400, 150, 25);
		getContentPane().add(lblTrackFunction);
		
		lblDistance_track = new JLabel("Distância Mínima:");
		lblDistance_track.setBounds(25, 430, 90, 25);
		getContentPane().add(lblDistance_track);
		
		txtDistance_track = new JTextField();
		txtDistance_track.setBounds(110, 430, 100, 25);
		getContentPane().add(txtDistance_track);
		
		btnAirplane = new JButton("Avioes proximo ao aeroporto");
		btnAirplane.setBounds(25, 460, 190, 25);
		getContentPane().add(btnAirplane);
		
		lblDistanceMin_track = new JLabel("Distância Mínima:");
		lblDistanceMin_track.setBounds(250, 430, 90, 25);
		getContentPane().add(lblDistanceMin_track);
		
		txtDistanceMin_track = new JTextField();
		txtDistanceMin_track.setBounds(335, 430, 50, 25);
		getContentPane().add(txtDistanceMin_track);
		
		btnAirplaneNear = new JButton("Avioes proximo");
		btnAirplaneNear.setBounds(260, 460, 120, 25);
		getContentPane().add(btnAirplaneNear);
		
		lblTime_track = new JLabel("Tempo Mínimo:");
		lblTime_track.setBounds(435, 430, 90, 25);
		getContentPane().add(lblTime_track);
		
		txtTime_track = new JTextField();
		txtTime_track.setBounds(510, 430, 50, 25);
		getContentPane().add(txtTime_track);
		
		btncolisionroute = new JButton("Em rota de colisão");
		btncolisionroute.setBounds(440, 460, 120, 25);
		getContentPane().add(btncolisionroute);
		
		lblRelatory = new JLabel("Relatório");
		lblRelatory.setBounds(770, 250, 60, 15);
		getContentPane().add(lblRelatory);
		
		txtArelatory = new JTextArea();
		txtArelatory.setBounds(650, 270, 300, 220);
		getContentPane().add(txtArelatory);
	}
}
