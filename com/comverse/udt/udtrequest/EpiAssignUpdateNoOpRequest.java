/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignUpdateNoOpRequest.java
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
 * NoOp class used to simulate a EpiAssignUpdateNoOpRequest Udt Request/Response
 *
 */
public class EpiAssignUpdateNoOpRequest extends EpiAssignSubRequestParent {
/**
 *
 * Constructor to create a   EpiAssignUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EpiAssignUpdateNoOpRequest(String id, EpiAssignObjectData noOpIn) {
    super(id, "EpiAssignUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(noOpIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }
/**
 *
 * Retrieves the EpiAssignObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EpiAssignObjectData getOutput() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
}
