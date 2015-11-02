/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a CitChannelSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class CitChannelSequenceGetNoOpRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a   CitChannelSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitChannelSequenceGetNoOpRequest(String id, CitChannelObjectKeyData noOpIn) {
    super(id, "CitChannelSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
/**
 *
 * Retrieves the CitChannelObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public CitChannelObjectKeyData getOutput() {
    return CitChannelObjectKeyHelper.fromMap(outputMap, "CitChannel");
  }
}
