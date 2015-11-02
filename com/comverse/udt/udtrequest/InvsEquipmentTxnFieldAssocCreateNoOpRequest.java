/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentTxnFieldAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentTxnFieldAssocCreateNoOpRequest extends InvsEquipmentTxnFieldAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentTxnFieldAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentTxnFieldAssocCreateNoOpRequest(String id, InvsEquipmentTxnFieldAssocObjectData noOpIn) {
    super(id, "InvsEquipmentTxnFieldAssocCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
/**
 *
 * Retrieves the InvsEquipmentTxnFieldAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnFieldAssocObjectData getOutput() {
    return InvsEquipmentTxnFieldAssocObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
