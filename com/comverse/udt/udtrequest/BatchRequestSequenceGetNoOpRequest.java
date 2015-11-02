/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSequenceGetNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestSequenceGetNoOpRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestSequenceGetNoOpRequest(String id, BatchRequestObjectKeyData noOpIn) {
    super(id, "BatchRequestSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
/**
 *
 * Retrieves the BatchRequestObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectKeyData getOutput() {
    return BatchRequestObjectKeyHelper.fromMap(outputMap, "BatchRequest");
  }
}
