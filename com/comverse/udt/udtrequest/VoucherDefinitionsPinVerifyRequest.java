/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsPinVerifyRequest.java
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
 * Class used to create a VoucherDefinitionsPinVerifyRequest Udt Request
 *
 */

public class VoucherDefinitionsPinVerifyRequest extends VoucherDefinitionsRequest {
/**
 *
 * Constructor to create a  VoucherDefinitionsPinVerifyRequest
 * @param id Unique request name
 * @param VouVIn VoucherDefinitionsObjectData for VoucherDefinitionsPinVerifyRequest
 *
 */
@JsonCreator
  public VoucherDefinitionsPinVerifyRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherDefinitions")VoucherDefinitionsObjectData VouVIn) {
    super(id, "VoucherDefinitionsPinVerify");
    if (VouVIn != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouVIn, new HashMap(), "Ret").get("Ret"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the VoucherDefinitionsPinVerifyRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Ret");
  }
}
