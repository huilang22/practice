/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a CitReasonSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class CitReasonSequenceGetNoOpRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a   CitReasonSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitReasonSequenceGetNoOpRequest(String id, CitReasonObjectKeyData noOpIn) {
    super(id, "CitReasonSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }
/**
 *
 * Retrieves the CitReasonObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public CitReasonObjectKeyData getOutput() {
    return CitReasonObjectKeyHelper.fromMap(outputMap, "CitReason");
  }
}
