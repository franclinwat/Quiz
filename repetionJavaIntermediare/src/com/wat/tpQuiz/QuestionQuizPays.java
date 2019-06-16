package com.wat.tpQuiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuestionQuizPays {
	
	private List<String> pays;
	private List<String> dataPays=new ArrayList<>();
	
	public List<String> ajouterPays(){
		dataPays.add("Cameroun");
		dataPays.add("Nigeria");
		dataPays.add("Congo");
		dataPays.add("France");
		dataPays.add("Romanie");
		dataPays.add("Italie");
		System.out.println(dataPays);
		Collections.shuffle(dataPays);
		return dataPays;
		
	}
	

}
