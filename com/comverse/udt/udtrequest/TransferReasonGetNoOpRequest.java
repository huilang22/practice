/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TransferReasonGetNoOpRequest Udt Request/Response
 *
 */
public class TransferReasonGetNoOpRequest extends TransferReasonSubRequestParent {
/**
 *
 * Constructor to create a   TransferReasonGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TransferReasonGetNoOpRequest(String id, TransferReasonObjectData noOpIn) {
    super(id, "TransferReasonGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(noOpIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }
/**
 *
 * Retrieves the TransferReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TransferReasonObjectData getOutput() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
}
