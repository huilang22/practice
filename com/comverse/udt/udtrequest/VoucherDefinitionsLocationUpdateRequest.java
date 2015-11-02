/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsLocationUpdateRequest.java
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
 * Class used to create a VoucherDefinitionsLocationUpdateRequest Udt Request
 *
 */

public class VoucherDefinitionsLocationUpdateRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a  VoucherDefinitionsLocationUpdateRequest
 * @param id Unique request name
 * @param VouULIn VoucherDefinitionsObjectData for VoucherDefinitionsLocationUpdateRequest
 *
 */
@JsonCreator
  public VoucherDefinitionsLocationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherDefinitions")VoucherDefinitionsObjectData VouULIn) {
    super(id, "VoucherDefinitionsLocationUpdate");
    if (VouULIn != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouULIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }

/**
 *
 * Retrieves the VoucherDefinitionsObjectData that results from the VoucherDefinitionsLocationUpdateRequest call
 * @return VoucherDefinitionsObjectData resulting from udt call
 *
 */

  public VoucherDefinitionsObjectData getOutput() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
}
