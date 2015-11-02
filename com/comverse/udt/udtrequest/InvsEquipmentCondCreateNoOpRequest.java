/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentCondCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentCondCreateNoOpRequest extends InvsEquipmentCondSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentCondCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentCondCreateNoOpRequest(String id, InvsEquipmentCondObjectData noOpIn) {
    super(id, "InvsEquipmentCondCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }
/**
 *
 * Retrieves the InvsEquipmentCondObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentCondObjectData getOutput() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
}
