/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoActivateNoOpRequest.java
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
 * NoOp class used to simulate a VoucherStatusInfoActivateNoOpRequest Udt Request/Response
 *
 */
public class VoucherStatusInfoActivateNoOpRequest extends VoucherStatusInfoSubRequestParent {
/**
 *
 * Constructor to create a   VoucherStatusInfoActivateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherStatusInfoActivateNoOpRequest(String id, VoucherStatusInfoObjectData noOpIn) {
    super(id, "VoucherStatusInfoActivateNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(noOpIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
/**
 *
 * Retrieves the VoucherStatusInfoObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
}
