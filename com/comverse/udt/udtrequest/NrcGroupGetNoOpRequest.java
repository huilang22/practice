/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a NrcGroupGetNoOpRequest Udt Request/Response
 *
 */
public class NrcGroupGetNoOpRequest extends NrcGroupSubRequestParent {
/**
 *
 * Constructor to create a   NrcGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcGroupGetNoOpRequest(String id, NrcGroupObjectData noOpIn) {
    super(id, "NrcGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NrcGroup", NrcGroupObjectHelper.toMap(noOpIn, new HashMap(), "NrcGroup").get("NrcGroup"));
    }
  }
/**
 *
 * Retrieves the NrcGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcGroupObjectData getOutput() {
    return NrcGroupObjectHelper.fromMap(outputMap, "NrcGroup");
  }
}
