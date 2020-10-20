package PiggyBankGUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import PiggyBankBussines.PiggyBank;

public class PiggyBankGUI {

	private JFrame frame;
	private JTextField textRta;
	private PiggyBank piggy = new PiggyBank();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PiggyBankGUI window = new PiggyBankGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PiggyBankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 806, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALCANCIA - APP");
		lblNewLabel.setBounds(330, 39, 165, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textRta = new JTextField();
		textRta.setEditable(false);
		textRta.setBounds(75, 83, 638, 39);
		frame.getContentPane().add(textRta);
		textRta.setColumns(10);
		
		JButton btn100 = new JButton("100");
		btn100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coin100 = 100;
				String rta = piggy.insertCoin(coin100);
				textRta.setText(rta);
			}
		});
		btn100.setBounds(206, 172, 115, 29);
		frame.getContentPane().add(btn100);
		
		JButton btn50 = new JButton("50");
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coin50 = 50;
				String rta = piggy.insertCoin(coin50);
				textRta.setText(rta);
			}
		});
		btn50.setBounds(76, 172, 115, 29);
		frame.getContentPane().add(btn50);
		
		JButton btn200 = new JButton("200");
		btn200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coin200 = 200;
				String rta = piggy.insertCoin(coin200);
				textRta.setText(rta);
			}
		});
		btn200.setBounds(330, 172, 115, 29);
		frame.getContentPane().add(btn200);
		
		JButton btn500 = new JButton("500");
		btn500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coin500 = 500;
				String rta = piggy.insertCoin(coin500);
				textRta.setText(rta);
			}
		});
		btn500.setBounds(456, 172, 115, 29);
		frame.getContentPane().add(btn500);
		
		JButton btn1000 = new JButton("1000");
		btn1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coin1000 = 1000;
				String rta = piggy.insertCoin(coin1000);
				textRta.setText(rta);
			}
		});
		btn1000.setBounds(586, 172, 115, 29);
		frame.getContentPane().add(btn1000);
		
		JButton btnNewButton = new JButton("TOTAL MONEDAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rta = String.valueOf(piggy.getTotalCoins()); 
				textRta.setText(rta);
			}
		});
		btnNewButton.setBounds(75, 310, 246, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnTotalDinero = new JButton("TOTAL DINERO");
		btnTotalDinero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rta = String.valueOf(piggy.getTotalMoney()); 
				textRta.setText(rta);
			}
		});
		btnTotalDinero.setBounds(75, 355, 246, 29);
		frame.getContentPane().add(btnTotalDinero);
		
		JLabel lblDenomiacinMonedas = new JLabel("Denominaci\u00F3n Moneda");
		lblDenomiacinMonedas.setBounds(424, 279, 179, 20);
		frame.getContentPane().add(lblDenomiacinMonedas);
		
		JSpinner txtDenomination2 = new JSpinner();
		txtDenomination2.setBounds(618, 276, 147, 26);
		frame.getContentPane().add(txtDenomination2);
		
		JButton btnTotalMonedasDe = new JButton("TOTAL MONEDAS DE DENOMINACI\u00D3N");
		btnTotalMonedasDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int denomination = (int) txtDenomination2.getValue();
				String rta = "";
				if(!validateDenomination(denomination)){
					rta = "Denominación NO valida !!";
				} else {
				 rta = String.valueOf(piggy.getTotalCoinsDenomination(denomination)); 
				}
				
				textRta.setText(rta);
			}
		});
		btnTotalMonedasDe.setBounds(422, 310, 342, 29);
		frame.getContentPane().add(btnTotalMonedasDe);
		
		JButton btnTotalDineroDe = new JButton("TOTAL DINERO DE DENOMINACI\u00D3N");
		btnTotalDineroDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int denomination = (int) txtDenomination2.getValue();
				String rta = "";
				if(!validateDenomination(denomination)){
					rta = "Denominación NO valida !!";
				} else {
					rta = String.valueOf(piggy.getTotalCoinsDenominationMoney(denomination)); 
				}
				textRta.setText(rta);
				
			}
		});
		btnTotalDineroDe.setBounds(424, 355, 342, 29);
		frame.getContentPane().add(btnTotalDineroDe);
		
		
	}
	
	private boolean validateDenomination(int denomination){
		if(denomination != 50 && denomination != 100 && denomination != 200 && denomination != 500 && denomination != 1000){
			return false;
		}
		return true;
	}
}
