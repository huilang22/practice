/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryGetNoOpRequest.java
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
 * NoOp class used to simulate a VoucherHistoryGetNoOpRequest Udt Request/Response
 *
 */
public class VoucherHistoryGetNoOpRequest extends VoucherHistorySubRequestParent {
/**
 *
 * Constructor to create a   VoucherHistoryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherHistoryGetNoOpRequest(String id, VoucherHistoryObjectData noOpIn) {
    super(id, "VoucherHistoryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherHistory", VoucherHistoryObjectHelper.toMap(noOpIn, new HashMap(), "VoucherHistory").get("VoucherHistory"));
    }
  }
/**
 *
 * Retrieves the VoucherHistoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherHistoryObjectData getOutput() {
    return VoucherHistoryObjectHelper.fromMap(outputMap, "VoucherHistory");
  }
}
