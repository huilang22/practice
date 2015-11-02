/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonCreateNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitReasonCreateNoOpRequest Udt Request/Response
 *
 */
public class CitReasonCreateNoOpRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a   CitReasonCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitReasonCreateNoOpRequest(String id, CitReasonObjectData noOpIn) {
    super(id, "CitReasonCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(noOpIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }
/**
 *
 * Retrieves the CitReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitReasonObjectData getOutput() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
}
