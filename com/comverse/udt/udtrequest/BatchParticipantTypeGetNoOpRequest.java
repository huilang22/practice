/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchParticipantTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchParticipantTypeGetNoOpRequest Udt Request/Response
 *
 */
public class BatchParticipantTypeGetNoOpRequest extends BatchParticipantTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchParticipantTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchParticipantTypeGetNoOpRequest(String id, BatchParticipantTypeObjectData noOpIn) {
    super(id, "BatchParticipantTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchParticipantType", BatchParticipantTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchParticipantType").get("BatchParticipantType"));
    }
  }
/**
 *
 * Retrieves the BatchParticipantTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchParticipantTypeObjectData getOutput() {
    return BatchParticipantTypeObjectHelper.fromMap(outputMap, "BatchParticipantType");
  }
}
