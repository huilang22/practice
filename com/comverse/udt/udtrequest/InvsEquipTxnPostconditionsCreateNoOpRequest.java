/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipTxnPostconditionsCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipTxnPostconditionsCreateNoOpRequest extends InvsEquipTxnPostconditionsSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipTxnPostconditionsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipTxnPostconditionsCreateNoOpRequest(String id, InvsEquipTxnPostconditionsObjectData noOpIn) {
    super(id, "InvsEquipTxnPostconditionsCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
/**
 *
 * Retrieves the InvsEquipTxnPostconditionsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPostconditionsObjectData getOutput() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
}
