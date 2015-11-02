/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryCreateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntryCreateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestErrorLogEntryCreateNoOpRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestErrorLogEntryCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntryCreateNoOpRequest(String id, BatchRequestErrorLogEntryObjectBaseData noOpIn) {
    super(id, "BatchRequestErrorLogEntryCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestErrorLogEntryObjectBaseData getOutput() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
