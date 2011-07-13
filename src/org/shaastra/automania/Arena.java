package org.shaastra.automania;

import org.shaastra.automania.*;

/**
 * Arena is the platform on which the game happens.
 * @author devesh
 * 
 * Detailed explanation here.
 */
public class Arena {
	
	public  Map map;
	public  boolean game_status; 	///<Indicates the status of the game.
	
	private IOManager io_manager;
	private int num_of_players;		///<variable indicating number of players
	private boolean check1; 		///<Dummy variable
	private int[] player_moves;		///<Array in which the players' moves are stored temporarily
	
	
	/**
	 * A constructor.
	 */
	public Arena()
	{
		io_manager = new IOManager();
		map = new Map("map.txt");  	// Should change the hardcodedness of the mapname.
		num_of_players = 2;			// Should change this too.
		player_moves = new int[num_of_players];
	}
	
	
	/**
	 * A function to play both the players' moves.
	 * @param simultaneity Boolean indicating the simultaneity of the game
	 * 
	 * Instead of the MainGameServer calling all the internal functions of Arena
	 * like checkMoves, getMoves, executeMoves etc, the playMoves will do all 
	 * that and finally be equivalent to playing the moves of the players after
	 * all the checks.
	 *        // This above description was mainly for the co-coords. To be changed.
	 */
	public void playMoves(boolean simultaneity)
	{
		for(int i=0; i<num_of_players; i++)
		{
			player_moves[i] = io_manager.getMove(i);
			if(simultaneity == false)
			{
				checkMoves(i);
				executeMoves();
				
			}
		}
		if(simultaneity)
		{
			checkMoves(-1);			// -1 indicates check all the moves together
		}
		
	}
	
	
	/**
	 * Funtion to check the validity of both the moves.
	 * @param player_number Player who played the turn. 
	 *        // May need to change brief description as the function evolves.
	 */
	private void checkMoves(int player_number)
	{
		
	}
	
	/**
	 * 
	 */
	private void executeMoves()
	{
		
	}
	
	/**
	 * 
	 * @param blah
	 * @param blaha
	 * @return
	 */
	private int checkForEnd(int blah, char blaha)
	{
		return blah;
	}
}
