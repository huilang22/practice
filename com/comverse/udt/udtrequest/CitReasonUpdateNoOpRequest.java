/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CitReasonUpdateNoOpRequest Udt Request/Response
 *
 */
public class CitReasonUpdateNoOpRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a   CitReasonUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitReasonUpdateNoOpRequest(String id, CitReasonObjectData noOpIn) {
    super(id, "CitReasonUpdateNoOpRequest");
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
