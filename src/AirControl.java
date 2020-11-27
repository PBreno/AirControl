import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.eclipse.swt.graphics.Image;

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
	private JPanel pnlInput_data;
	private JPanel pnlTranslate;
	private JPanel pnlEchelon;
	private JPanel pnlrotate;
	private JPanel pnltrackAriplane;
	private JPanel pnltrackDistance;
	private JPanel pnltrackTIme;
	private JPanel pnlRelatory;
	private String imagem = "Test1.jpg" ;
	private JLabel image;
	private JTable tbdatagrid;
	private String [][] data = {{"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com", "r"," r"," r"}};
	private ArrayList<String> columnName;
	private String [] Column={" ", "ID", "X","Y","R","A","V","D"};;
	private DefaultTableModel Model;
	private JPanel pnlbackground;
	private JScrollPane slprool;
	private Boolean flag = false;
	
	public AirControl ()  {
		
		setTitle("Air Control");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setSize(1050, 650);
		setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(imagem));
		
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
		

		btnInsert = new JButton(new AbstractAction("Inserir") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(txtX_Input.getText().isEmpty() && 
						txtY_Input.getText().isEmpty() &&
							txtRadius_Input.getText().isEmpty() &&
								txtAngle_Input.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha os campos de entrada!");
				}
				if (!txtX_Input.getText().isEmpty() || !txtY_Input.getText().isEmpty()) {
//						 if(!txtRadius_Input.getText().isEmpty() || !txtAngle_Input.getText().isEmpty())
//							 JOptionPane.showMessageDialog(null, "Preencha os campos lineares ou angulares!");
					txtRadius_Input.setEnabled(false);
					
				}
				
			}
		});
		btnInsert.setBounds(105, 175, 75, 25);
		getContentPane().add(btnInsert);	
		
		pnlInput_data = new JPanel();
		pnlInput_data.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlInput_data.setBounds(20, 55, 250, 150);
		pnlInput_data.setBackground(Color.white);
		
		getContentPane().add(pnlInput_data);
		
