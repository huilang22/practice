/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherConsumeRequest.java
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
 * Class used to create a VoucherConsumeRequest Udt Request
 *
 */

public class VoucherConsumeRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a  VoucherConsumeRequest
 * @param id Unique request name
 * @param VC_In VoucherDefinitionsObjectData for VoucherConsumeRequest
 *
 */
@JsonCreator
  public VoucherConsumeRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherDefinitions")VoucherDefinitionsObjectData VC_In) {
    super(id, "VoucherConsume");
    if (VC_In != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VC_In, new HashMap(), "VCOut").get("VCOut"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusInfoObjectData that results from the VoucherConsumeRequest call
 * @return VoucherStatusInfoObjectData resulting from udt call
 *
 */

  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VCOut");
  }
}
