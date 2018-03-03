package turing_machine_simulator;


public class Tape implements java.io.Serializable{
    private char blank_symbol;
    private char current_symbol;
    private int current_head_position;
    private int current_tape_length;
    private java.util.ArrayList<Character> tape_contents=new java.util.ArrayList<Character>(0);

    public Tape() {
    }

    public void initialize(String s) { 
       this.tape_contents.clear();
       this.tape_contents.ensureCapacity(s.length()+2);
       tape_contents.add(blank_symbol);
       for(int i=0;i<s.length();i++) {
       tape_contents.add(s.charAt(i));
       }
       tape_contents.add(blank_symbol);
       this.current_head_position=0;
       this.current_symbol=this.blank_symbol;
       this.current_tape_length=this.tape_contents.size();
    }

   public void replace(char a) {
       this.tape_contents.set(this.current_head_position,a);
       this.current_symbol=a;
   }

   public void moveLeft() {
       if (this.current_head_position==0) {
           this.tape_contents.ensureCapacity(current_tape_length+1);
           this.tape_contents.add(0,this.blank_symbol);
       }
       else {
       this.current_head_position--;
       }
       this.current_tape_length=this.tape_contents.size();
       this.current_symbol=this.tape_contents.get(this.current_head_position);
   }
   public void moveRight(){
       if(this.current_head_position==this.current_tape_length-1) {
           this.tape_contents.ensureCapacity(current_tape_length+1);
           this.tape_contents.add(this.blank_symbol);
       }
       this.current_head_position++;
       this.current_tape_length=this.tape_contents.size();
       this.current_symbol=this.tape_contents.get(this.current_head_position);
   }

   public int getTapeLength(){
       return this.current_tape_length;
   }

   public int getCurrentHeadPosition(){
       return this.current_head_position;
   }
   public char getCurrentSymbol(){
       return this.current_symbol;
   }

   public void setBlankSymbol(char b){
       this.blank_symbol=b;
   }
   public char getBlankSymbol(){
       return this.blank_symbol;

   }

   public char getSymbol(int i){
       return this.tape_contents.get(i);
   }
  
}
