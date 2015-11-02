/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsUpdateByBatchIdRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a VoucherDefinitionsUpdateByBatchIdRequest Udt Request
 *
 */

public class VoucherDefinitionsUpdateByBatchIdRequest extends VoucherDefinitionsRequest {
/**
 *
 * Constructor to create a  VoucherDefinitionsUpdateByBatchIdRequest
 * @param id Unique request name
 * @param VDUBBatchId_In BigInteger for VoucherDefinitionsUpdateByBatchIdRequest
 * @param VDUBLocCode_In BigInteger for VoucherDefinitionsUpdateByBatchIdRequest
 * @param VDUBStatus_In BigInteger for VoucherDefinitionsUpdateByBatchIdRequest
 *
 */
@JsonCreator
  public VoucherDefinitionsUpdateByBatchIdRequest(@JsonProperty("RequestId") String id, @JsonProperty("VDUBBatchIdIn")BigInteger VDUBBatchId_In, @JsonProperty("VDUBLocCodeIn")BigInteger VDUBLocCode_In, @JsonProperty("VDUBStatusIn")BigInteger VDUBStatus_In) {
    super(id, "VoucherDefinitionsUpdateByBatchId");
    if (VDUBBatchId_In != null) {
      addInput("VDUBBatchIdIn", VDUBBatchId_In);
    }
    if (VDUBLocCode_In != null) {
      addInput("VDUBLocCodeIn", VDUBLocCode_In);
    }
    if (VDUBStatus_In != null) {
      addInput("VDUBStatusIn", VDUBStatus_In);
    }
  }

/**
 *
 * Retrieves the Integer that results from the VoucherDefinitionsUpdateByBatchIdRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("VDUBUpdateCountOut");
  }
}
