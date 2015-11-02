/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyUpdateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DependencyUpdateNoOpRequest Udt Request/Response
 *
 */
public class DependencyUpdateNoOpRequest extends DependencySubRequestParent {
/**
 *
 * Constructor to create a   DependencyUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DependencyUpdateNoOpRequest(String id, DependencyObjectData noOpIn) {
    super(id, "DependencyUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(noOpIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }
/**
 *
 * Retrieves the DependencyObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyObjectData getOutput() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
  }
}