//		//Transformation function
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
		
		btnTransfer = new JButton( new AbstractAction("Transladar") {
			
			float Ax;
			float Ay;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(txtX_transfer.getText().isEmpty() && txtY_transfer.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Preencher  rtr os campos completos");
									
				else if (!txtX_transfer.getText().isEmpty() && txtY_transfer.getText().isEmpty() ||
							txtX_transfer.getText().isEmpty() && !txtY_transfer.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Preencher os campos completos");
				
				else {
					
					if ( txtX_transfer.getText().matches("[0-9]*") && txtY_transfer.getText().matches("[0-9]*") ) {
					
						Ax = Float.parseFloat(txtX_Input.getText()) + Float.parseFloat(txtX_transfer.getText());
						Ay = Float.parseFloat(txtY_Input.getText()) + Float.parseFloat(txtY_transfer.getText());
						JOptionPane.showMessageDialog(null, " Ax - " + Ax + " Ay - " + Ay);	
					}
					
				}
			}
		});
		btnTransfer.setBounds(40, 270, 85, 25);
		getContentPane().add(btnTransfer);
		
		pnlTranslate = new JPanel();
		pnlTranslate.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlTranslate.setBounds(20, 235, 110, 70);
		pnlTranslate.setBackground(Color.white);
		getContentPane().add(pnlTranslate);
		
		//Echelon 
		lblX_echelon = new JLabel("X:");
		lblX_echelon.setBounds(150, 250, 27, 15);
		getContentPane().add(lblX_echelon);
		
		txtX_Echelon = new JTextField();
		txtX_Echelon.setBounds(161, 245, 35, 21);
		getContentPane().add(txtX_Echelon);
		
		lblY_echelon = new JLabel("Y:");
		lblY_echelon.setBounds(205,250, 27, 15);
		getContentPane().add(lblY_echelon);
		
		txtY_Echelon = new JTextField();
		txtY_Echelon.setBounds(216,245, 35, 21);
		getContentPane().add(txtY_Echelon);
		
		btnechelon = new JButton("Escalonar");
		btnechelon.setBounds(165, 270, 80, 25);
		getContentPane().add(btnechelon);
		
		pnlEchelon = new JPanel();
		pnlEchelon.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlEchelon.setBounds(140, 235, 130, 70);
		pnlEchelon.setBackground(Color.white);
		getContentPane().add(pnlEchelon);
		
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
		
		pnlrotate = new JPanel();
		pnlrotate.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlrotate.setBounds(20, 315,250,70);
		pnlrotate.setBackground(Color.white);
		getContentPane().add(pnlrotate);
		
		//Tracking function
		lblTrackFunction = new JLabel("Funções de Rastreamento");
		lblTrackFunction.setBounds(90, 400, 150, 25);
		getContentPane().add(lblTrackFunction);
		
		lblDistance_track = new JLabel("Distância Mínima:");
		lblDistance_track.setBounds(35, 430, 90, 25);
		getContentPane().add(lblDistance_track);
		
		txtDistance_track = new JTextField();
		txtDistance_track.setBounds(120, 430, 100, 25);
		getContentPane().add(txtDistance_track);
		
		btnAirplane = new JButton("Aviões próximo ao aeroporto");
		btnAirplane.setBounds(35, 460, 190, 25);
		getContentPane().add(btnAirplane);
		
		pnltrackAriplane = new JPanel();
		pnltrackAriplane.setBorder(BorderFactory.createLineBorder(Color.black));
		pnltrackAriplane.setBounds(20, 420, 250, 75);
		pnltrackAriplane.setBackground(Color.white);
		getContentPane().add(pnltrackAriplane);
		
		lblDistanceMin_track = new JLabel("Distância Mínima:");
		lblDistanceMin_track.setBounds(295, 430, 90, 25);
		getContentPane().add(lblDistanceMin_track);
		
		txtDistanceMin_track = new JTextField();
		txtDistanceMin_track.setBounds(380, 430, 50, 25);
		getContentPane().add(txtDistanceMin_track);
		
		btnAirplaneNear = new JButton("Aviões proximo");
		btnAirplaneNear.setBounds(305, 460, 120, 25);
		getContentPane().add(btnAirplaneNear);
		
		pnltrackDistance = new JPanel();
		pnltrackDistance.setBorder(BorderFactory.createLineBorder(Color.black));
		pnltrackDistance.setBounds(285,420, 160, 75);
		pnltrackDistance.setBackground(Color.white);
		getContentPane().add(pnltrackDistance);
		
		lblTime_track = new JLabel("Tempo Mínimo:");
		lblTime_track.setBounds(465, 430, 90, 25);
		getContentPane().add(lblTime_track);
		
		txtTime_track = new JTextField();
		txtTime_track.setBounds(540, 430, 50, 25);
		getContentPane().add(txtTime_track);
		
		btncolisionroute = new JButton("Em rota de colisões");
		btncolisionroute.setBounds(465, 460, 125, 25);
		getContentPane().add(btncolisionroute);
		
		pnltrackTIme = new JPanel();
		pnltrackTIme.setBorder(BorderFactory.createLineBorder(Color.black));
		pnltrackTIme.setBounds(455, 420, 160, 75);
		pnltrackTIme.setBackground(Color.white);
		getContentPane().add(pnltrackTIme);
		
		lblRelatory = new JLabel("Relatório");
		lblRelatory.setBounds(770, 250, 60, 15);
		getContentPane().add(lblRelatory);
		
		txtArelatory = new JTextArea();
		txtArelatory.setBounds(650, 270, 300, 220);
		getContentPane().add(txtArelatory);
		
		pnlRelatory = new JPanel();
		pnlRelatory.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlRelatory.setBounds(640, 265, 325, 230);
		pnlRelatory.setBackground(Color.white);
		getContentPane().add(pnlRelatory);
//		
//		columnName = new ArrayList<String>();
//		columnName.add(" ");
//		columnName.add("ID");
//		columnName.add("X");
//		columnName.add("Y");
//		columnName.add("R");
//		columnName.add("A");
//		columnName.add("V");
//		columnName.add("D");
		
//		data = new String[1][8];
//		Model = new DefaultTableModel();
//		tbdatagrid = new JTable(Model);
//		tbdatagrid.setPreferredSize(new Dimension(640, 225));
//		tbdatagrid.setVisible(true);
//		tbdatagrid.setBounds(650, 50, 300, 210);
//		
//		pnlbackground = new JPanel();
//		pnlbackground.setLayout(new GridLayout(1,1));
//		tbdatagrid = new JTable(data, Column);
//		slprool = new JScrollPane(tbdatagrid);
//		getContentPane().add(slprool);
//		getContentPane().add(pnlbackground);
		
//		columnName = new ArrayList<String>();
//		Model.addColumn("");
//		Model.addColumn("ID");
//		Model.addColumn("X");
//		Model.addColumn("Y");
//		Model.addColumn("R");
//		Model.addColumn("A");
//		Model.addColumn("V");
//		Model.addColumn("D");
//		
//		for (int i = 0; i< 8;i++) {
//			TableColumn tbcolumn = tbdatagrid.getColumnModel().getColumn(i);
//		}
//		 Model.addRow(new Object[0]);
		
		
		
	}
	
//	public void selectedField (Boolean flag) {
//	
//		if (txt
//	}
}
