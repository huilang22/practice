/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferBuyDetailCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferBuyDetailCreateNoOpRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferBuyDetailCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferBuyDetailCreateNoOpRequest(String id, CtcOfferBuyDetailObjectData noOpIn) {
    super(id, "CtcOfferBuyDetailCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CreateDetailOut", CtcOfferBuyDetailObjectHelper.toMap(noOpIn, new HashMap(), "CreateDetailOut").get("CreateDetailOut"));
    }
  }
/**
 *
 * Retrieves the CtcOfferBuyDetailObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyDetailObjectData getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CreateDetailOut");
  }
}
