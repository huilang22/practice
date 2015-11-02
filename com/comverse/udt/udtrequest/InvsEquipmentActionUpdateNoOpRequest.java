/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentActionUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentActionUpdateNoOpRequest extends InvsEquipmentActionSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentActionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentActionUpdateNoOpRequest(String id, InvsEquipmentActionObjectData noOpIn) {
    super(id, "InvsEquipmentActionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
/**
 *
 * Retrieves the InvsEquipmentActionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentActionObjectData getOutput() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
}
