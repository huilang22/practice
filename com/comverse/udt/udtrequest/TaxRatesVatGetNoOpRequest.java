/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatGetNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TaxRatesVatGetNoOpRequest Udt Request/Response
 *
 */
public class TaxRatesVatGetNoOpRequest extends TaxRatesVatSubRequestParent {
/**
 *
 * Constructor to create a   TaxRatesVatGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxRatesVatGetNoOpRequest(String id, TaxRatesVatObjectData noOpIn) {
    super(id, "TaxRatesVatGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxRatesVat", TaxRatesVatObjectHelper.toMap(noOpIn, new HashMap(), "TaxRatesVat").get("TaxRatesVat"));
    }
  }
/**
 *
 * Retrieves the TaxRatesVatObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TaxRatesVatObjectData getOutput() {
    return TaxRatesVatObjectHelper.fromMap(outputMap, "TaxRatesVat");
  }
}
