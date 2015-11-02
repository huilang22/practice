/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDispositionSummaryNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantDispositionSummaryNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantDispositionSummaryNoOpRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParticipantDispositionSummaryNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantDispositionSummaryNoOpRequest(String id, BatchRequestParticipantDispositionSummaryOutputData noOpIn) {
    super(id, "BatchRequestParticipantDispositionSummaryNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParticipantDispositionSummaryOutputData", BatchRequestParticipantDispositionSummaryOutputHelper.toMap(noOpIn).get("BatchRequestParticipantDispositionSummaryOutputData"));
    }
  }
/**
 *
 * Retrieves the BatchRequestParticipantDispositionSummaryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantDispositionSummaryOutputData getOutput() {
    return BatchRequestParticipantDispositionSummaryOutputHelper.fromMap(outputMap);
  }
}
