/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantDefinitionGetNoOpRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionGetNoOpRequest(String id, BatchRequestParticipantDefinitionObjectData noOpIn) {
    super(id, "BatchRequestParticipantDefinitionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantDefinitionObjectData getOutput() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
