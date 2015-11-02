/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementGetNoOpRequest.java
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
 * NoOp class used to simulate a VoucherStatusMovementGetNoOpRequest Udt Request/Response
 *
 */
public class VoucherStatusMovementGetNoOpRequest extends VoucherStatusMovementSubRequestParent {
/**
 *
 * Constructor to create a   VoucherStatusMovementGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherStatusMovementGetNoOpRequest(String id, VoucherStatusMovementObjectData noOpIn) {
    super(id, "VoucherStatusMovementGetNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(noOpIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }
/**
 *
 * Retrieves the VoucherStatusMovementObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusMovementObjectData getOutput() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
}
