/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataGetNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOfferExtendedDataGetNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferExtendedDataGetNoOpRequest extends CtcOfferExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferExtendedDataGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferExtendedDataGetNoOpRequest(String id, CtcOfferExtendedDataObjectData noOpIn) {
    super(id, "CtcOfferExtendedDataGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
/**
 *
 * Retrieves the CtcOfferExtendedDataObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferExtendedDataObjectData getOutput() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
}
