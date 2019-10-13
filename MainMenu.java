import javax.swing.*;

public class MainMenu extends JFrame
{
	public MainMenu()
	{
		setTitle("Main Menu");
		setSize(600, 400);
		
		JPanel panel = new JPanel();
		
		JButton creatorButton = new JButton("Create or edit deck");
		panel.add(creatorButton);
		
		JButton userButton = new JButton("User flash cards");
		panel.add(userButton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}