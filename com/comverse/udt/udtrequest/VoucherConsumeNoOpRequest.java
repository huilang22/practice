/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherConsumeNoOpRequest.java
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
 * NoOp class used to simulate a VoucherConsumeNoOpRequest Udt Request/Response
 *
 */
public class VoucherConsumeNoOpRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a   VoucherConsumeNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherConsumeNoOpRequest(String id, VoucherStatusInfoObjectData noOpIn) {
    super(id, "VoucherConsumeNoOpRequest");
    if (noOpIn != null) {
      addInput("VCOut", VoucherStatusInfoObjectHelper.toMap(noOpIn, new HashMap(), "VCOut").get("VCOut"));
    }
  }
/**
 *
 * Retrieves the VoucherStatusInfoObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VCOut");
  }
}
