/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsCreateRequest.java
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
 * Class used to create a VoucherDefinitionsCreateRequest Udt Request
 *
 */

public class VoucherDefinitionsCreateRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a  VoucherDefinitionsCreateRequest
 * @param id Unique request name
 * @param VouCIn VoucherDefinitionsObjectData for VoucherDefinitionsCreateRequest
 *
 */
@JsonCreator
  public VoucherDefinitionsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherDefinitions")VoucherDefinitionsObjectData VouCIn) {
    super(id, "VoucherDefinitionsCreate");
    if (VouCIn != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouCIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }

/**
 *
 * Retrieves the VoucherDefinitionsObjectData that results from the VoucherDefinitionsCreateRequest call
 * @return VoucherDefinitionsObjectData resulting from udt call
 *
 */

  public VoucherDefinitionsObjectData getOutput() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
}
