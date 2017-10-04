package com.example.kevin.businesszxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void example1() throws Exception {
        int quant = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = true;
        boolean isClasic = false;
        boolean isNike = true;
        boolean isAdidas = false;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 120000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example2() throws Exception {
        int quant = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = true;
        boolean isClasic = false;
        boolean isNike = false;
        boolean isAdidas = true;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 140000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example3() throws Exception {
        int quant = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = true;
        boolean isClasic = false;
        boolean isNike = false;
        boolean isAdidas = false;
        boolean isPuma = true;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 130000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example4() throws Exception {
        int quant = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = false;
        boolean isClasic = true;
        boolean isNike = true;
        boolean isAdidas = false;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 50000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example5() throws Exception {
        int quant = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = false;
        boolean isClasic = true;
        boolean isNike = false;
        boolean isAdidas = true;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 80000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example6() throws Exception {
        int quant = 1;
        boolean isMan = true;
        boolean isWoman = false;
        boolean isSneaker = false;
        boolean isClasic = true;
        boolean isNike = false;
        boolean isAdidas = false;
        boolean isPuma = true;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 100000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example7() throws Exception {
        int quant = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = true;
        boolean isClasic = false;
        boolean isNike = true;
        boolean isAdidas = false;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 100000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example8() throws Exception {
        int quant = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = true;
        boolean isClasic = false;
        boolean isNike = false;
        boolean isAdidas = true;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 130000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example9() throws Exception {
        int quant = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = true;
        boolean isClasic = false;
        boolean isNike = false;
        boolean isAdidas = false;
        boolean isPuma = true;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 110000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example10() throws Exception {
        int quant = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = false;
        boolean isClasic = true;
        boolean isNike = true;
        boolean isAdidas = false;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 60000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example11() throws Exception {
        int quant = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = false;
        boolean isClasic = true;
        boolean isNike = false;
        boolean isAdidas = true;
        boolean isPuma = false;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 70000;
        assertEquals(totalValuec, realValue, 0);

    }
    @Test
    public void example12() throws Exception {
        int quant = 1;
        boolean isMan = false;
        boolean isWoman = true;
        boolean isSneaker = false;
        boolean isClasic = true;
        boolean isNike = false;
        boolean isAdidas = false;
        boolean isPuma = true;

        double totalValuec = Metodos.total(quant,isWoman,isMan,isSneaker,isClasic,isNike,isAdidas,isPuma);
        double realValue = 120000;
        assertEquals(totalValuec, realValue, 0);

    }
}