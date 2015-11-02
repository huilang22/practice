/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentActionGetNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentActionGetNoOpRequest extends InvsEquipmentActionSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentActionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentActionGetNoOpRequest(String id, InvsEquipmentActionObjectData noOpIn) {
    super(id, "InvsEquipmentActionGetNoOpRequest");
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
