/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberGetNoOpRequest.java
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
 * NoOp class used to simulate a MIHSubscriberGetNoOpRequest Udt Request/Response
 *
 */
public class MIHSubscriberGetNoOpRequest extends MIHSubscriberSubRequestParent {
/**
 *
 * Constructor to create a   MIHSubscriberGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MIHSubscriberGetNoOpRequest(String id, MIHSubscriberGetOutputData noOpIn) {
    super(id, "MIHSubscriberGetNoOpRequest");
    if (noOpIn != null) {
      addInput("MIHSubscriberGetOutputData", MIHSubscriberGetOutputHelper.toMap(noOpIn).get("MIHSubscriberGetOutputData"));
    }
  }
/**
 *
 * Retrieves the MIHSubscriberGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public MIHSubscriberGetOutputData getOutput() {
    return MIHSubscriberGetOutputHelper.fromMap(outputMap);
  }
}
