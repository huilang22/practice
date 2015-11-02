/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsCreateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherDefinitionsCreateNoOpRequest Udt Request/Response
 *
 */
public class VoucherDefinitionsCreateNoOpRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a   VoucherDefinitionsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherDefinitionsCreateNoOpRequest(String id, VoucherDefinitionsObjectData noOpIn) {
    super(id, "VoucherDefinitionsCreateNoOpRequest");
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
