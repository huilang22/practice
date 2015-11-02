/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestActivityLogEntryGetNoOpRequest extends BatchRequestActivityLogEntrySubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryGetNoOpRequest(String id, BatchRequestActivityLogEntryObjectData noOpIn) {
    super(id, "BatchRequestActivityLogEntryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestActivityLogEntryObjectData getOutput() {
    return BatchRequestActivityLogEntryObjectHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
}
