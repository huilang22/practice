/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentTxnFieldAssocGetNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentTxnFieldAssocGetNoOpRequest extends InvsEquipmentTxnFieldAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentTxnFieldAssocGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentTxnFieldAssocGetNoOpRequest(String id, InvsEquipmentTxnFieldTablesObjectData noOpIn) {
    super(id, "InvsEquipmentTxnFieldAssocGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
/**
 *
 * Retrieves the InvsEquipmentTxnFieldTablesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnFieldTablesObjectData getOutput() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
