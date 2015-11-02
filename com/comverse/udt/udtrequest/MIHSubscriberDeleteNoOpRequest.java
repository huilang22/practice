/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberDeleteNoOpRequest.java
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
 * NoOp class used to simulate a MIHSubscriberDeleteNoOpRequest Udt Request/Response
 *
 */
public class MIHSubscriberDeleteNoOpRequest extends MIHSubscriberRequest {
/**
 *
 * Constructor to create a   MIHSubscriberDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MIHSubscriberDeleteNoOpRequest(String id, Integer noOpIn) {
    super(id, "MIHSubscriberDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("Output", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("Output");
  }
}
