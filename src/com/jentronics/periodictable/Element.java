package com.jentronics.periodictable;

import processing.core.PVector;

public class Element {
	
	PVector position;
	String	 number;
	String name;
	String symbol;
	String smn;
	String family;
	
	Element(int x, int y, String nu, String sym, String na, String smn, String f){
	    f = f != null ? f : "Unknown";
	    this.position=new PVector(x,y);
	    this.number=nu;
	    this.name=na;
	    this.symbol=sym;
	    this.smn=smn;
	    this.family=f;
	};

	void draw(PeriodicTable p) {
	    float x = this.position.x * p.cardWidth;
	    float y = this.position.y * p.cardHeight;
	    int font10 = (int)(10 * p.fontFactor);
	    int font12 = (int)(12 * p.fontFactor);
	    int font20 = (int)(20 * p.fontFactor);
	    int font30 = (int)(30 * p.fontFactor);

	    if(p.mouseX > x && p.mouseX < x + p.cardWidth &&
	    		p.mouseY > y && p.mouseY < y + p.cardHeight) {
	    	p.fill(255);
	    	p.rect(x, y, p.cardWidth, p.cardHeight, 5);
	    	p.fill(0);
	    	p.textSize(font12);
	    	p.text(this.symbol, x + p.width/84, y + p.height/15); 
	    	p.textSize(font10);
	    	p.text(this.number, x + 2.5f, y + 10);
	    	p.textSize(font30);
	    	p.text(this.name, p.cardWidth*2.2f, p.cardHeight*1.4f);
	    	p.textSize(font20);
	    	p.text(p.familyName.get(this.family), p.width/8, p.cardHeight*2.0f);
	    	p.text("Stable Mass Numbers:", p.width/8, p.cardHeight*2.45f);
	        p.text(this.smn,  p.width/8, p.cardHeight*2.9f);
	    } else {
	    	p.fill(p.familyColor.get(this.family));
	    	p.rect(x, y, p.cardWidth, p.cardHeight, 5);
	    	p.fill(0);
	    	p.textSize(font12);
	    	p.text(this.symbol, x + p.width/84, y + p.height/15); 
	    	p.textSize(font10);
	    	p.text(this.number, x + 2.5f, y + 10);
	    }
	};
}
