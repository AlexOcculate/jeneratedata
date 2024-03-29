package com.googlecode.jeneratedata.people;

import com.googlecode.jeneratedata.core.Generator;
import com.googlecode.jeneratedata.core.GeneratorWrapperBase;
import com.googlecode.jeneratedata.core.RandomSequenceArrayBasedGenerator;

/**
 * Generates random last names. The list of surnames was taken from the top 200
 * most common surnames in the United Stated by the 2000 census.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class LastNameGenerator extends GeneratorWrapperBase<String> implements Generator<String> {
	/**
	 * The most common last names in the United States.
	 */
	private static final String[] lastNames = new String[] { "Smith",
			"Johnson", "Williams", "Jones", "Brown", "Davis", "Miller",
			"Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson",
			"White", "Harris", "Martin", "Thompson", "Garcia", "Martinez",
			"Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall",
			"Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill",
			"Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter",
			"Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell",
			"Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez",
			"Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy",
			"Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard",
			"Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson",
			"Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
			"Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell",
			"Long", "Patterson", "Hughes", "Flores", "Washington", "Butler",
			"Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell",
			"Griffin", "Diaz", "Hayes", "Myers", "Ford", "Hamilton", "Graham",
			"Sullivan", "Wallace", "Woods", "Cole", "West", "Jordan", "Owens",
			"Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "McDonald",
			"Cruz", "Marshall", "Ortiz", "Gomez", "Murray", "Freeman", "Wells",
			"Webb", "Simpson", "Stevens", "Tucker", "Porter", "Hunter",
			"Hicks", "Crawford", "Henry", "Boyd", "Mason", "Morales",
			"Kennedy", "Warren", "Dixon", "Ramos", "Reyes", "Burns", "Gordon",
			"Shaw", "Holmes", "Rice", "Robertson", "Hunt", "Black", "Daniels",
			"Palmer", "Mills", "Nichols", "Grant", "Knight", "Ferguson",
			"Rose", "Stone", "Hawkins", "Dunn", "Perkins", "Hudson", "Spencer",
			"Gardner", "Stephens", "Payne", "Pierce", "Berry", "Matthews",
			"Arnold", "Wagner", "Willis", "Ray", "Watkins", "Olson", "Carroll",
			"Duncan", "Snyder", "Hart", "Cunningham", "Bradley", "Lane",
			"Andrews", "Ruiz", "Harper", "Fox", "Riley", "Armstrong",
			"Carpenter", "Weaver", "Greene", "Lawrence", "Elliott", "Chavez",
			"Sims", "Austin", "Peters", "Kelley", "Franklin", "Lawson",
			"Fields", "Gutierrez", "Ryan", "Schmidt", "Carr", "Vasquez",
			"Castillo", "Wheeler", "Chapman", "Oliver", "Montgomery",
			"Richards", "Williamson", "Johnston", "Banks", "Meyer", "Bishop",
			"McCoy", "Howell", "Alvarez", "Morrison", "Hansen", "Fernandez",
			"Garza", "Harvey", "Little", "Burton", "Stanley", "Nguyen",
			"George", "Jacobs", "Reid", "Kim", "Fuller", "Lynch", "Dean",
			"Gilbert", "Garrett", "Romero", "Welch", "Larson", "Frazier",
			"Burke", "Hanson", "Day", "Mendoza", "Moreno", "Bowman", "Medina",
			"Fowler" };

	/**
	 * Constructor.
	 */
	public LastNameGenerator() {
		super(new RandomSequenceArrayBasedGenerator<String>(lastNames));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.googlecode.jeneratedata.core.Generator#generate()
	 */
	@Override
	public String generate() {
		return generator.generate();
	}
}
