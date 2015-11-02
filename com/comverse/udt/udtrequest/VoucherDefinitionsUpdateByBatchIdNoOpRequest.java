/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsUpdateByBatchIdNoOpRequest.java
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
 * NoOp class used to simulate a VoucherDefinitionsUpdateByBatchIdNoOpRequest Udt Request/Response
 *
 */
public class VoucherDefinitionsUpdateByBatchIdNoOpRequest extends VoucherDefinitionsRequest {
/**
 *
 * Constructor to create a   VoucherDefinitionsUpdateByBatchIdNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherDefinitionsUpdateByBatchIdNoOpRequest(String id, Integer noOpIn) {
    super(id, "VoucherDefinitionsUpdateByBatchIdNoOpRequest");
    if (noOpIn != null) {
      addInput("VDUBUpdateCountOut", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("VDUBUpdateCountOut");
  }
}
