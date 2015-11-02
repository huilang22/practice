/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductCreateRequest.java
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
 * Class used to create a HqGroupProductCreateRequest Udt Request
 *
 */

public class HqGroupProductCreateRequest extends HqGroupProductSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupProductCreateRequest
 * @param id Unique request name
 * @param HQGPcreateIn HqGroupProductObjectData for HqGroupProductCreateRequest
 *
 */
@JsonCreator
  public HqGroupProductCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupProduct")HqGroupProductObjectData HQGPcreateIn) {
    super(id, "HqGroupProductCreate");
    if (HQGPcreateIn != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPcreateIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }

/**
 *
 * Retrieves the HqGroupProductObjectData that results from the HqGroupProductCreateRequest call
 * @return HqGroupProductObjectData resulting from udt call
 *
 */

  public HqGroupProductObjectData getOutput() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
}
