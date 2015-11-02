/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeStageGetNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeStageGetNoOpRequest extends BatchTypeStageSubRequestParent {
/**
 *
 * Constructor to create a   BatchTypeStageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeStageGetNoOpRequest(String id, BatchTypeStageObjectData noOpIn) {
    super(id, "BatchTypeStageGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(noOpIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
/**
 *
 * Retrieves the BatchTypeStageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeStageObjectData getOutput() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
