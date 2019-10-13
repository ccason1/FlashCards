import javax.swing.*;
import java.awt.event.*;

public class CreatorEditorMenu extends JFrame
{
	public CreatorEditorMenu()
	{
		setTitle("Creator/Editor Menu");
		setSize(600, 400);
		
		JPanel panel = new JPanel();
		
		JButton newDeckButton = new JButton("Create new flash cards deck");
		panel.add(newDeckButton);
		
		//TODO list existing flash cards decks
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		newDeckButton.addActionListener(e ->
		{
			String deckName = JOptionPane.showInputDialog("Enter name of deck:");
			System.out.println(deckName);
		});
	}
}