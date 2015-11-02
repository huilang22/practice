/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeStageSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeStageSequenceGetNoOpRequest extends BatchTypeStageSubRequestParent {
/**
 *
 * Constructor to create a   BatchTypeStageSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeStageSequenceGetNoOpRequest(String id, BatchTypeStageObjectKeyData noOpIn) {
    super(id, "BatchTypeStageSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
/**
 *
 * Retrieves the BatchTypeStageObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeStageObjectKeyData getOutput() {
    return BatchTypeStageObjectKeyHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
