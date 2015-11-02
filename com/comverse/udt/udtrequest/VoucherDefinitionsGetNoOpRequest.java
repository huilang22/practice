/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsGetNoOpRequest.java
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
 * NoOp class used to simulate a VoucherDefinitionsGetNoOpRequest Udt Request/Response
 *
 */
public class VoucherDefinitionsGetNoOpRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a   VoucherDefinitionsGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherDefinitionsGetNoOpRequest(String id, VoucherDefinitionsObjectData noOpIn) {
    super(id, "VoucherDefinitionsGetNoOpRequest");
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
