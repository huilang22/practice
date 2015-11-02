/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupUpdateNoOpRequest.java
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
 * NoOp class used to simulate a NrcTypeGroupUpdateNoOpRequest Udt Request/Response
 *
 */
public class NrcTypeGroupUpdateNoOpRequest extends NrcTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a   NrcTypeGroupUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTypeGroupUpdateNoOpRequest(String id, NrcTypeGroupObjectData noOpIn) {
    super(id, "NrcTypeGroupUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(noOpIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }
/**
 *
 * Retrieves the NrcTypeGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTypeGroupObjectData getOutput() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
}
