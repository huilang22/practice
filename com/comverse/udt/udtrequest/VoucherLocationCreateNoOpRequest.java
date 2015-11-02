/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationCreateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherLocationCreateNoOpRequest Udt Request/Response
 *
 */
public class VoucherLocationCreateNoOpRequest extends VoucherLocationSubRequestParent {
/**
 *
 * Constructor to create a   VoucherLocationCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherLocationCreateNoOpRequest(String id, VoucherLocationObjectData noOpIn) {
    super(id, "VoucherLocationCreateNoOpRequest");
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
