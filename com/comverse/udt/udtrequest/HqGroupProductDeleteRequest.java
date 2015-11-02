/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductDeleteRequest.java
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
 * Class used to create a HqGroupProductDeleteRequest Udt Request
 *
 */

public class HqGroupProductDeleteRequest extends HqGroupProductSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupProductDeleteRequest
 * @param id Unique request name
 * @param HQGPdeleteIn HqGroupProductObjectData for HqGroupProductDeleteRequest
 * @param ProductViewId Integer for HqGroupProductDeleteRequest
 *
 */
@JsonCreator
  public HqGroupProductDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupProduct")HqGroupProductObjectData HQGPdeleteIn, @JsonProperty("ProductViewId")Integer ProductViewId) {
    super(id, "HqGroupProductDelete");
    if (HQGPdeleteIn != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPdeleteIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
    if (ProductViewId != null) {
      addInput("ProductViewId", ProductViewId);
    }
  }

/**
 *
 * Retrieves the HqGroupProductObjectData that results from the HqGroupProductDeleteRequest call
 * @return HqGroupProductObjectData resulting from udt call
 *
 */

  public HqGroupProductObjectData getOutput() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
}
