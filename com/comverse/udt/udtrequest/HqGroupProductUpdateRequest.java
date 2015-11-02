/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductUpdateRequest.java
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
 * Class used to create a HqGroupProductUpdateRequest Udt Request
 *
 */

public class HqGroupProductUpdateRequest extends HqGroupProductSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupProductUpdateRequest
 * @param id Unique request name
 * @param HQGPupdateIn HqGroupProductObjectData for HqGroupProductUpdateRequest
 *
 */
@JsonCreator
  public HqGroupProductUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupProduct")HqGroupProductObjectData HQGPupdateIn) {
    super(id, "HqGroupProductUpdate");
    if (HQGPupdateIn != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPupdateIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }

/**
 *
 * Retrieves the HqGroupProductObjectData that results from the HqGroupProductUpdateRequest call
 * @return HqGroupProductObjectData resulting from udt call
 *
 */

  public HqGroupProductObjectData getOutput() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
}
