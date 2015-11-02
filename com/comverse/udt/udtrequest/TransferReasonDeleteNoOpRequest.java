/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonDeleteNoOpRequest.java
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
 * NoOp class used to simulate a TransferReasonDeleteNoOpRequest Udt Request/Response
 *
 */
public class TransferReasonDeleteNoOpRequest extends TransferReasonSubRequestParent {
/**
 *
 * Constructor to create a   TransferReasonDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TransferReasonDeleteNoOpRequest(String id, TransferReasonObjectData noOpIn) {
    super(id, "TransferReasonDeleteNoOpRequest");
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
