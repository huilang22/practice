/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorCreateNoOpRequest.java
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
 * NoOp class used to simulate a SupervisorCreateNoOpRequest Udt Request/Response
 *
 */
public class SupervisorCreateNoOpRequest extends SupervisorSubRequestParent {
/**
 *
 * Constructor to create a   SupervisorCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SupervisorCreateNoOpRequest(String id, SupervisorObjectData noOpIn) {
    super(id, "SupervisorCreateNoOpRequest");
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
