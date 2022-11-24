package com.nttdata.bootcamp.retopatrones.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Medio de comunicación
public class Media {
	Map<String, List<EventListener>> listeners = new HashMap<>();

	public Media(String... newsList) {
		for (String news : newsList) {
			this.listeners.put(news, new ArrayList<>());
		}
	}

	public void subscribeNewsType(String news, EventListener listener) {
		List<EventListener> list = listeners.get(news);
		list.add(listener);
	}

	public void publishNews(String news) {
		List<EventListener> list = listeners.get(news);
		for (EventListener listener : list) {
			listener.update(news);
		}
	}

}
