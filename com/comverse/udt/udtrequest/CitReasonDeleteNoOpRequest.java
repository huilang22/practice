/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CitReasonDeleteNoOpRequest Udt Request/Response
 *
 */
public class CitReasonDeleteNoOpRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a   CitReasonDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitReasonDeleteNoOpRequest(String id, CitReasonObjectData noOpIn) {
    super(id, "CitReasonDeleteNoOpRequest");
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
