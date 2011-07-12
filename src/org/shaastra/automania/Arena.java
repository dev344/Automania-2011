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
	public  boolean game_status; ///<Indicates the status of the game.
	
	private IOManager io_manager;
	private boolean check1; ///<Dummy variable
	
	/**
	 * A constructor.
	 */
	public Arena()
	{
		io_manager = new IOManager();
		map = new Map("map.txt");  // Should change the hardcodedness of the mapname.
	}
	
	/**
	 * A function to play both the players' moves.
	 * @param
	 * 
	 * Instead of the MainGameServer calling all the internal functions of Arena
	 * like checkMoves, getMoves, executeMoves etc, the playMoves will do all 
	 * that and finally be equivalent to playing the moves of the players after
	 * all the checks.
	 *        // This above description was mainly for the co-coords. To be changed.
	 */
	public void playMoves()
	{
		
	}
	
	/**
	 * Function to get the moves from both the players.
	 * @param 
	 */
	private void getMoves()
	{
		
	}

	/**
	 * Funtion to check the validity of both the moves.
	 * @param
	 *        // May need to change brief description as the function evolves.
	 */
	private void checkMoves()
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
	 */
	private void checkForEnd()
	{
		
	}
}
