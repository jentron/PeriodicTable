package com.jentronics.periodictable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import processing.core.PApplet;

//Families and colors from the Wikipedia table
//http://en.wikipedia.org/wiki/Periodic_table#Layout

public class PeriodicTable extends PApplet{
	// See https://stackoverflow.com/questions/5122913/java-associative-array
	Map<String, String> familyName = new HashMap<String, String>();
	Map<String, Integer> familyColor = new HashMap<String, Integer>();
	
	List<Element> table = new ArrayList<>();
	
	float cardWidth;
	float cardHeight;
	float fontFactor;
	

	
	public static void main(String argv[]){
		PApplet.main("com.jentronics.periodictable.PeriodicTable");
	}
	
	public void settings() {
		size(600, 600, P2D);
	}

	public void setup(){
		familyName.put("Unknown",    "Unknown Properties");
		familyName.put("Alkali",     "Alkali Metal");
		familyName.put("Alkaline",   "Alkaline Earth Metal");
		familyName.put("Lanthanide", "Lanthanide");
		familyName.put("Actinide",   "Actinide");
		familyName.put("Transition", "Transition Metal");
		familyName.put("Metal",      "Other Metal");
		familyName.put("Metalloid",  "Metalloid");
		familyName.put("Polyatomic", "Polyatomic nonmetal");
		familyName.put("Diatomic",   "Diatomic nonmetal");
		familyName.put("Noble",      "Noble gas");
		
		familyColor.put("Unknown",    color(224, 227, 224));
		familyColor.put("Alkali",     color(255, 0x66, 0x66));
		familyColor.put("Alkaline",   color(255, 0xde, 0xad));
		familyColor.put("Lanthanide", color(255, 0xbf, 255));
		familyColor.put("Actinide",   color(255, 0x99, 0xcc));
		familyColor.put("Transition", color(255, 0xc0, 0xc0));
		familyColor.put("Metal",      color(0xcc, 0xcc, 0xcc));
		familyColor.put("Metalloid",  color(0xcc, 0xcc, 0x99));
		familyColor.put("Polyatomic", color(0xa1, 255, 0xc3));
		familyColor.put("Diatomic",   color(0xe7, 255, 0x8f));
		familyColor.put("Noble",      color(0xc0, 255, 255));
		
		table.add(new Element( 0,0, "1","H" ,"Hydrogen","1-2","Diatomic"));
		table.add(new Element(17,0, "2","He","Helium","3-4","Noble"));
		table.add(new Element( 0,1, "3","Li","Lithium","6-7","Alkali"));
		table.add(new Element( 1,1, "4","Be","Beryllium","9","Alkaline"));
		table.add(new Element(12,1, "5","B" ,"Boron","10-11","Metalloid"));
		table.add(new Element(13,1, "6","C" ,"Carbon","12-13","Polyatomic"));
		table.add(new Element(14,1, "7","N" ,"Nitrogen","14-15","Diatomic"));
		table.add(new Element(15,1, "8","O" ,"Oxygen","16-18","Diatomic"));
		table.add(new Element(16,1, "9","F" ,"Florine","19","Diatomic"));
		table.add(new Element(17,1,"10","Ne","Neon","20-22","Noble"));
		table.add(new Element( 0,2,"11","Na","Sodium","23","Alkali"));
		table.add(new Element( 1,2,"12","Mg","Magnesium","24-26","Alkaline"));
		table.add(new Element(12,2,"13","Al","Aluminum","27","Metal"));
		table.add(new Element(13,2,"14","Si" ,"Silcon","28-30","Metalloid"));
		table.add(new Element(14,2,"15","P" ,"Phosphorous","31","Polyatomic"));
		table.add(new Element(15,2,"16","S" ,"Sulfur","32-34,36","Polyatomic"));
		table.add(new Element(16,2,"17","Cl" ,"Chlorine","35,37","Diatomic"));
		table.add(new Element(17,2,"18","Ar","Argon","36,38,40","Noble"));
		table.add(new Element( 0,3,"19","K","Potassium","39,41","Alkali"));
		table.add(new Element( 1,3,"20","Ca","Calcium","40,42-44,46,48","Alkaline"));
		table.add(new Element( 2,3,"21","Sc","Scandium","45","Transition"));
		table.add(new Element( 3,3,"22","Ti","Titanium","46-50","Transition"));
		table.add(new Element( 4,3,"23","V","Vanadium","51","Transition"));
		table.add(new Element( 5,3,"24","Cr","Chromium","50,52-54","Transition"));
		table.add(new Element( 6,3,"25","Mn","Manganese","55","Transition"));
		table.add(new Element( 7,3,"26","Fe","Iron","54,56-58","Transition"));
		table.add(new Element( 8,3,"27","Co","Cobalt","59","Transition"));
		table.add(new Element( 9,3,"28","Ni","Nickel","58,60-62,64","Transition"));
		table.add(new Element(10,3,"29","Cu","Copper","63,65","Transition"));
		table.add(new Element(11,3,"30","Zn","Zinc","64,66-68,70","Transition"));
		table.add(new Element(12,3,"31","Ga","Gallium","69,71","Metal"));
		table.add(new Element(13,3,"32","Ge","Germanium","70,72-74,76","Metalloid"));
		table.add(new Element(14,3,"33","As","Arsenic","75","Metalloid"));
		table.add(new Element(15,3,"34","Se","Selenium","74,76-78,80,82","Polyatomic"));
		table.add(new Element(16,3,"35","Br","Bromine","79,81","Diatomic"));
		table.add(new Element(17,3,"36","Kr","Kyrpton","78,80,82-84,86","Noble"));
		table.add(new Element(0,4,"37","Rb","Rubidium","85","Alkali"));
		table.add(new Element(1,4,"38","Sr","Strontium","84,86-88","Alkaline"));
		table.add(new Element(2,4,"39","Y","Yttrium","89","Transition"));
		table.add(new Element(3,4,"40","Zr","Zirconium","90-92,94,96","Transition"));
		table.add(new Element(4,4,"41","Nb","Niobium","93","Transition"));
		table.add(new Element(5,4,"42","Mo","Molybdenum","92,94-100","Transition"));
		table.add(new Element(6,4,"43","Tc","Technetium","Radioactive","Transition"));
		table.add(new Element(7,4,"44","Ru","Ruthenium","96,98-104","Transition"));
		table.add(new Element(8,4,"45","Rh","Rhodium","103","Transition"));
		table.add(new Element(9,4,"46","Pd","Palladium","102,104-106,108,110","Transition"));
		table.add(new Element(10,4,"47","Ag","Silver","107,109","Transition"));
		table.add(new Element(11,4,"48","Cd","Cadmium","106,108,110-112,114,116","Transition"));
		table.add(new Element(12,4,"49","In","Indium","113","Metal"));
		table.add(new Element(13,4,"50","Sn","Tin","112,114-120,122,124","Metal"));
		table.add(new Element(14,4,"51","Sb","Antimony","121","Metalloid"));
		table.add(new Element(15,4,"52","Te","Tellurium","120,122,124-126,128,130","Metalloid"));
		table.add(new Element(16,4,"53","I","Iodine","127","Diatomic"));
		table.add(new Element(17,4,"54","Xe","Xenon","124,126,128-132,134,136","Noble"));
		table.add(new Element(0,5,"55","Cs","Caesium","133","Alkali"));
		table.add(new Element(1,5,"56","Ba","Barium","130,132,134-138","Alkaline"));
		table.add(new Element(2,7,"57","La","Lanthanum","139","Lanthanide"));
		table.add(new Element(3,7,"58","Ce","Cerium","136,138,140,142","Lanthanide"));
		table.add(new Element(4,7,"59","Pr","Praseodymium","141","Lanthanide"));
		table.add(new Element(5,7,"60","Nd","Neodymium","142-143,145-146,148","Lanthanide"));
		table.add(new Element(6,7,"61","Pm","Promethium","Radioactive","Lanthanide"));
		table.add(new Element(7,7,"62","Sm","Samarium","144,149-150,152,154","Lanthanide"));
		table.add(new Element(8,7,"63","Eu","Europium","151,153","Lanthanide"));
		table.add(new Element(9,7,"64","Gd","Gadolinium","154-158,160","Lanthanide"));
		table.add(new Element(10,7,"65","Tb","Terbium","159","Lanthanide"));
		table.add(new Element(11,7,"66","Dy","Dysprosium","156,158,160-164","Lanthanide"));
		table.add(new Element(12,7,"67","Ho","Holmium","165","Lanthanide"));
		table.add(new Element(13,7,"68","Er","Erbium","162,164,166-168,170","Lanthanide"));
		table.add(new Element(14,7,"69","Tm","Thulium","169","Lanthanide"));
		table.add(new Element(15,7,"70","Yb","Ytterbium","168,170-174,176","Lanthanide"));
		table.add(new Element(16,7,"71","Lu","Lutetium","175","Lanthanide"));
		table.add(new Element(3,5,"72","Hf","Hafnium","176-180","Transition"));
		table.add(new Element(4,5,"73","Ta","Tantalum","181","Transition"));
		table.add(new Element(5,5,"74","W","Tungsten","180,182-184,186","Transition"));
		table.add(new Element(6,5,"75","Re","Rhenium","185","Transition"));
		table.add(new Element(7,5,"76","Os","Osmium","184,187-190,192","Transition"));
		table.add(new Element(8,5,"77","Ir","Iridium","191,193","Transition"));
		table.add(new Element(9,5,"78","Pt","Platinum","192,194-196,198","Transition"));
		table.add(new Element(10,5,"79","Au","Gold","197","Transition"));
		table.add(new Element(11,5,"80","Hg","Mercury","196,198-202,204","Transition"));
		table.add(new Element(12,5,"81","Tl","Thallium","203,205","Metal"));
		table.add(new Element(13,5,"82","Pb","Lead","204,206-208","Metal"));
		table.add(new Element(14,5,"83","Bi","Bismuth","209","Metal"));
		table.add(new Element(15,5,"84","Po","Polonium","Radioactive","Metal"));
		table.add(new Element(16,5,"85","At","Astatine","Radioactive","Metalloid"));
		table.add(new Element(17,5,"86","Rn","Radon","Radioactive","Noble"));
		table.add(new Element(0,6,"87","Fr","Francium","Radioactive","Alkali"));
		table.add(new Element(1,6,"88","Ra","Radium","Radioactive","Alkaline"));
		table.add(new Element(2,8,"89","Ac","Actinium","Radioactive","Actinide"));
		table.add(new Element(3,8,"90","Th","Thorium","232","Actinide"));
		table.add(new Element(4,8,"91","Pa","Protactinium","Radioactive","Actinide"));
		table.add(new Element(5,8,"92","U","Uranium","Radioactive","Actinide"));
		table.add(new Element(6,8,"93","Np","Neptunium","Radioactive","Actinide"));
		table.add(new Element(7,8,"94","Pu","Plutonium","Radioactive","Actinide"));
		table.add(new Element(8,8,"95","Am","Americium","Radioactive","Actinide"));
		table.add(new Element(9,8,"96","Cm","Curium","Radioactive","Actinide"));
		table.add(new Element(10,8,"97","Bk","Berkelium","Radioactive","Actinide"));
		table.add(new Element(11,8,"98","Cf","Californium","Radioactive","Actinide"));
		table.add(new Element(12,8,"99","Es","Einsteinium","Radioactive","Actinide"));
		table.add(new Element(13,8,"100","Fm","Fermium","Radioactive","Actinide"));
		table.add(new Element(14,8,"101","Md","Mendelevium","Radioactive","Actinide"));
		table.add(new Element(15,8,"102","No","Nobelium","Radioactive","Actinide"));
		table.add(new Element(16,8,"103","Lr","Lawrencium","Radioactive","Actinide"));
		table.add(new Element(3,6,"104","Rf","Rutherfordium","Radioactive","Transition"));
		table.add(new Element(4,6,"105","Db","Dubnium","Radioactive","Transition"));
		table.add(new Element(5,6,"106","Sg","Seaborgium","Radioactive","Transition"));
		table.add(new Element(6,6,"107","Bh","Bohrium","Radioactive","Transition"));
		table.add(new Element(7,6,"108","Hs","Hassium","Radioactive","Transition"));
		table.add(new Element(8,6,"109","Mt","Meitnerium","Radioactive", null));
		table.add(new Element(9,6,"110","Ds","Darmstadtium","Radioactive", null));
		table.add(new Element(10,6,"111","Rg","Roentgenium","Radioactive", null));
		table.add(new Element(11,6,"112","Cn","Copernicium","Radioactive","Transition"));
		table.add(new Element(12,6,"113","Uut","Ununtrium","Radioactive", null));
		table.add(new Element(13,6,"114","Fl","Flerovium","Radioactive", null));
		table.add(new Element(14,6,"115","Uup","Ununpentium","Radioactive", null));
		table.add(new Element(15,6,"116","Lv","Livermorium","Radioactive", null));
		table.add(new Element(16,6,"117","Uus","Ununseptium","Radioactive", null));
		table.add(new Element(17,6,"118","Uuo","Ununoctium","Radioactive", null));
	}
	
	public void draw()
	{
		cardWidth =width/18;
		cardHeight=height/9;
		fontFactor=height/400;
		
	    background(255);
	    for(Element e : table){
	        e.draw(this);
	    }
	}
	
}
