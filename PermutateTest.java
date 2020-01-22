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

