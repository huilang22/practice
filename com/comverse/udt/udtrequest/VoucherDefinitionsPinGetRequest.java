/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsPinGetRequest.java
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
 * Class used to create a VoucherDefinitionsPinGetRequest Udt Request
 *
 */

public class VoucherDefinitionsPinGetRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a  VoucherDefinitionsPinGetRequest
 * @param id Unique request name
 * @param VouVGIn VoucherDefinitionsObjectKeyData for VoucherDefinitionsPinGetRequest
 *
 */
@JsonCreator
  public VoucherDefinitionsPinGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherDefinitions")VoucherDefinitionsObjectKeyData VouVGIn) {
    super(id, "VoucherDefinitionsPinGet");
    if (VouVGIn != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectKeyHelper.toMap(VouVGIn, new HashMap(), "VoucherDefinitionsObjectKeyData").get("VoucherDefinitionsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherDefinitionsPinGetOutputData that results from the VoucherDefinitionsPinGetRequest call
 * @return VoucherDefinitionsPinGetOutputData resulting from udt call
 *
 */

  public VoucherDefinitionsPinGetOutputData getOutput() {
    return VoucherDefinitionsPinGetOutputHelper.fromMap(outputMap);
  }
}
