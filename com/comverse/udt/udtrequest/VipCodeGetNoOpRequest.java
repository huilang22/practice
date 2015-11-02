/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a VipCodeGetNoOpRequest Udt Request/Response
 *
 */
public class VipCodeGetNoOpRequest extends VipCodeSubRequestParent {
/**
 *
 * Constructor to create a   VipCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VipCodeGetNoOpRequest(String id, VipCodeObjectData noOpIn) {
    super(id, "VipCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(noOpIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }
/**
 *
 * Retrieves the VipCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VipCodeObjectData getOutput() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
}
