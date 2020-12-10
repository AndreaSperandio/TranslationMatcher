package view.util;

import java.net.URL;

import javax.swing.ImageIcon;

import view.MainView;

public class TMResource {
	private TMResource() {
	}

	public static ImageIcon getStartImage() {
		return new ImageIcon(TMResource.get("start.png"));
	}

	public static ImageIcon getStopImage() {
		return new ImageIcon(TMResource.get("stop.png"));
	}

	public static ImageIcon getResetImage() {
		return new ImageIcon(TMResource.get("reset.png"));
	}

	public static ImageIcon getExportImage() {
		return new ImageIcon(TMResource.get("export.png"));
	}

	private static URL get(final String resource) {
		final URL res = MainView.class.getResource("/resources/img/" + resource);
		return res != null ? res : MainView.class.getResource("/resources/img/notFound.png");
	}
}
