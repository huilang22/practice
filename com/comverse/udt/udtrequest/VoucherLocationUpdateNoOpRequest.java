/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationUpdateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherLocationUpdateNoOpRequest Udt Request/Response
 *
 */
public class VoucherLocationUpdateNoOpRequest extends VoucherLocationSubRequestParent {
/**
 *
 * Constructor to create a   VoucherLocationUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherLocationUpdateNoOpRequest(String id, VoucherLocationObjectData noOpIn) {
    super(id, "VoucherLocationUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(noOpIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }
/**
 *
 * Retrieves the VoucherLocationObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherLocationObjectData getOutput() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
}
