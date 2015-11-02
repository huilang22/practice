/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsEquipTxnPreconditionsCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipTxnPreconditionsCreateNoOpRequest extends InvsEquipTxnPreconditionsSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipTxnPreconditionsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipTxnPreconditionsCreateNoOpRequest(String id, InvsEquipTxnPreconditionsObjectData noOpIn) {
    super(id, "InvsEquipTxnPreconditionsCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }
/**
 *
 * Retrieves the InvsEquipTxnPreconditionsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPreconditionsObjectData getOutput() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
}
