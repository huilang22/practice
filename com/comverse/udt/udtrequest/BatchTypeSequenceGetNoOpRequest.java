/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeSequenceGetNoOpRequest extends BatchTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchTypeSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeSequenceGetNoOpRequest(String id, BatchTypeObjectKeyData noOpIn) {
    super(id, "BatchTypeSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }
/**
 *
 * Retrieves the BatchTypeObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeObjectKeyData getOutput() {
    return BatchTypeObjectKeyHelper.fromMap(outputMap, "BatchType");
  }
}
