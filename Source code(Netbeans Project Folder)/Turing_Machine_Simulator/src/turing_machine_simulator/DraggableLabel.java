
package turing_machine_simulator;


public class DraggableLabel extends javax.swing.JLabel implements net.java.swingfx.jdraggable.Draggable {

 private State corresponding_state;
 public DraggableLabel(javax.swing.ImageIcon icon){

     super(icon);
 }

 public java.awt.Component getComponent() {
    return this;
 }

 public State getState(){

    return this.corresponding_state;
 }
 
 public void setState(State s){

    this.corresponding_state = s;
 }
}