package com.battleshipnet.test;

import com.battleshipnet.LogicGate;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by m.zilenas on 2016-06-17.
 */
public class LogicGateTest extends TestCase
{
    boolean[] c1 = {false, false};
    boolean[] c2 = {false, true};
    boolean[] c3 = {true, false};
    boolean[] c4 = {true, true};

    @Test
    public void testF() throws Exception
    {
        assertEquals(false, LogicGate.f());
    }

    @Test
    public void testAnd() throws Exception
    {
        assertEquals(false, LogicGate.and(c1));
        assertEquals(false, LogicGate.and(c2));
        assertEquals(false, LogicGate.and(c3));
        assertEquals(true, LogicGate.and(c4));
    }

    @Test
    public void testAandnotb() throws Exception
    {
        assertEquals(false, LogicGate.aandnotb(c1));
        assertEquals(false, LogicGate.aandnotb(c2));
        assertEquals(true, LogicGate.aandnotb(c3));
        assertEquals(false, LogicGate.aandnotb(c4));
    }

    @Test
    public void testA() throws Exception
    {
        assertEquals(c1[0], LogicGate.a(c1));
        assertEquals(c2[0], LogicGate.a(c2));
        assertEquals(c3[0], LogicGate.a(c3));
        assertEquals(c4[0], LogicGate.a(c4));
    }

    @Test
    public void testNotaandb() throws Exception
    {
        assertEquals(false, LogicGate.notaandb(c1));
        assertEquals(true, LogicGate.notaandb(c2));
        assertEquals(false, LogicGate.notaandb(c3));
        assertEquals(false, LogicGate.notaandb(c4));
    }

    @Test
    public void testB() throws Exception
    {
        assertEquals(c1[1], LogicGate.b(c1));
        assertEquals(c2[1], LogicGate.b(c2));
        assertEquals(c3[1], LogicGate.b(c3));
        assertEquals(c4[1], LogicGate.b(c4));
    }

    @Test
    public void testXor() throws Exception
    {
        assertEquals(false, LogicGate.xor(c1));
        assertEquals(true, LogicGate.xor(c2));
        assertEquals(true, LogicGate.xor(c3));
        assertEquals(false, LogicGate.xor(c4));
    }

    @Test
    public void testOr() throws Exception
    {
        assertEquals(false, LogicGate.or(c1));
        assertEquals(true, LogicGate.or(c2));
        assertEquals(true, LogicGate.or(c3));
        assertEquals(true, LogicGate.or(c4));
    }

    @Test
    public void testNor() throws Exception
    {
        assertNotEquals(false, LogicGate.nor(c1));
        assertNotEquals(true, LogicGate.nor(c2));
        assertNotEquals(true, LogicGate.nor(c3));
        assertNotEquals(true, LogicGate.nor(c4));
    }

    @Test
    public void testXnor() throws Exception
    {
        assertNotEquals(false, LogicGate.xnor(c1));
        assertNotEquals(true, LogicGate.xnor(c2));
        assertNotEquals(true, LogicGate.xnor(c3));
        assertNotEquals(false, LogicGate.xnor(c4));
    }

    @Test
    public void testNotb() throws Exception
    {
        assertNotEquals(c1[1], LogicGate.notb(c1));
        assertNotEquals(c2[1], LogicGate.notb(c2));
        assertNotEquals(c3[1], LogicGate.notb(c3));
        assertNotEquals(c4[1], LogicGate.notb(c4));
    }

    @Test
    public void testBimpliesa() throws Exception
    {
        assertEquals(true, LogicGate.bimpliesa(c1));
        assertEquals(false, LogicGate.bimpliesa(c2));
        assertEquals(true, LogicGate.bimpliesa(c3));
        assertEquals(true, LogicGate.bimpliesa(c4));
    }

    @Test
    public void testNota() throws Exception
    {
        assertNotEquals(c1[0], LogicGate.nota(c1));
        assertNotEquals(c2[0], LogicGate.nota(c2));
        assertNotEquals(c3[0], LogicGate.nota(c3));
        assertNotEquals(c4[0], LogicGate.nota(c4));
    }

    @Test
    public void testAimpliesb() throws Exception
    {
        assertEquals(true, LogicGate.aimpliesb(c1));
        assertEquals(true, LogicGate.aimpliesb(c2));
        assertEquals(false, LogicGate.aimpliesb(c3));
        assertEquals(true, LogicGate.aimpliesb(c4));
    }

    @Test
    public void testNand() throws Exception
    {
        assertNotEquals(false, LogicGate.nand(c1));
        assertNotEquals(false, LogicGate.nand(c2));
        assertNotEquals(false, LogicGate.nand(c3));
        assertNotEquals(true, LogicGate.nand(c4));
    }

    @Test
    public void t() throws Exception
    {
        assertEquals(true, LogicGate.t());
    }
}