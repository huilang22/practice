/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapUpdateNoOpRequest.java
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
 * NoOp class used to simulate a VanityCodeChargeMapUpdateNoOpRequest Udt Request/Response
 *
 */
public class VanityCodeChargeMapUpdateNoOpRequest extends VanityCodeChargeMapSubRequestParent {
/**
 *
 * Constructor to create a   VanityCodeChargeMapUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VanityCodeChargeMapUpdateNoOpRequest(String id, VanityCodeChargeObjData noOpIn) {
    super(id, "VanityCodeChargeMapUpdateNoOpRequest");
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
