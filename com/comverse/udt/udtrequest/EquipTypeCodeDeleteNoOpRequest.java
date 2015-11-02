/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a EquipTypeCodeDeleteNoOpRequest Udt Request/Response
 *
 */
public class EquipTypeCodeDeleteNoOpRequest extends EquipTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a   EquipTypeCodeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EquipTypeCodeDeleteNoOpRequest(String id, ETGObjectData noOpIn) {
    super(id, "EquipTypeCodeDeleteNoOpRequest");
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
