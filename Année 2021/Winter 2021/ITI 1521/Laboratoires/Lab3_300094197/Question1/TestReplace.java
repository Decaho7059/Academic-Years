package com.Labo3_ITI;

import org.junit.*;
public class TestReplace {
    //public static void main(String[] args){

    @Test
    public void testInIsNull(){
        String[] same = {"I"};
        String[] displace = {"You"};
        Assert.assertNull(Use.replace(null, same, displace));
    }

    @Test
    public void testSameIsNull(){
        String[] first = {"I", "know"};
        String[] displace = {"You"};
        Assert.assertNull(Use.replace(first, null, displace));
    }

    @Test
    public void testDisplaceIsNull(){
        String[] first = {"I", "know"};
        String[] same = {"I"};
        Assert.assertNull(Use.replace(first, same, null));
    }
    @Test
    public void testInAndSameAreNull(){
        String[] displace = {"You"};
        Assert.assertNull(Use.replace(null, null, displace));
    }
    @Test
    public void testInAndDisplaceAreNull(){
        String[] same = {"I"};
        Assert.assertNull(Use.replace(null, same, null));
    }
    @Test
    public void testSameAndDisplaceAreNull(){
        String[] text = {"I", "know"};
        Assert.assertNull(Use.replace(text, null, null));
    }
    @Test
    public void testAllNull(){
        Assert.assertNull(Use.replace(null, null, null));
    }
    @Test
    public void testNotSameLength(){
        String[] first = {"I", "know"};
        String[] same = {"I"};
        String[] displace ={"You", "They"};
        Assert.assertNull(Use.replace(first, same, displace));
    }
    @Test
    public void testNullInIn(){
        String[] first = {"I", null};
        String[] same = {"I"};
        String[] displace = {"You"};
        Assert.assertNull(Use.replace(first, same, displace));
    }
    @Test
    public void testNullInSame(){
        String[] first = {"I", "know"};
        String[] same = {"I", null};
        String[] displace = {"You", "They"};
        Assert.assertNull(Use.replace(first, same, displace));
    }
    @Test
    public void testNullInDisplace() {
    String[] first = {"I", "know"};
    String[] same = {"I", "We"};
    String[] displace = {null, "They"};
    Assert.assertNull(Use.replace(first, same, displace));
    }
    @Test
    public void testNoChange() {
    String[] first = {"I", "know"};
    String[] same = {"You"};
    String[] displace = {"I"};
    String[] result = Use.replace(first, same, displace);
    Assert.assertNotNull(result);
    Assert.assertFalse(first == result);
    Assert.assertTrue(first.length == result.length);
    for (int i=0; i< first.length; i++) {
        Assert.assertEquals(first[i], result[i]);
    }
    }
    @Test
    public void testChange() {
    String[] first = {"I", "know"};
    String[] same = {new String("know")};
    String[] displace = {"see"};
    String[] expected = {"I", "see"};
    String[] result = Use.replace(first, same, displace);
    Assert.assertNotNull(result);
    Assert.assertFalse(first == result);
    Assert.assertTrue(first.length == result.length);
    for (int i=0; i< first.length; i++) {
        Assert.assertEquals(expected[i], result[i]);
    }
    }
}

