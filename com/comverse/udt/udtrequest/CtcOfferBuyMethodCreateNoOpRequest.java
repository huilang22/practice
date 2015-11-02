/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferBuyMethodCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferBuyMethodCreateNoOpRequest extends CtcOfferBuyMethodSubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferBuyMethodCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferBuyMethodCreateNoOpRequest(String id, CtcOfferBuyMethodObjectData noOpIn) {
    super(id, "CtcOfferBuyMethodCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }
/**
 *
 * Retrieves the CtcOfferBuyMethodObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyMethodObjectData getOutput() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
}
