/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferDetailGetNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferDetailGetNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferDetailGetNoOpRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferDetailGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferDetailGetNoOpRequest(String id, CtcOfferDetailObjectData noOpIn) {
    super(id, "CtcOfferDetailGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOffer", CtcOfferDetailObjectHelper.toMap(noOpIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
/**
 *
 * Retrieves the CtcOfferDetailObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferDetailObjectData getOutput() {
    return CtcOfferDetailObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
