/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferBuyUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferBuyUpdateNoOpRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferBuyUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferBuyUpdateNoOpRequest(String id, CtcOfferBuyObjectData noOpIn) {
    super(id, "CtcOfferBuyUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
/**
 *
 * Retrieves the CtcOfferBuyObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyObjectData getOutput() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
