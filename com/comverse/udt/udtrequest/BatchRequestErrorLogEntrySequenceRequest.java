/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntrySequenceRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchRequestErrorLogEntrySequenceRequest Udt Request
 *
 */

public class BatchRequestErrorLogEntrySequenceRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntrySequenceRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchRequestErrorLogEntrySequenceRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchRequestErrorLogEntrySequence");
  }

/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectBaseKeyData that results from the BatchRequestErrorLogEntrySequenceRequest call
 * @return BatchRequestErrorLogEntryObjectBaseKeyData resulting from udt call
 *
 */

  public BatchRequestErrorLogEntryObjectBaseKeyData getOutput() {
    return BatchRequestErrorLogEntryObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
