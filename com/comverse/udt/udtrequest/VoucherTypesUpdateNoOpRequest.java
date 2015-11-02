/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesUpdateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherTypesUpdateNoOpRequest Udt Request/Response
 *
 */
public class VoucherTypesUpdateNoOpRequest extends VoucherTypesSubRequestParent {
/**
 *
 * Constructor to create a   VoucherTypesUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherTypesUpdateNoOpRequest(String id, VoucherTypesObjectData noOpIn) {
    super(id, "VoucherTypesUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(noOpIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }
/**
 *
 * Retrieves the VoucherTypesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherTypesObjectData getOutput() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
}
