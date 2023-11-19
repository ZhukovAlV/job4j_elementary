package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2To1Then3() {
        int left = 3;
        int middle = 2;
        int right = 1;
        int result = Max.max(left, Max.max(middle, right));
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To3To2To1Then4() {
        int oneNum = 3;
        int twoNum = 2;
        int threeNum = 1;
        int fourNum = 1;
        int result = Max.max(Max.max(oneNum, twoNum), Max.max(threeNum, fourNum));
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}