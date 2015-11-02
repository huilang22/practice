/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestExecuteLogEntryUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestExecuteLogEntryUpdateNoOpRequest extends BatchRequestExecuteLogEntrySubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestExecuteLogEntryUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestExecuteLogEntryUpdateNoOpRequest(String id, BatchRequestExecuteLogEntryObjectData noOpIn) {
    super(id, "BatchRequestExecuteLogEntryUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }
/**
 *
 * Retrieves the BatchRequestExecuteLogEntryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestExecuteLogEntryObjectData getOutput() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
}
