package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @Test
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 30.08.2018.
 */

public class MultiTest {

	@Test
	public void whenDataMultidimensionalByTrueThenTrue() {
		Multi multi = new Multi();
		boolean[][] input = new boolean[][] {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
		boolean result = multi.multidimensional(input);
		assertThat(result, is(true));
	}

	@Test
	public void whenDataMultidimensionalByTrueThenFalse() {
		Multi multi = new Multi();
		boolean[][] input = new boolean[][] {
				{true, true, true},
				{true, false, true},
				{true, true, true}
		};
		boolean result = multi.multidimensional(input);
		assertThat(result, is(false));
	}

	@Test
	public void whenDataMultidimensionalByTrueThenAllFalse() {
		Multi multi = new Multi();
		boolean[][] input = new boolean[][] {
				{false, false, false},
				{false, false, false},
				{false, false, false}
		};
		boolean result = multi.multidimensional(input);
		assertThat(result, is(true));
	}
}