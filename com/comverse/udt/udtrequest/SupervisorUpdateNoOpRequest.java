/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorUpdateNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a SupervisorUpdateNoOpRequest Udt Request/Response
 *
 */
public class SupervisorUpdateNoOpRequest extends SupervisorSubRequestParent {
/**
 *
 * Constructor to create a   SupervisorUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SupervisorUpdateNoOpRequest(String id, SupervisorObjectData noOpIn) {
    super(id, "SupervisorUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(noOpIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }
/**
 *
 * Retrieves the SupervisorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SupervisorObjectData getOutput() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
}
