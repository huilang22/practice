/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BoundaryGetNoOpRequest.java
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

import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a BoundaryGetNoOpRequest Udt Request/Response
 *
 */
public class BoundaryGetNoOpRequest extends BoundarySubRequestParent {
/**
 *
 * Constructor to create a   BoundaryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BoundaryGetNoOpRequest(String id, BoundaryObjectData noOpIn) {
    super(id, "BoundaryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Boundary", BoundaryObjectHelper.toMap(noOpIn, new HashMap(), "Boundary").get("Boundary"));
    }
  }
/**
 *
 * Retrieves the BoundaryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BoundaryObjectData getOutput() {
    return BoundaryObjectHelper.fromMap(outputMap, "Boundary");
  }
}
