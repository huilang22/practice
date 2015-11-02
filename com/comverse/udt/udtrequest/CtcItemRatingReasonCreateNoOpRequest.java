/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemRatingReasonCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcItemRatingReasonCreateNoOpRequest extends CtcItemRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemRatingReasonCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemRatingReasonCreateNoOpRequest(String id, CtcItemRatingReasonObjectData noOpIn) {
    super(id, "CtcItemRatingReasonCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }
/**
 *
 * Retrieves the CtcItemRatingReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingReasonObjectData getOutput() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
}
