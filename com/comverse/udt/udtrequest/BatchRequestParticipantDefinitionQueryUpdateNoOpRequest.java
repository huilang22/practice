/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionQueryUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionQueryUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantDefinitionQueryUpdateNoOpRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionQueryUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionQueryUpdateNoOpRequest(String id, BatchRequestParticipantDefinitionObjectKeyData noOpIn) {
    super(id, "BatchRequestParticipantDefinitionQueryUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantDefinitionObjectKeyData getOutput() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
