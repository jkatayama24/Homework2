package com.example.homework2;
/**
 * Square puzzle game controller
 *
 * @author Jason Katayama
 * @version
 */

public class PuzzleController {
    private PuzzleView puzzleView;
    private PuzzleModel puzzleModel;

    //making the object for the puzzleView similar to that of the cake project
    public PuzzleController(PuzzleView object){
        puzzleView = object;
        puzzleModel = puzzleView.getPuzzleModel();
    }

}
