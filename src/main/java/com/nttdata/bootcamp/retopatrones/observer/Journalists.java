package com.nttdata.bootcamp.retopatrones.observer;

public class Journalists {
	public Media media;

	public Journalists() {
		this.media = new Media("cocheVolcado", "corrupcion", "aliens");
	}

	public void publishNewsType1() {
		media.publishNews("cocheVolcado");
	}

	public void publishNewsType2() {
		media.publishNews("corrupcion");
	}

	public void publishNewsType3() {
		media.publishNews("aliens");
	}
}
