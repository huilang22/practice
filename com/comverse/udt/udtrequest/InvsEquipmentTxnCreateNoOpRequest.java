/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentTxnCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentTxnCreateNoOpRequest extends InvsEquipmentTxnSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentTxnCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentTxnCreateNoOpRequest(String id, InvsEquipmentTxnObjectData noOpIn) {
    super(id, "InvsEquipmentTxnCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }
/**
 *
 * Retrieves the InvsEquipmentTxnObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnObjectData getOutput() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
}
