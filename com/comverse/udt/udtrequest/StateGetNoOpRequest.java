/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateGetNoOpRequest.java
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
 * NoOp class used to simulate a StateGetNoOpRequest Udt Request/Response
 *
 */
public class StateGetNoOpRequest extends StateSubRequestParent {
/**
 *
 * Constructor to create a   StateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StateGetNoOpRequest(String id, StateObjectData noOpIn) {
    super(id, "StateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("State", StateObjectHelper.toMap(noOpIn, new HashMap(), "State").get("State"));
    }
  }
/**
 *
 * Retrieves the StateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public StateObjectData getOutput() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
}
