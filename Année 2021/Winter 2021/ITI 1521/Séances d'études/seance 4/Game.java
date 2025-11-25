import javax.swing.JOptionPane;

class Game {

	public static void main(String[] args) throws Exception {
		Player player1 = new Player(JOptionPane.showInputDialog("Player 1"));
		Player player2 = new Player(JOptionPane.showInputDialog("Player 2"));

		player1.setOption(JOptionPane.showInputDialog("Player 1 hand"));
		player2.setOption(JOptionPane.showInputDialog("Player 1 hand"));

		switch (Player.compareTo(player1, player2)) {
            case -1:  
            	JOptionPane.showMessageDialog(null, player2.getName() + " wins");
                break;
            case 0:
            	JOptionPane.showMessageDialog(null, "Egualite");
                break;
            case 1:
            	JOptionPane.showMessageDialog(null, player1.getName() + " wins");
                break;
       	}

       	switch (player1.compareTo(player2)) {
            case -1:  
            	JOptionPane.showMessageDialog(null, "Player 2 wins");
                break;
            case 0:
            	JOptionPane.showMessageDialog(null, "Egualite");
                break;
            case 1:
            	JOptionPane.showMessageDialog(null, "Player 1 wins");
                break;
       	}
	}
}
