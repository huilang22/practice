/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntryGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestErrorLogEntryGetNoOpRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestErrorLogEntryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntryGetNoOpRequest(String id, BatchRequestErrorLogEntryObjectData noOpIn) {
    super(id, "BatchRequestErrorLogEntryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestErrorLogEntryObjectData getOutput() {
    return BatchRequestErrorLogEntryObjectHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
