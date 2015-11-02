/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryCreateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryCreateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestActivityLogEntryCreateNoOpRequest extends BatchRequestActivityLogEntrySubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryCreateNoOpRequest(String id, BatchRequestActivityLogEntryObjectBaseData noOpIn) {
    super(id, "BatchRequestActivityLogEntryCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestActivityLogEntryObjectBaseData getOutput() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
}
