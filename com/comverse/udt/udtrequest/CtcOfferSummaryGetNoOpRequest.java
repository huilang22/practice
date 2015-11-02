/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferSummaryGetNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferSummaryGetNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferSummaryGetNoOpRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferSummaryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferSummaryGetNoOpRequest(String id, CtcOfferSummaryObjectData noOpIn) {
    super(id, "CtcOfferSummaryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOffer", CtcOfferSummaryObjectHelper.toMap(noOpIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
/**
 *
 * Retrieves the CtcOfferSummaryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferSummaryObjectData getOutput() {
    return CtcOfferSummaryObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
