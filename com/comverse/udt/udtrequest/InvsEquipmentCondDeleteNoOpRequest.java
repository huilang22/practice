/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondDeleteNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentCondDeleteNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentCondDeleteNoOpRequest extends InvsEquipmentCondSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentCondDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentCondDeleteNoOpRequest(String id, InvsEquipmentCondObjectData noOpIn) {
    super(id, "InvsEquipmentCondDeleteNoOpRequest");
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
