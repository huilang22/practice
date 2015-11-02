/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsGetRequest.java
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
 * Class used to create a VoucherDefinitionsGetRequest Udt Request
 *
 */

public class VoucherDefinitionsGetRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a  VoucherDefinitionsGetRequest
 * @param id Unique request name
 * @param VouGIn VoucherDefinitionsObjectKeyData for VoucherDefinitionsGetRequest
 *
 */
@JsonCreator
  public VoucherDefinitionsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherDefinitions")VoucherDefinitionsObjectKeyData VouGIn) {
    super(id, "VoucherDefinitionsGet");
    if (VouGIn != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectKeyHelper.toMap(VouGIn, new HashMap(), "VoucherDefinitionsObjectKeyData").get("VoucherDefinitionsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherDefinitionsObjectData that results from the VoucherDefinitionsGetRequest call
 * @return VoucherDefinitionsObjectData resulting from udt call
 *
 */

  public VoucherDefinitionsObjectData getOutput() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
}
