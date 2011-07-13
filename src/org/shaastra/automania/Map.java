package org.shaastra.automania;

import java.io.*;
import java.util.Scanner;

/**
 * Map class contains a map and methods to handle it.
 * @author devesh
 *
 * Detailed description if needed.
 */
public class Map {
	
	public char[][] char_map;
	private int[][] players_initial_position;
	/**
	 * A constructor.
	 * @param map_file
	 */
	public Map(String map_file)
	{
		// have to read the file and make an array of the map.
		char_map = new char[GlobalDataStore.MAP_SIZE][GlobalDataStore.MAP_SIZE];
		players_initial_position = new int[GlobalDataStore.NUM_OF_PLAYERS][2];
		
		// Here is a cuppy implementation where I am just
		// making everything empty initially and then 
		// putting the players at the relevant position
		for(int i = 0; i < GlobalDataStore.MAP_SIZE; i++)
		{
			for(int j = 0; j < GlobalDataStore.MAP_SIZE; j++)
			{
				char_map[i][j] = GlobalDataStore.EMPTY;
			}
		}
		players_initial_position[0][0] = 10;
		players_initial_position[0][1] = 25;
		players_initial_position[1][0] = 41;
		players_initial_position[1][1] = 25;
		
	}
	
	/**
	 * 
	 * @return 
	 */
	public int[][] getPlayersInitialPosition()
	{
		return players_initial_position;
	}

}
