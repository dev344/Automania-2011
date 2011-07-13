package org.shaastra.automania;

import org.shaastra.automania.*;

/**
 * Main Game Server class.
 * @author devesh
 * 
 * The game server creates an arena for the game to be held.
 * It then keeps calling the play_move() function of the arena till the game ends.
 *     //  These comments should be modified further as and when needed to be more accurate.
 */
public class MainGameServer {

	/**
	 * main funtion of the Game server.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arena arena = new Arena();
		for(int i = 0; i < 5; i++)
		{
			arena.playMoves(true);
		}

	}

}
