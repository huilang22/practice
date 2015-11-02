/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsLocationUpdateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherDefinitionsLocationUpdateNoOpRequest Udt Request/Response
 *
 */
public class VoucherDefinitionsLocationUpdateNoOpRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a   VoucherDefinitionsLocationUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherDefinitionsLocationUpdateNoOpRequest(String id, VoucherDefinitionsObjectData noOpIn) {
    super(id, "VoucherDefinitionsLocationUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(noOpIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
/**
 *
 * Retrieves the VoucherDefinitionsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherDefinitionsObjectData getOutput() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
}
