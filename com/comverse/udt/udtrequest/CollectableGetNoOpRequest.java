/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectableGetNoOpRequest.java
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
 * NoOp class used to simulate a CollectableGetNoOpRequest Udt Request/Response
 *
 */
public class CollectableGetNoOpRequest extends CollectableSubRequestParent {
/**
 *
 * Constructor to create a   CollectableGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CollectableGetNoOpRequest(String id, CollectableObjectData noOpIn) {
    super(id, "CollectableGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Collectable", CollectableObjectHelper.toMap(noOpIn, new HashMap(), "Collectable").get("Collectable"));
    }
  }
/**
 *
 * Retrieves the CollectableObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CollectableObjectData getOutput() {
    return CollectableObjectHelper.fromMap(outputMap, "Collectable");
  }
}
