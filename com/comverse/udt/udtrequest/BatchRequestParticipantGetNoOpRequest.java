/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantGetNoOpRequest extends BatchRequestParticipantSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParticipantGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantGetNoOpRequest(String id, BatchRequestParticipantObjectData noOpIn) {
    super(id, "BatchRequestParticipantGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
/**
 *
 * Retrieves the BatchRequestParticipantObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantObjectData getOutput() {
    return BatchRequestParticipantObjectHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
}
