/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferUpdateNoOpRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferUpdateNoOpRequest(String id, CtcOfferObjectData noOpIn) {
    super(id, "CtcOfferUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(noOpIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
/**
 *
 * Retrieves the CtcOfferObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferObjectData getOutput() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
