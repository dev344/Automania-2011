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
	public  boolean game_status; 		///<Indicates the status of the game.
	
	private IOManager io_manager;
	private int num_of_players;			///<variable indicating number of players
	private boolean check1; 			///<Dummy variable
	private int[] players_moves;		///<Array in which the players' moves are stored temporarily
	private int[][] players_position;	///<Double array of player position. May need to change this
	
	
	/**
	 * A constructor.
	 */
	public Arena()
	{
		io_manager = new IOManager();
		map = new Map("map.txt");  	// Should change the hardcodedness of the mapname.
		num_of_players = GlobalDataStore.NUM_OF_PLAYERS;			
		players_moves = new int[num_of_players];
		players_position = map.getPlayersInitialPosition();			// possible source of error
		
		
		test_function();
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
		for(int i = 0; i < num_of_players; i++)
		{
			//           TO DO
			// I should protect players_moves before passing it.
			players_moves[i] = io_manager.getMove(i, players_moves);
			if(simultaneity == false)
			{
				checkMoves(i);
				executeMoves(i);
				
			}
		}
		if(simultaneity)
		{
			checkMoves(-1);			// -1 indicates check all the moves together
			executeMoves(-1);
		}
		test_function();
		
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
	 * Function to execute move played. 
	 * @param player_number
	 * 
	 * Mainly updates the map as of now.
	 * If player_number is negative then it executes all the moves at a time.
	 */
	private void executeMoves(int player_number)
	{
		if(player_number < 0)
		{
			// this means it wants all the moves to be executed simultaneously
			
			for(int i = 0; i < num_of_players; i++)
			{
				updatePlayerPosition(i);
			}
		}
		
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
	
	/**
	 * Updates player position on map 
	 * @param player_number
	 */
	private void updatePlayerPosition(int player_number)
	{
		if(players_moves[player_number] == GlobalDataStore.UP)
		{
			players_position[player_number][1]++;
		}
		else if(players_moves[player_number] == GlobalDataStore.DOWN)
		{
			players_position[player_number][1]--;
		}
		else if(players_moves[player_number] == GlobalDataStore.RIGHT)
		{
			players_position[player_number][0]++;
		}
		else if(players_moves[player_number] == GlobalDataStore.LEFT)
		{
			players_position[player_number][0]--;
		}
	}
	
	/**
	 * Just a test function to test our code. 
	 */
	private void test_function()
	{
		for(int i = 0; i < num_of_players; i++)
		{
			System.out.printf("The %d player position is %d , %d \n", i, players_position[i][0], players_position[i][1]);
		}
	}
}
