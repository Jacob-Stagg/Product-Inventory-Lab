package models;

import org.junit.Assert;
import org.junit.Test;

public class SneakerTest {
    @Test // (1)
    public void constructorTest(){

        // (2)
        Sneaker sweetAdidas = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 9;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize,
                expectedQty, expectedPrice);

        // (4)
        Assert.assertEquals(expectedId, testSneaker.getId());
        Assert.assertEquals(expectedName, testSneaker.getName());
        Assert.assertEquals(expectedBrand, testSneaker.getBrand());
        Assert.assertEquals(expectedSize, testSneaker.getSize());
        Assert.assertEquals(expectedSport, testSneaker.getSport());
        Assert.assertEquals(expectedQty, testSneaker.getQty());
        Assert.assertEquals(expectedPrice, testSneaker.getPrice(), 0);
    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Stan Smith";

        // when (2)
        Sneaker testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        testSneaker.setName(expected);

        // then (3)
        Assert.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setIdTest() {
        // given (1)
        int expected = 6;

        // when (2)
        Sneaker testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        testSneaker.setId(expected);

        // then (3)
        Assert.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Adidas";

        // when (2)
        Sneaker testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        testSneaker.setBrand(expected);

        // then (3)
        Assert.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Tennis";

        // when (2)
        Sneaker testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        testSneaker.setSport(expected);

        // then (3)
        Assert.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 9;

        // when (2)
        Sneaker testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        testSneaker.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 10;

        // when (2)
        Sneaker testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        testSneaker.setQty(expected);

        // then (3)
        Assert.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 80.00f;

        // when (2)
        Sneaker testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 9, 10, 80.00f);
        testSneaker.setPrice(expected);

        // then (3)
        Assert.assertEquals(expected, testSneaker.getPrice(), 0);
    }
}
