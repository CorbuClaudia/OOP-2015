package com.example.alexh.zoosome.models.animals;
/*
import static com.example.alexh.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
*/
import com.example.alexh.zoosome.services.factories.Constants;

public class Kangaroo extends Mammal {
	private static final String DEFAULT_NAME = "Red kangaroo";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 1.2D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.02D;
	private static final double DEFAULT_BODY_TEMPERATURE = 37.0D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 80.2D;

	public Kangaroo() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE,
				DEFAULT_BODY_TEMPERATURE, DEFAULT_PERCENTAGE_BODY_HAIR);
	}

	public Kangaroo(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, normalTemp, muchHair);
	}

	public Kangaroo(String v1, String v2, String v3, String v4, String v5, String v6) {
		super(new String[] { v1, v2, v3, v4, v5, v6 });
	}
/*
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Mammal.KANGAROO));
	}*/
}
