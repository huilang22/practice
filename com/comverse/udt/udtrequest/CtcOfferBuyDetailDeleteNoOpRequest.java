/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferBuyDetailDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferBuyDetailDeleteNoOpRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferBuyDetailDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferBuyDetailDeleteNoOpRequest(String id, CtcOfferBuyDetailObjectData noOpIn) {
    super(id, "CtcOfferBuyDetailDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyDetailObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
/**
 *
 * Retrieves the CtcOfferBuyDetailObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyDetailObjectData getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
