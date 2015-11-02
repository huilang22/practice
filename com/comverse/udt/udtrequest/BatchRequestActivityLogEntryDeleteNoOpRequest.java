/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestActivityLogEntryDeleteNoOpRequest extends BatchRequestActivityLogEntrySubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryDeleteNoOpRequest(String id, BatchRequestActivityLogEntryObjectBaseData noOpIn) {
    super(id, "BatchRequestActivityLogEntryDeleteNoOpRequest");
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
