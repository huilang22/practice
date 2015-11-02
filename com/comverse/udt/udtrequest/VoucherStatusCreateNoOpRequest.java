/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusCreateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherStatusCreateNoOpRequest Udt Request/Response
 *
 */
public class VoucherStatusCreateNoOpRequest extends VoucherStatusSubRequestParent {
/**
 *
 * Constructor to create a   VoucherStatusCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherStatusCreateNoOpRequest(String id, VoucherStatusObjectData noOpIn) {
    super(id, "VoucherStatusCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(noOpIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }
/**
 *
 * Retrieves the VoucherStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusObjectData getOutput() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
}
