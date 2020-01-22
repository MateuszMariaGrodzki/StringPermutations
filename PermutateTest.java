import or.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutateTest{

	Permutate permutate;

	@BeforEach
	public void init(){
		permutate = new Permutate();
	}

	@Test
	@DisplayName("generate regex method tests for at most one dot in row");
	void testGenerateRegexMethodSigleDot(){
		assertAll(
			() -> assertEquals(permutate.generateRegex("ab.ed"),"[a][b][a-z][e][d]"),
			() -> assertEquals(permutate.generateRegex("ab.ed."),"[a][b][a-z][e][d][a-z]"),
			() -> assertEquals(permutate.generateRegex("a.b.c"),"[a][a-z][b][a-z][c]"),
			() -> assertEquals(permutate.generateRegex("a.b.c."),"[a][a-z][b][a-z][c][a-z]"),
			() -> assertEquals(permutate.generateRegex(".b."),"[a-z][b][a-z]"),
			() -> assertEquals(permutate.generateRegex(".b.d.e"),"[a-z][b][a-z][d][a-z][e]"),
			() -> assertEquals(permutate.generateRegex(".b.d.ee."),"[a-z][b][a-z][d][a-z][e][e][a-z]")
		);
	}

	@Test
	@DisplayName("generate regex method tests for two or more dots in row"){
	void testGenerateMethodMultipleDots(){
		assertAll(
			() -> assertEquals(permutate.generateRegex("..a.."),"[a-z]{2}[a][a-z]{2}"),
			() -> assertEquals(permutate.generateRegex("..a"),"[a-z]{2}[a]"),
			() -> assertEquals(permutate.generateRegex("....."),"[a-z]{5}"),
			() -> assertEquals(permutate.generateRegex("..a."),"[a-z]{2}[a][a-z]"),
			() -> assertEquals(permutate.generateRegex("..a..b..c.d.."),
					   "[a-z]{2}[a][a-z]{2}[b][a-z]{2}[c][a-z][d][a-z]{2}"),
			() -> assertEquals(permutate.generateRegex("...aa..b....."),"[a-z]{3}[a][a][a-z]{2}[b][a-z]{5}")
		);
	}
}

