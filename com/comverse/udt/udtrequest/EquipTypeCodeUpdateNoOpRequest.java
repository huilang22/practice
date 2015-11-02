/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeUpdateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EquipTypeCodeUpdateNoOpRequest Udt Request/Response
 *
 */
public class EquipTypeCodeUpdateNoOpRequest extends EquipTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a   EquipTypeCodeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EquipTypeCodeUpdateNoOpRequest(String id, ETGObjectData noOpIn) {
    super(id, "EquipTypeCodeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("EquipTypeCode", ETGObjectHelper.toMap(noOpIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }
/**
 *
 * Retrieves the ETGObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ETGObjectData getOutput() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
}
