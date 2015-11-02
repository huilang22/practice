/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionCreateNoOpRequest.java
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
 * NoOp class used to simulate a CitInteractionCreateNoOpRequest Udt Request/Response
 *
 */
public class CitInteractionCreateNoOpRequest extends CitInteractionSubRequestParent {
/**
 *
 * Constructor to create a   CitInteractionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitInteractionCreateNoOpRequest(String id, CitInteractionObjectData noOpIn) {
    super(id, "CitInteractionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(noOpIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
/**
 *
 * Retrieves the CitInteractionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitInteractionObjectData getOutput() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
}
