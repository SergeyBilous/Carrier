package com.odinbilet.carrier;

import com.odinbilet.carrier.client.CarrierTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class CarrierSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for Carrier");
    suite.addTestSuite(CarrierTest.class);
    return suite;
  }
}
