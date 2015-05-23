package com.jeffrey.formapplication.calculator;

import com.jeffrey.formapplication.common.TimeUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 功能说明：
 *
 * @author weij
 */
public class MainWindow {
	private JPanel panel1;
	private JButton okButton;
	private JLabel javaApplicationLabel;

	public MainWindow() {
		okButton.addActionListener(new ActionListener() {
			/**
			 * Invoked when an action occurs.
			 *
			 * @param e
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				javaApplicationLabel.setText(TimeUtils.getDateTimeNow());
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("MainWindow");
		frame.setContentPane(new MainWindow().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
