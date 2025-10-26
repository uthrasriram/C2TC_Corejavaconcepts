
package com.tnsif.ifet.dayfive.multilevelinheritance.texteditor;


		// TODO Auto-generated method stub
		public class Wordpad extends Notepad {
		    private boolean isBold;

		    public Wordpad() {
		        super();
		        this.isBold = false;
		    }

		    public void formatText(boolean bold) {
		        if (bold) {
		            content = "<b>" + content + "</b>";
		        }
		        isBold = bold;
		    }

		    public boolean isBold() {
		        return isBold;
		    }
		}

	


