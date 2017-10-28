package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.DH_simulacao;

public class ActionDH implements ActionListener {
	
	private JFrame frameMenu;
	
	public ActionDH (JFrame frameMenu) {
		this.frameMenu = frameMenu;
	}
	public void actionPerformed(ActionEvent e) {
		frameMenu.setVisible(false);
		DH_simulacao telaDH = new DH_simulacao();
		telaDH.setVisible(true);
	}
}
