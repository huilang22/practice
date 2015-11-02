/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class CitTaskSequenceGetNoOpRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a   CitTaskSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskSequenceGetNoOpRequest(String id, CitTaskObjectBaseKeyData noOpIn) {
    super(id, "CitTaskSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }
/**
 *
 * Retrieves the CitTaskObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectBaseKeyData getOutput() {
    return CitTaskObjectBaseKeyHelper.fromMap(outputMap, "CitTask");
  }
}
