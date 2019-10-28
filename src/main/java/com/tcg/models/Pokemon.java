package com.tcg.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.tcg.models.Card;

@Data
@EqualsAndHashCode(callSuper=false)
public class Pokemon extends Card{

	public enum Type{ NONE, NORMAL, PSYCHIC, FIGHTING, FIRE, WATER, GRASS, 
		              ELECTRIC};
	
	private final Type type;
	private final int baseHP;
	private final int retreatCost;
	private final int evolutionStage;
	private final Type weakness;
	private final Type resistance;
	private final Move m1;
	private final Move m2;
	
	public Pokemon(String name, Category category, Type type, int baseHP, 
			       int retreatCost, int evolutionStage, Type weakness, 
			       Type resistance, Move m1, Move m2) {
		super(name, category);
		this.type = type;
		this.baseHP = baseHP;
		this.retreatCost = retreatCost;
		this.evolutionStage = evolutionStage;
		this.weakness = weakness;
		this.resistance = resistance;
		this.m1 = m1;
		this.m2 = m2;
	}
	
	public final Pokemon bulbasaur = new Pokemon("Bulbasaur", 
			                                     Card.Category.POKEMON, 
			                                     Type.GRASS, 40, 1, 1, 
			                                     Type.FIRE, Type.NONE );
	public final Pokemon ivysaur = new Pokemon("Ivysaur", 
			                                   Card.Category.POKEMON, 
			                                   Type.GRASS, 60, 1, 2, 
                                               Type.FIRE, Type.NONE );
	public final Pokemon venusaur = new Pokemon("Venusaur",
			                                    Card.Category.POKEMON, 
                                                Type.GRASS, 100, 2, 3, 
                                                Type.FIRE, Type.NONE );
	public final Pokemon charmander = new Pokemon("Charmander", 
			                                      Card.Category.POKEMON, 
                                                  Type.FIRE, 50, 1, 1, 
                                                  Type.WATER, Type.NONE );
	public final Pokemon charmeleon = new Pokemon("Charmeleon", 
			                                      Card.Category.POKEMON, 
                                                  Type.FIRE, 80, 1, 2,
                                                  Type.WATER, Type.NONE );
	public final Pokemon charizard = new Pokemon("Charizard", 
			                                     Card.Category.POKEMON, 
                                                 Type.FIRE, 120, 3, 3, 
                                                 Type.WATER, Type.FIGHTING );
	public final Pokemon squirtle = new Pokemon("Squirtle", 
			                                    Card.Category.POKEMON, 
                                                Type.WATER, 40, 1, 1,
                                                Type.ELECTRIC, Type.NONE );
	public final Pokemon wartortle = new Pokemon("Wartortle", 
			                                     Card.Category.POKEMON, 
                                                 Type.WATER, 70, 1, 2, 
                                                 Type.ELECTRIC, Type.NONE );
	public final Pokemon blastoise = new Pokemon("Blastoise", 
			                                     Card.Category.POKEMON, 
                                                 Type.WATER, 100, 3, 3, 
                                                 Type.ELECTRIC, Type.NONE );
	public final Pokemon caterpie = new Pokemon("Caterpie", 
			                                    Card.Category.POKEMON, 
                                                Type.GRASS, 40, 1, 1, 
                                                Type.FIRE, Type.NONE );
	public final Pokemon metapod = new Pokemon("Metapod", 
			                                   Card.Category.POKEMON, 
			                                   Type.GRASS, 70, 2, 2, 
			                                   Type.FIRE, Type.NONE );
	public final Pokemon butterfree = new Pokemon("Butterfree", 
			                         Card.Category.POKEMON, 
                                     Type.GRASS, 70, 0, 3, 
                                     Type.FIRE, Type.NONE );
	public final Pokemon weedle = new Pokemon("Weedle",
			                                  Card.Category.POKEMON, 
                                              Type.GRASS, 40, 1, 1, 
                                              Type.FIRE, Type.NONE );
	public final Pokemon kakuna = new Pokemon("Kakuna", 
			                                  Card.Category.POKEMON, 
                                              Type.GRASS, 80, 2, 2,
                                              Type.FIRE, Type.NONE );
	public final Pokemon beedrill = new Pokemon("Beedrill", 
			                                    Card.Category.POKEMON, 
                                                Type.GRASS, 80, 0, 3,
                                                Type.FIRE, Type.FIGHTING );
	public final Pokemon pidgey = new Pokemon("Pidgey", 
                                              Card.Category.POKEMON, 
                                              Type.NORMAL, 40, 1, 1,
                                              Type.ELECTRIC, Type.FIGHTING );
	public final Pokemon pidgeotto = new Pokemon("Pidgeotto", 
                                                 Card.Category.POKEMON, 
                                                 Type.NORMAL, 60, 1, 2,
                                                 Type.ELECTRIC, Type.FIGHTING );
	public final Pokemon pidgeot = new Pokemon("Pidgeot", 
                                               Card.Category.POKEMON, 
                                               Type.NORMAL, 80, 0, 3,
                                               Type.ELECTRIC, Type.FIGHTING );
	public final Pokemon rattata = new Pokemon("Rattata", 
                                               Card.Category.POKEMON, 
                                               Type.NORMAL, 30, 0, 1,
                                               Type.FIGHTING, Type.PSYCHIC );
	public final Pokemon raticate = new Pokemon("Raticate", 
                                                Card.Category.POKEMON, 
                                                Type.NORMAL, 60, 1, 2,
                                                Type.FIGHTING, Type.PSYCHIC );
	public final Pokemon spearow = new Pokemon("Spearow", 
                                               Card.Category.POKEMON, 
                                               Type.NORMAL, 50, 0, 1,
                                               Type.ELECTRIC, Type.FIGHTING );
	public final Pokemon fearow = new Pokemon("Fearow", 
                                              Card.Category.POKEMON, 
                                              Type.NORMAL, 70, 0, 2,
                                              Type.ELECTRIC, Type.FIGHTING );
	public final Pokemon ekans = new Pokemon("Ekans", 
                                             Card.Category.POKEMON, 
                                             Type.GRASS, 40, 1, 1,
                                             Type.PSYCHIC, Type.NONE );
	public final Pokemon arbok = new Pokemon("Arbok", 
                                             Card.Category.POKEMON, 
                                             Type.GRASS, 60, 2, 2,
                                             Type.PSYCHIC, Type.NONE );
	public final Pokemon pikachu1 = new Pokemon("Pikachu", 
                                                Card.Category.POKEMON, 
                                                Type.ELECTRIC, 40, 1, 1,
                                                Type.FIGHTING, Type.NONE );
	public final Pokemon pikachu2 = new Pokemon("Pikachu", 
                                                Card.Category.POKEMON, 
                                                Type.ELECTRIC, 50, 1, 1,
                                                Type.FIGHTING, Type.NONE );
	public final Pokemon raichu1 = new Pokemon("Raichu", 
                                               Card.Category.POKEMON, 
                                               Type.ELECTRIC, 80, 1, 2,
                                               Type.FIGHTING, Type.NONE );
	public final Pokemon raichu2 = new Pokemon("Raichu", 
                                               Card.Category.POKEMON, 
                                               Type.ELECTRIC, 90, 1, 2,
                                               Type.FIGHTING, Type.NONE );
	public final Pokemon sandshrew = new Pokemon("Sandshrew", 
                                                 Card.Category.POKEMON, 
                                                 Type.FIGHTING, 40, 1, 1,
                                                 Type.GRASS, Type.ELECTRIC );
	public final Pokemon sandslash = new Pokemon("Sandslash", 
                                                 Card.Category.POKEMON, 
                                                 Type.FIGHTING, 70, 1, 2,
                                                 Type.GRASS, Type.ELECTRIC );
	public final Pokemon nidoranf = new Pokemon("NidoranF", 
                                                Card.Category.POKEMON, 
                                                Type.GRASS, 60, 1, 1,
                                                Type.PSYCHIC, Type.NONE );
	public final Pokemon nidorina = new Pokemon("Nidorina", 
                                                Card.Category.POKEMON, 
                                                Type.GRASS, 70, 1, 2,
                                                Type.PSYCHIC, Type.NONE );
	public final Pokemon nidoqueen = new Pokemon("Nidoqueen", 
                                                 Card.Category.POKEMON, 
                                                 Type.GRASS, 90, 3, 3,
                                                 Type.PSYCHIC, Type.NONE );
	public final Pokemon nidoranm = new Pokemon("NidoranM", 
                                                Card.Category.POKEMON, 
                                                Type.GRASS, 40, 1, 1,
                                                Type.PSYCHIC, Type.NONE );
	public final Pokemon nidorino = new Pokemon("Nidorino", 
                                                Card.Category.POKEMON, 
                                                Type.GRASS, 60, 1, 2,
                                                Type.PSYCHIC, Type.NONE );
	public final Pokemon nidoking = new Pokemon("Nidoking", 
                                                Card.Category.POKEMON, 
                                                Type.GRASS, 90, 3, 3,
                                                Type.PSYCHIC, Type.NONE );
	public final Pokemon clefairy = new Pokemon("Clefairy", 
                                                Card.Category.POKEMON, 
                                                Type.NORMAL, 40, 1, 1,
                                                Type.FIGHTING, Type.PSYCHIC );
	public final Pokemon clefable = new Pokemon("Clefable", 
                                                Card.Category.POKEMON, 
                                                Type.NORMAL, 70, 2, 2,
                                                Type.FIGHTING, Type.PSYCHIC );
	public final Pokemon vulpix = new Pokemon("Vulpix", 
                                              Card.Category.POKEMON, 
                                              Type.FIRE, 50, 1, 1,
                                              Type.WATER, Type.NONE );
	public final Pokemon ninetales = new Pokemon("Ninetales", 
                                                 Card.Category.POKEMON, 
                                                 Type.FIRE, 80, 1, 2,
                                                 Type.WATER, Type.NONE );
	public final Pokemon jigglypuff = new Pokemon("Jigglypuff",
			                                      Card.Category.POKEMON,
			                                      Type.NORMAL, 60, 1, 1,
			                                      Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon wigglytuff = new Pokemon("Wigglytuff",
                                                  Card.Category.POKEMON,
                                                  Type.NORMAL, 80, 2, 2,
                                                  Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon zubat = new Pokemon("Zubat",
                                             Card.Category.POKEMON,
                                             Type.GRASS, 40, 0, 1,
                                             Type.PSYCHIC, Type.FIGHTING);
	public final Pokemon golbat = new Pokemon("Golbat",
                                              Card.Category.POKEMON,
                                              Type.GRASS, 60, 0, 2,
                                              Type.PSYCHIC, Type.FIGHTING);
	public final Pokemon oddish = new Pokemon("Oddish",
                                              Card.Category.POKEMON,
                                              Type.GRASS, 50, 1, 1,
                                              Type.FIRE, Type.NONE);
	public final Pokemon gloom = new Pokemon("Gloom",
                                             Card.Category.POKEMON,
                                             Type.GRASS, 60, 1, 2,
                                             Type.FIRE, Type.NONE);
	public final Pokemon vileplume = new Pokemon("Vileplume",
                                                 Card.Category.POKEMON,
                                                 Type.GRASS, 80, 2, 3,
                                                 Type.FIRE, Type.NONE);
	public final Pokemon paras = new Pokemon("Paras",
                                             Card.Category.POKEMON,
                                             Type.GRASS, 40, 1, 1,
                                             Type.FIRE, Type.NONE);
	public final Pokemon parasect = new Pokemon("Parasect",
                                                Card.Category.POKEMON,
                                                Type.GRASS, 60, 1, 2,
                                                Type.FIRE, Type.NONE);
	public final Pokemon venonat = new Pokemon("Venonat",
                                               Card.Category.POKEMON,
                                               Type.GRASS, 40, 1, 1,
                                               Type.FIRE, Type.NONE);
	public final Pokemon venomoth = new Pokemon("Venomoth",
                                                Card.Category.POKEMON,
                                                Type.GRASS, 70, 0, 2,
                                                Type.FIRE, Type.FIGHTING);
	public final Pokemon diglett = new Pokemon("Diglett",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 30, 0, 1,
                                               Type.GRASS, Type.ELECTRIC);
	public final Pokemon dugtrio = new Pokemon("Dugtrio",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 70, 2, 2,
                                               Type.GRASS, Type.ELECTRIC);
	public final Pokemon meowth = new Pokemon("Meowth",
                                              Card.Category.POKEMON,
                                              Type.NORMAL, 50, 1, 1,
                                              Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon persian = new Pokemon("Persian",
                                               Card.Category.POKEMON,
                                               Type.NORMAL, 70, 0, 2,
                                               Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon psyduck = new Pokemon("Psyduck",
                                               Card.Category.POKEMON,
                                               Type.WATER, 50, 1, 1,
                                               Type.ELECTRIC, Type.NONE);
	public final Pokemon golduck = new Pokemon("Golduck",
                                               Card.Category.POKEMON,
                                               Type.WATER, 70, 1, 2,
                                               Type.ELECTRIC, Type.NONE);
	public final Pokemon mankey = new Pokemon("Mankey",
                                              Card.Category.POKEMON,
                                              Type.FIGHTING, 30, 0, 1,
                                              Type.PSYCHIC, Type.NONE);
	public final Pokemon primeape = new Pokemon("Primeape",
                                                Card.Category.POKEMON,
                                                Type.FIGHTING, 70, 1, 2,
                                                Type.PSYCHIC, Type.NONE);
	public final Pokemon growlithe = new Pokemon("Growlithe",
                                                 Card.Category.POKEMON,
                                                 Type.FIRE, 60, 1, 1,
                                                 Type.WATER, Type.NONE);
	public final Pokemon arcanine = new Pokemon("Arcanine",
                                                Card.Category.POKEMON,
                                                Type.FIRE, 100, 3, 2,
                                                Type.WATER, Type.NONE);
	public final Pokemon poliwag = new Pokemon("Poliwag",
                                               Card.Category.POKEMON,
                                               Type.WATER, 40, 1, 1,
                                               Type.GRASS, Type.NONE);
	public final Pokemon poliwhirl = new Pokemon("Poliwhirl",
                                                 Card.Category.POKEMON,
                                                 Type.WATER, 60, 1, 2,
                                                 Type.GRASS, Type.NONE);
	public final Pokemon poliwrath = new Pokemon("Poliwrath",
                                                 Card.Category.POKEMON,
                                                 Type.WATER, 90, 3, 3,
                                                 Type.GRASS, Type.NONE);
	public final Pokemon abra = new Pokemon("Abra",
                                            Card.Category.POKEMON,
                                            Type.PSYCHIC, 30, 0, 1,
                                            Type.PSYCHIC, Type.NONE);
	public final Pokemon kadabra = new Pokemon("Kadabra",
                                               Card.Category.POKEMON,
                                               Type.PSYCHIC, 60, 3, 2,
                                               Type.PSYCHIC, Type.NONE);
	public final Pokemon alakazam = new Pokemon("Alakazam",
                                                Card.Category.POKEMON,
                                                Type.PSYCHIC, 80, 3, 3,
                                                Type.PSYCHIC, Type.NONE);
	public final Pokemon machop = new Pokemon("Machop",
                                              Card.Category.POKEMON,
                                              Type.FIGHTING, 50, 1, 1,
                                              Type.PSYCHIC, Type.NONE);
	public final Pokemon machoke = new Pokemon("Machoke",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 80, 3, 2,
                                               Type.PSYCHIC, Type.NONE);
	public final Pokemon machamp = new Pokemon("Machamp",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 100, 3, 3,
                                               Type.PSYCHIC, Type.NONE);
	public final Pokemon bellsprout = new Pokemon("Bellsprout",
                                                  Card.Category.POKEMON,
                                                  Type.GRASS, 50, 1, 1,
                                                  Type.FIRE, Type.NONE);
	public final Pokemon weepinbell = new Pokemon("Weepinbell",
                                                  Card.Category.POKEMON,
                                                  Type.GRASS, 70, 1, 2,
                                                  Type.FIRE, Type.NONE);
	public final Pokemon victreebel = new Pokemon("Victreebel",
                                                  Card.Category.POKEMON,
                                                  Type.GRASS, 80, 2, 3,
                                                  Type.FIRE, Type.NONE);
	public final Pokemon tentacool = new Pokemon("Tentacool",
                                                 Card.Category.POKEMON,
                                                 Type.WATER, 30, 0, 1,
                                                 Type.ELECTRIC, Type.NONE);
	public final Pokemon tentacruel = new Pokemon("Tentacruel",
                                                  Card.Category.POKEMON,
                                                  Type.WATER, 60, 0, 2,
                                                  Type.ELECTRIC, Type.NONE);
	public final Pokemon geodude = new Pokemon("Geodude",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 50, 1, 1,
                                               Type.GRASS, Type.NONE);
	public final Pokemon graveler = new Pokemon("Graveler",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 60, 2, 2,
                                               Type.GRASS, Type.NONE);
	public final Pokemon golem = new Pokemon("Golem",
                                             Card.Category.POKEMON,
                                             Type.FIGHTING, 80, 4, 3,
                                             Type.GRASS, Type.NONE);
	public final Pokemon ponyta = new Pokemon("Ponyta",
                                              Card.Category.POKEMON,
                                              Type.FIRE, 40, 1, 1,
                                              Type.WATER, Type.NONE);
	public final Pokemon rapidash = new Pokemon("Rapidash",
                                                Card.Category.POKEMON,
                                                Type.FIRE, 70, 0, 2,
                                                Type.WATER, Type.NONE);
	public final Pokemon slowpoke = new Pokemon("Slowpoke",
                                                Card.Category.POKEMON,
                                                Type.PSYCHIC, 50, 1, 1,
                                                Type.PSYCHIC, Type.NONE);
	public final Pokemon slowbro = new Pokemon("Slowbro",
                                               Card.Category.POKEMON,
                                               Type.PSYCHIC, 60, 1, 2,
                                               Type.PSYCHIC, Type.NONE);
	public final Pokemon magnemite = new Pokemon("Magnemite",
                                                 Card.Category.POKEMON,
                                                 Type.ELECTRIC, 40, 1, 1,
                                                 Type.FIGHTING, Type.NONE);
	public final Pokemon magneton1 = new Pokemon("Magneton",
                                                 Card.Category.POKEMON,
                                                 Type.ELECTRIC, 60, 1, 2,
                                                 Type.FIGHTING, Type.NONE);
	public final Pokemon magneton2 = new Pokemon("Magneton",
                                                 Card.Category.POKEMON,
                                                 Type.ELECTRIC, 80, 2, 2,
                                                 Type.FIGHTING, Type.NONE);
	public final Pokemon farfetchd = new Pokemon("Farfetchd",
                                                 Card.Category.POKEMON,
                                                 Type.NORMAL, 50, 1, 1,
                                                 Type.ELECTRIC, Type.FIGHTING);
	public final Pokemon doduo = new Pokemon("Doduo",
                                             Card.Category.POKEMON,
                                             Type.NORMAL, 50, 0, 1,
                                             Type.ELECTRIC, Type.FIGHTING);
	public final Pokemon dodrio = new Pokemon("Dodrio",
                                              Card.Category.POKEMON,
                                              Type.NORMAL, 70, 0, 2,
                                              Type.ELECTRIC, Type.FIGHTING);
	public final Pokemon seel = new Pokemon("Seel",
                                            Card.Category.POKEMON,
                                            Type.WATER, 60, 1, 1,
                                            Type.ELECTRIC, Type.NONE);
	public final Pokemon dewgong = new Pokemon("Dewgong",
                                               Card.Category.POKEMON,
                                               Type.WATER, 80, 3, 2,
                                               Type.ELECTRIC, Type.NONE);
	public final Pokemon grimer = new Pokemon("Grimer",
                                              Card.Category.POKEMON,
                                              Type.GRASS, 50, 1, 1,
                                              Type.PSYCHIC, Type.NONE);
	public final Pokemon muk = new Pokemon("Muk",
                                           Card.Category.POKEMON,
                                           Type.GRASS, 70, 2, 2,
                                           Type.PSYCHIC, Type.NONE);
	public final Pokemon shellder = new Pokemon("Shellder",
                                                Card.Category.POKEMON,
                                                Type.WATER, 30, 1, 1,
                                                Type.ELECTRIC, Type.NONE);
	public final Pokemon cloyster = new Pokemon("Cloyster",
                                                Card.Category.POKEMON,
                                                Type.WATER, 50, 2, 2,
                                                Type.ELECTRIC, Type.NONE);
	public final Pokemon gastly1 = new Pokemon("Gastly",
                                              Card.Category.POKEMON,
                                              Type.PSYCHIC, 30, 0, 1,
                                              Type.NONE, Type.FIGHTING);
	public final Pokemon gastly2 = new Pokemon("Gastly",
                                               Card.Category.POKEMON,
                                               Type.PSYCHIC, 50, 0, 1,
                                               Type.NONE, Type.FIGHTING);
	public final Pokemon haunter1 = new Pokemon("Haunter",
                                                Card.Category.POKEMON,
                                                Type.PSYCHIC, 60, 1, 2,
                                                Type.NONE, Type.FIGHTING);
	public final Pokemon haunter2 = new Pokemon("Haunter",
                                                Card.Category.POKEMON,
                                                Type.PSYCHIC, 50, 0, 2,
                                                Type.NONE, Type.FIGHTING);
	public final Pokemon gengar = new Pokemon("Gengar",
                                              Card.Category.POKEMON,
                                              Type.PSYCHIC, 80, 1, 3,
                                              Type.NONE, Type.FIGHTING);
	public final Pokemon onix = new Pokemon("Onix",
                                            Card.Category.POKEMON,
                                            Type.FIGHTING, 90, 3, 1,
                                            Type.GRASS, Type.NONE);
	public final Pokemon drowzee = new Pokemon("Drowzee",
                                               Card.Category.POKEMON,
                                               Type.PSYCHIC, 50, 1, 1,
                                               Type.PSYCHIC, Type.NONE);
	public final Pokemon hypno = new Pokemon("Hypno",
                                             Card.Category.POKEMON,
                                             Type.PSYCHIC, 90, 2, 2,
                                             Type.PSYCHIC, Type.NONE);
	public final Pokemon krabby = new Pokemon("Krabby",
                                              Card.Category.POKEMON,
                                              Type.WATER, 50, 2, 1,
                                              Type.ELECTRIC, Type.NONE);
	public final Pokemon kingler = new Pokemon("Kingler",
                                               Card.Category.POKEMON,
                                               Type.WATER, 60, 3, 2,
                                               Type.ELECTRIC, Type.NONE);
	public final Pokemon voltorb = new Pokemon("Voltorb",
                                               Card.Category.POKEMON,
                                               Type.ELECTRIC, 40, 1, 1,
                                               Type.FIGHTING, Type.NONE);
	public final Pokemon electrode1 = new Pokemon("Electrode",
                                                  Card.Category.POKEMON,
                                                  Type.ELECTRIC, 90, 1, 2,
                                                  Type.FIGHTING, Type.NONE);
	public final Pokemon exeggcute = new Pokemon("Exeggcute",
                                                 Card.Category.POKEMON,
                                                 Type.GRASS, 50, 1, 1,
                                                 Type.FIRE, Type.NONE);
	public final Pokemon exeggutor = new Pokemon("Exeggutor",
                                                 Card.Category.POKEMON,
                                                 Type.GRASS, 80, 3, 2,
                                                 Type.FIRE, Type.NONE);
	public final Pokemon cubone = new Pokemon("Cubone",
                                              Card.Category.POKEMON,
                                              Type.FIGHTING, 40, 1, 1,
                                              Type.GRASS, Type.ELECTRIC);
	public final Pokemon marowak = new Pokemon("Marowak",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 60, 1, 2,
                                               Type.GRASS, Type.ELECTRIC);
	public final Pokemon hitmonlee = new Pokemon("Hitmonlee",
                                                 Card.Category.POKEMON,
                                                 Type.FIGHTING, 60, 1, 1,
                                                 Type.PSYCHIC, Type.NONE);
	public final Pokemon hitmonchan = new Pokemon("Hitmonchan",
                                                  Card.Category.POKEMON,
                                                  Type.FIGHTING, 70, 2, 1,
                                                  Type.PSYCHIC, Type.NONE);
	public final Pokemon lickitung = new Pokemon("Lickitung",
                                                 Card.Category.POKEMON,
                                                 Type.NORMAL, 90, 3, 1,
                                                 Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon koffing = new Pokemon("Koffing",
                                               Card.Category.POKEMON,
                                               Type.GRASS, 50, 1, 1,
                                               Type.PSYCHIC, Type.NONE);
	public final Pokemon weezing = new Pokemon("Weezing",
                                               Card.Category.POKEMON,
                                               Type.GRASS, 60, 1, 2,
                                               Type.PSYCHIC, Type.NONE);
	public final Pokemon rhyhorn = new Pokemon("Rhyhorn",
                                               Card.Category.POKEMON,
                                               Type.FIGHTING, 70, 3, 1,
                                               Type.GRASS, Type.ELECTRIC);
	public final Pokemon rhydon = new Pokemon("Rhydon",
                                              Card.Category.POKEMON,
                                              Type.FIGHTING, 100, 3, 2,
                                              Type.GRASS, Type.ELECTRIC);
	public final Pokemon chansey = new Pokemon("Chansey",
                                               Card.Category.POKEMON,
                                               Type.NORMAL, 120, 1, 1,
                                               Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon tangela = new Pokemon("Tangela",
                                               Card.Category.POKEMON,
                                               Type.GRASS, 50, 2, 1,
                                               Type.FIRE, Type.NONE);
	public final Pokemon kangaskhan = new Pokemon("Kangaskhan",
                                                  Card.Category.POKEMON,
                                                  Type.NORMAL, 90, 3, 1,
                                                  Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon horsea = new Pokemon("Horsea",
                                              Card.Category.POKEMON,
                                              Type.WATER, 40, 0, 1,
                                              Type.ELECTRIC, Type.NONE);
	public final Pokemon seadra = new Pokemon("Seadra",
                                              Card.Category.POKEMON,
                                              Type.WATER, 60, 1, 2,
                                              Type.ELECTRIC, Type.NONE);
	public final Pokemon goldeen = new Pokemon("Goldeen",
                                               Card.Category.POKEMON,
                                               Type.WATER, 40, 0, 1,
                                               Type.ELECTRIC, Type.NONE);
	public final Pokemon seaking = new Pokemon("Seaking",
                                               Card.Category.POKEMON,
                                               Type.WATER, 70, 1, 2,
                                               Type.ELECTRIC, Type.NONE);
	public final Pokemon staryu = new Pokemon("Staryu",
                                              Card.Category.POKEMON,
                                              Type.WATER, 40, 1, 1,
                                              Type.ELECTRIC, Type.NONE);
	public final Pokemon starmie = new Pokemon("Starmie",
                                               Card.Category.POKEMON,
                                               Type.WATER, 60, 1, 2,
                                               Type.ELECTRIC, Type.NONE);
	public final Pokemon mrMime = new Pokemon("Mr_Mime",
                                              Card.Category.POKEMON,
                                              Type.PSYCHIC, 40, 1, 1,
                                              Type.PSYCHIC, Type.NONE);
	public final Pokemon scyther = new Pokemon("Scyther",
                                               Card.Category.POKEMON,
                                               Type.GRASS, 70, 0, 1,
                                               Type.FIRE, Type.FIGHTING);
	public final Pokemon jynx = new Pokemon("Jynx",
                                            Card.Category.POKEMON,
                                            Type.PSYCHIC, 70, 2, 1,
                                            Type.PSYCHIC, Type.NONE);
	public final Pokemon electabuzz = new Pokemon("Electabuzz",
                                                  Card.Category.POKEMON,
                                                  Type.ELECTRIC, 70, 2, 1,
                                                  Type.FIGHTING, Type.NONE);
	public final Pokemon magmar1 = new Pokemon("Magmar",
                                              Card.Category.POKEMON,
                                              Type.FIRE, 50, 2, 1,
                                              Type.WATER, Type.NONE);
	public final Pokemon magmar2 = new Pokemon("Magmar",
                                               Card.Category.POKEMON,
                                               Type.FIRE, 70, 1, 1,
                                               Type.WATER, Type.NONE);
	public final Pokemon pinsir = new Pokemon("Pinsir",
                                              Card.Category.POKEMON,
                                              Type.GRASS, 60, 1, 1,
                                              Type.FIRE, Type.NONE);
	public final Pokemon tauros = new Pokemon("Tauros",
                                              Card.Category.POKEMON,
                                              Type.NORMAL, 60, 2, 1,
                                              Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon magikarp = new Pokemon("Magikarp",
                                                Card.Category.POKEMON,
                                                Type.WATER, 30, 1, 1,
                                                Type.ELECTRIC, Type.NONE);
	public final Pokemon gyarados = new Pokemon("Gyarados",
                                                Card.Category.POKEMON,
                                                Type.WATER, 100, 3, 2,
                                                Type.GRASS, Type.FIGHTING);
	public final Pokemon lapras = new Pokemon("Lapras",
                                              Card.Category.POKEMON,
                                              Type.WATER, 80, 2, 1,
                                              Type.ELECTRIC, Type.NONE);
	//public final Pokemon ditto = new Pokemon("Tauros",
      //                                        Card.Category.POKEMON,
        //                                      Type.NORMAL, 60, 2, 1,
          //                                    Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon eevee = new Pokemon("Eevee",
                                             Card.Category.POKEMON,
                                             Type.NORMAL, 50, 1, 1,
                                             Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon vaporeon = new Pokemon("Vaporeon",
                                                Card.Category.POKEMON,
                                                Type.WATER, 80, 1, 2,
                                                Type.ELECTRIC, Type.NONE);
	public final Pokemon jolteon = new Pokemon("Jolteon",
                                                Card.Category.POKEMON,
                                                Type.ELECTRIC, 70, 1, 2,
                                                Type.FIGHTING, Type.NONE);
	public final Pokemon flareon = new Pokemon("Flareon",
                                               Card.Category.POKEMON,
                                               Type.FIRE, 70, 1, 2,
                                               Type.WATER, Type.NONE);
	public final Pokemon porygon = new Pokemon("Porygon",
                                               Card.Category.POKEMON,
                                               Type.NORMAL, 30, 1, 1,
                                               Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon omanyte = new Pokemon("Omanyte",
                                               Card.Category.POKEMON,
                                               Type.WATER, 40, 1, 2,
                                               Type.GRASS, Type.NONE);
	public final Pokemon omastar = new Pokemon("Omastar",
                                               Card.Category.POKEMON,
                                               Type.WATER, 70, 1, 3,
                                               Type.GRASS, Type.NONE);
	public final Pokemon kabuto = new Pokemon("Kabuto",
                                              Card.Category.POKEMON,
                                              Type.FIGHTING, 30, 1, 2,
                                              Type.GRASS, Type.NONE);
	public final Pokemon kabutops = new Pokemon("Kabutops",
                                                Card.Category.POKEMON,
                                                Type.FIGHTING, 60, 1, 3,
                                                Type.GRASS, Type.NONE);
	public final Pokemon aerodactyl = new Pokemon("Aerodactyl",
                                                  Card.Category.POKEMON,
                                                  Type.FIGHTING, 60, 1, 2,
                                                  Type.GRASS, Type.NONE);
	public final Pokemon snorlax = new Pokemon("Snorlax",
                                               Card.Category.POKEMON,
                                               Type.NORMAL, 90, 4, 1,
                                               Type.FIGHTING, Type.PSYCHIC);
	public final Pokemon articuno = new Pokemon("Articuno",
                                                Card.Category.POKEMON,
                                                Type.WATER, 70, 2, 1,
                                                Type.NONE, Type.FIGHTING);
	public final Pokemon zapdos1 = new Pokemon("Zapdos",
                                               Card.Category.POKEMON,
                                               Type.ELECTRIC, 90, 3, 1,
                                               Type.NONE, Type.FIGHTING);
	public final Pokemon zapdos2 = new Pokemon("Zapdos",
                                               Card.Category.POKEMON,
                                               Type.ELECTRIC, 80, 2, 1,
                                               Type.NONE, Type.FIGHTING);
	public final Pokemon moltres = new Pokemon("Moltres",
                                               Card.Category.POKEMON,
                                               Type.FIRE, 70, 2, 1,
                                               Type.NONE, Type.FIGHTING);
	public final Pokemon dratini = new Pokemon("Dratini",
                                               Card.Category.POKEMON,
                                               Type.NORMAL, 40, 1, 1,
                                               Type.NONE, Type.PSYCHIC);
	public final Pokemon dragonair = new Pokemon("Dragonair",
                                                 Card.Category.POKEMON,
                                                 Type.NORMAL, 80, 2, 2,
                                                 Type.NONE, Type.PSYCHIC);
	public final Pokemon dragonite = new Pokemon("Dragonite",
                                                 Card.Category.POKEMON,
                                                 Type.NORMAL, 100, 1, 3,
                                                 Type.NONE, Type.PSYCHIC);
	public final Pokemon mewtwo = new Pokemon("Mewtwo",
                                              Card.Category.POKEMON,
                                              Type.PSYCHIC, 60, 3, 1,
                                              Type.PSYCHIC, Type.NONE);
	public final Pokemon mew = new Pokemon("Mew",
                                           Card.Category.POKEMON,
                                           Type.PSYCHIC, 50, 1, 1,
                                           Type.PSYCHIC, Type.NONE);
}
