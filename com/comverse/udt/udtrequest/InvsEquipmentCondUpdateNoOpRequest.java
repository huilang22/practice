/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentCondUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentCondUpdateNoOpRequest extends InvsEquipmentCondSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentCondUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentCondUpdateNoOpRequest(String id, InvsEquipmentCondObjectData noOpIn) {
    super(id, "InvsEquipmentCondUpdateNoOpRequest");
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
