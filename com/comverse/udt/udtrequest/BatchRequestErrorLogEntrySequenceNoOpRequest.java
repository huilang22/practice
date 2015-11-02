/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntrySequenceNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntrySequenceNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestErrorLogEntrySequenceNoOpRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestErrorLogEntrySequenceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntrySequenceNoOpRequest(String id, BatchRequestErrorLogEntryObjectBaseKeyData noOpIn) {
    super(id, "BatchRequestErrorLogEntrySequenceNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestErrorLogEntryObjectBaseKeyData getOutput() {
    return BatchRequestErrorLogEntryObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
