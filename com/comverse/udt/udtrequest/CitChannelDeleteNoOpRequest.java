/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CitChannelDeleteNoOpRequest Udt Request/Response
 *
 */
public class CitChannelDeleteNoOpRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a   CitChannelDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitChannelDeleteNoOpRequest(String id, CitChannelObjectData noOpIn) {
    super(id, "CitChannelDeleteNoOpRequest");
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
