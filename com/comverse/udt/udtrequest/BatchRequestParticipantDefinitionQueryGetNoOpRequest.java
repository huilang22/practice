/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionQueryGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionQueryGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantDefinitionQueryGetNoOpRequest extends BatchRequestParticipantDefinitionRequest {
/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionQueryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionQueryGetNoOpRequest(String id, BulkParticipantQuery noOpIn) {
    super(id, "BatchRequestParticipantDefinitionQueryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParticipantDefinitionQueryGetOut", noOpIn);
    }
  }
/**
 *
 * Retrieves the BulkParticipantQuery passed into the constructor
 * @return Simulated response
 *
 */
  public BulkParticipantQuery getOutput() {
    return  (BulkParticipantQuery)outputMap.get("BatchRequestParticipantDefinitionQueryGetOut");
  }
}
