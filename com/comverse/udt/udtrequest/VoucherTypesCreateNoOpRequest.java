/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesCreateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherTypesCreateNoOpRequest Udt Request/Response
 *
 */
public class VoucherTypesCreateNoOpRequest extends VoucherTypesSubRequestParent {
/**
 *
 * Constructor to create a   VoucherTypesCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherTypesCreateNoOpRequest(String id, VoucherTypesObjectData noOpIn) {
    super(id, "VoucherTypesCreateNoOpRequest");
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
