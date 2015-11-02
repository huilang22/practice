/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelUpdateNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitChannelUpdateNoOpRequest Udt Request/Response
 *
 */
public class CitChannelUpdateNoOpRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a   CitChannelUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitChannelUpdateNoOpRequest(String id, CitChannelObjectData noOpIn) {
    super(id, "CitChannelUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(noOpIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
/**
 *
 * Retrieves the CitChannelObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitChannelObjectData getOutput() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
}
