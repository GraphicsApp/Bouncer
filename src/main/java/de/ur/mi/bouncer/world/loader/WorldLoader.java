package de.ur.mi.bouncer.world.loader;

import de.ur.mi.bouncer.world.World;

import java.io.File;

public class WorldLoader {
	private static final String ASSET_FOLDER = "data/assets/";
	
	public World loadLocalMap(String mapName) {
		try {
			File mapFile = new File(ASSET_FOLDER + mapName + ".xml");
			XMLDocument xmlDoc = new XMLDocument(mapFile);
			return XmlWorldBuilder.fromXmlDocument(xmlDoc);
		} catch (Exception e) {
			return null;
		}
	}
}
