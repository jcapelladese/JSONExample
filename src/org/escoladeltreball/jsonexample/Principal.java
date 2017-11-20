package org.escoladeltreball.jsonexample;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Principal {
	
	public static void main(String[] args) {
		
		
		// bean to JSON
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("934035434");
		aList.add("690482373");
		Persona per1 = new Persona("manolo", "garcia", 64, aList);
		Persona per2 = new Persona("marc", "garcia", 23, aList);
		
		ArrayList<Persona> aListPersona = new ArrayList<Persona>();
		aListPersona.add(per1);
		aListPersona.add(per2);
		
		
		Gson gson = new Gson();
		String json = gson.toJson(aListPersona);
		//System.out.println(json);
		
		// JSON to bean
//		Persona copia = gson.fromJson(json, Persona.class);
//		System.out.println(copia.toString());
		
		// JSON sin bean
//		JsonObject objeto = new JsonObject();
//		objeto.addProperty("nom", "algo");
//		objeto.addProperty("nom2", "algo2");
//		
//		json = objeto.toString();
//		System.out.println(json);
		
		// Parser
		JsonParser jParser = new JsonParser();
		JsonElement element = jParser.parse(json);	
		
		
				
		String nombre = "", edad ="", apellido="";
		if (element.isJsonArray() ) {
			for (int i = 0; i < element.getAsJsonArray().size(); i++) {
				JsonObject aux2 = element.getAsJsonArray().get(i).getAsJsonObject();
				nombre = aux2.get("nombre").getAsString();
				edad = aux2.get("edad").getAsString();
				apellido = aux2.get("apellido").getAsString();
				System.out.println(nombre + " " + apellido + " " + edad);
				JsonElement elementArray = aux2.get("telefonos");
				if (elementArray.isJsonArray()) {
					for (int j = 0; j < elementArray.getAsJsonArray().size(); j++) {
						String telf = elementArray.getAsJsonArray().get(j).getAsString();
						System.out.println(telf);					
					}
				}
			}			
		}
		
		
//		if (element.isJsonObject()) {
//			JsonObject aux = element.getAsJsonObject();
//			String nombre = aux.get("nombre").getAsString();
//			String edad = aux.get("edad").getAsString();
//			String apellido = aux.get("apellido").getAsString();
//			
//			JsonElement elementArray = aux.get("telefonos");
//			if (elementArray.isJsonArray()) {
//				for (int i = 0; i < elementArray.getAsJsonArray().size(); i++) {
//					String telf = elementArray.getAsJsonArray().get(i).getAsString();
//					System.out.println(telf);					
//				}
//			}			
//			System.out.println(nombre + " " + apellido + " " + edad);
//		}
	}

}
