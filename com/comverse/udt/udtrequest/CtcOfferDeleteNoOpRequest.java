/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferDeleteNoOpRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferDeleteNoOpRequest(String id, CtcOfferObjectData noOpIn) {
    super(id, "CtcOfferDeleteNoOpRequest");
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
