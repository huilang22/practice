/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionRetrieveNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionRetrieveNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantDefinitionRetrieveNoOpRequest extends BatchRequestParticipantDefinitionRequest {
/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionRetrieveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionRetrieveNoOpRequest(String id, Object noOpIn) {
    super(id, "BatchRequestParticipantDefinitionRetrieveNoOpRequest");
    if (noOpIn != null) {
      addInput("Participants", noOpIn);
    }
  }
/**
 *
 * Retrieves the Object passed into the constructor
 * @return Simulated response
 *
 */
  public Object getOutput() {
    return  (Object)outputMap.get("Participants");
  }
}
