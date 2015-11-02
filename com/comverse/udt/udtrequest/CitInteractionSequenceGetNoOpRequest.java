/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a CitInteractionSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class CitInteractionSequenceGetNoOpRequest extends CitInteractionSubRequestParent {
/**
 *
 * Constructor to create a   CitInteractionSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitInteractionSequenceGetNoOpRequest(String id, CitInteractionObjectKeyData noOpIn) {
    super(id, "CitInteractionSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
/**
 *
 * Retrieves the CitInteractionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public CitInteractionObjectKeyData getOutput() {
    return CitInteractionObjectKeyHelper.fromMap(outputMap, "CitInteraction");
  }
}
