/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeCreateNoOpRequest.java
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
 * NoOp class used to simulate a EquipClassCodeCreateNoOpRequest Udt Request/Response
 *
 */
public class EquipClassCodeCreateNoOpRequest extends EquipClassCodeSubRequestParent {
/**
 *
 * Constructor to create a   EquipClassCodeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EquipClassCodeCreateNoOpRequest(String id, ECCObjectData noOpIn) {
    super(id, "EquipClassCodeCreateNoOpRequest");
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
