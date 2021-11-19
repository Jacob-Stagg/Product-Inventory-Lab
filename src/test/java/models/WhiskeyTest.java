package models;

import org.junit.Assert;
import org.junit.Test;

public class WhiskeyTest {
    @Test // (1)
    public void constructorTest(){

        // (2)
        Whiskey drink = new Whiskey(6, "Stan Smith", "Jack Daniel's", 9, 10, 80.00f);
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Jack Daniel's";
        int expectedSize = 9;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Whiskey testSneaker = new Whiskey(expectedId, expectedName, expectedBrand, expectedSize,
                expectedQty, expectedPrice);

        // (4)
        Assert.assertEquals(expectedId, testSneaker.getId());
        Assert.assertEquals(expectedName, testSneaker.getName());
        Assert.assertEquals(expectedBrand, testSneaker.getBrand());
        Assert.assertEquals(expectedSize, testSneaker.getSize());
        Assert.assertEquals(expectedQty, testSneaker.getQty());
        Assert.assertEquals(expectedPrice, testSneaker.getPrice(), 0);
    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Stan Smith";

        // when (2)
        Whiskey drink = new Whiskey(6, "Stan Smith", "Jack Daniel's", 9, 10, 80.00f);
        drink.setName(expected);

        // then (3)
        Assert.assertEquals(expected, drink.getName());
    }

    @Test
    public void setIdTest() {
        // given (1)
        int expected = 6;

        // when (2)
        Whiskey drink = new Whiskey(6, "Stan Smith", "Jack Daniel's", 9, 10, 80.00f);
        drink.setId(expected);

        // then (3)
        Assert.assertEquals(expected, drink.getId());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Jack Daniel's";

        // when (2)
        Whiskey drink = new Whiskey(6, "Stan Smith", "Jack Daniel's", 9, 10, 80.00f);
        drink.setBrand(expected);

        // then (3)
        Assert.assertEquals(expected, drink.getBrand());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 9;

        // when (2)
        Whiskey drink = new Whiskey(6, "Stan Smith", "Jack Daniel's", 9, 10, 80.00f);
        drink.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, drink.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 10;

        // when (2)
        Whiskey drink = new Whiskey(6, "Stan Smith", "Jack Daniel's", 9, 10, 80.00f);
        drink.setQty(expected);

        // then (3)
        Assert.assertEquals(expected, drink.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 80.00f;

        // when (2)
        Whiskey drink = new Whiskey(6, "Stan Smith", "Jack Daniel's", 9, 10, 80.00f);
        drink.setPrice(expected);

        // then (3)
        Assert.assertEquals(expected, drink.getPrice(), 0);
    }
}
