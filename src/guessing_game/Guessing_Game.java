/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing_game;

/**
 *
 * @author doilhan
 */
public class Guessing_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        ViewController viewcontroller = new ViewController(model);
        viewcontroller.setVisible(true);
    }
    
}
