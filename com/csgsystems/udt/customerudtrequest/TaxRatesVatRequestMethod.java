/*
 * Generated code DO NOT EDIT
 * Generated file: TaxRatesVatRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TaxRatesVatRequestMethod implements UdtMethod {
  private String method = null;
  private TaxRatesVatRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TaxRatesVatFind method */
  public static final TaxRatesVatRequestMethod TAX_RATES_VAT_FIND = new TaxRatesVatRequestMethod("TaxRatesVatFind");
  /** Variable representing the TaxRatesVatGet method */
  public static final TaxRatesVatRequestMethod TAX_RATES_VAT_GET = new TaxRatesVatRequestMethod("TaxRatesVatGet");
}
