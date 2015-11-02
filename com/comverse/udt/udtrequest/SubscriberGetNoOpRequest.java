/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SubscriberGetNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a SubscriberGetNoOpRequest Udt Request/Response
 *
 */
public class SubscriberGetNoOpRequest extends PolicyInstanceSubRequestParent {
/**
 *
 * Constructor to create a   SubscriberGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SubscriberGetNoOpRequest(String id, SubscriberObjectData noOpIn) {
    super(id, "SubscriberGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PolicyInstance", SubscriberObjectHelper.toMap(noOpIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
/**
 *
 * Retrieves the SubscriberObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SubscriberObjectData getOutput() {
    return SubscriberObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
}
