/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantUpdateNoOpRequest extends BatchRequestParticipantSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParticipantUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantUpdateNoOpRequest(String id, BatchRequestParticipantObjectBaseData noOpIn) {
    super(id, "BatchRequestParticipantUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
/**
 *
 * Retrieves the BatchRequestParticipantObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantObjectBaseData getOutput() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
}
