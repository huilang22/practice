/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentTxnUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentTxnUpdateNoOpRequest extends InvsEquipmentTxnSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentTxnUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentTxnUpdateNoOpRequest(String id, InvsEquipmentTxnObjectData noOpIn) {
    super(id, "InvsEquipmentTxnUpdateNoOpRequest");
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
