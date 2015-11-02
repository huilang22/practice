/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferCategoryUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferCategoryUpdateNoOpRequest extends CtcOfferCategorySubRequestParent {
/**
 *
 * Constructor to create a   CtcOfferCategoryUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferCategoryUpdateNoOpRequest(String id, CtcOfferCategoryObjectData noOpIn) {
    super(id, "CtcOfferCategoryUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }
/**
 *
 * Retrieves the CtcOfferCategoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferCategoryObjectData getOutput() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
}
