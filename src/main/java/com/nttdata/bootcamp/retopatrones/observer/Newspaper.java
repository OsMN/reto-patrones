package com.nttdata.bootcamp.retopatrones.observer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Periodico atento a Media para transmitir noticias que ocurren
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Newspaper implements EventListener {
	private String newspaperName;
	private int newspaperID;
	private String type;

	public Newspaper(String name) {
		this.newspaperName = name;
	}

	@Override
	public void update(String news) {
		System.out
				.println("Nueva publicacion de periodico: " + newspaperName + " para mostrar las noticias nuevas: " + news);
	}

}
