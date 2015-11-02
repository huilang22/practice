/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a EquipClassCodeGetNoOpRequest Udt Request/Response
 *
 */
public class EquipClassCodeGetNoOpRequest extends EquipClassCodeSubRequestParent {
/**
 *
 * Constructor to create a   EquipClassCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EquipClassCodeGetNoOpRequest(String id, ECCObjectData noOpIn) {
    super(id, "EquipClassCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("EquipClassCode", ECCObjectHelper.toMap(noOpIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
/**
 *
 * Retrieves the ECCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ECCObjectData getOutput() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
}
