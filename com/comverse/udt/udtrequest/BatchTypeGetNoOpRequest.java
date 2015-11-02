/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeGetNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeGetNoOpRequest extends BatchTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeGetNoOpRequest(String id, BatchTypeObjectData noOpIn) {
    super(id, "BatchTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }
/**
 *
 * Retrieves the BatchTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeObjectData getOutput() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
}
