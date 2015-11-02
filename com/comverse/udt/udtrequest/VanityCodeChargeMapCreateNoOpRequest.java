/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapCreateNoOpRequest.java
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
 * NoOp class used to simulate a VanityCodeChargeMapCreateNoOpRequest Udt Request/Response
 *
 */
public class VanityCodeChargeMapCreateNoOpRequest extends VanityCodeChargeMapSubRequestParent {
/**
 *
 * Constructor to create a   VanityCodeChargeMapCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VanityCodeChargeMapCreateNoOpRequest(String id, VanityCodeChargeObjData noOpIn) {
    super(id, "VanityCodeChargeMapCreateNoOpRequest");
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
