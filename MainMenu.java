import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JFrame
{
	public MainMenu()
	{
		setTitle("Main Menu");
		setSize(600, 400);
		
		JPanel panel = new JPanel();
		
		JButton creatorButton = new JButton("Create or edit deck");
		panel.add(creatorButton);
		
		JButton userButton = new JButton("Use flash cards");
		panel.add(userButton);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		creatorButton.addActionListener(e ->
		{
			new CreatorEditorMenu();
		});
	}
}