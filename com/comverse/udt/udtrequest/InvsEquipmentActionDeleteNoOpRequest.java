/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionDeleteNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentActionDeleteNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentActionDeleteNoOpRequest extends InvsEquipmentActionSubRequestParent {
/**
 *
 * Constructor to create a   InvsEquipmentActionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentActionDeleteNoOpRequest(String id, InvsEquipmentActionObjectData noOpIn) {
    super(id, "InvsEquipmentActionDeleteNoOpRequest");
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
