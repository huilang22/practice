/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapGetNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a VanityCodeChargeMapGetNoOpRequest Udt Request/Response
 *
 */
public class VanityCodeChargeMapGetNoOpRequest extends VanityCodeChargeMapSubRequestParent {
/**
 *
 * Constructor to create a   VanityCodeChargeMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VanityCodeChargeMapGetNoOpRequest(String id, VanityCodeChargeObjData noOpIn) {
    super(id, "VanityCodeChargeMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(noOpIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }
/**
 *
 * Retrieves the VanityCodeChargeObjData passed into the constructor
 * @return Simulated response
 *
 */
  public VanityCodeChargeObjData getOutput() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
}
