/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtcRatingReasonUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcRatingReasonUpdateNoOpRequest extends CtcRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a   CtcRatingReasonUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcRatingReasonUpdateNoOpRequest(String id, CtcRatingReasonObjectData noOpIn) {
    super(id, "CtcRatingReasonUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(noOpIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }
/**
 *
 * Retrieves the CtcRatingReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingReasonObjectData getOutput() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
}
