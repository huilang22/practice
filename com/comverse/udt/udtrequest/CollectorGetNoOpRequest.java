/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorGetNoOpRequest.java
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

import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a CollectorGetNoOpRequest Udt Request/Response
 *
 */
public class CollectorGetNoOpRequest extends CollectorSubRequestParent {
/**
 *
 * Constructor to create a   CollectorGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CollectorGetNoOpRequest(String id, CollectorObjectData noOpIn) {
    super(id, "CollectorGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Collector", CollectorObjectHelper.toMap(noOpIn, new HashMap(), "Collector").get("Collector"));
    }
  }
/**
 *
 * Retrieves the CollectorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CollectorObjectData getOutput() {
    return CollectorObjectHelper.fromMap(outputMap, "Collector");
  }
}
