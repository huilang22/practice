/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductGetRequest.java
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
 * Class used to create a HqGroupProductGetRequest Udt Request
 *
 */

public class HqGroupProductGetRequest extends HqGroupProductSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupProductGetRequest
 * @param id Unique request name
 * @param HQGPgetIn HqGroupProductObjectData for HqGroupProductGetRequest
 *
 */
@JsonCreator
  public HqGroupProductGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupProduct")HqGroupProductObjectData HQGPgetIn) {
    super(id, "HqGroupProductGet");
    if (HQGPgetIn != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPgetIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }

/**
 *
 * Retrieves the HqGroupProductObjectData that results from the HqGroupProductGetRequest call
 * @return HqGroupProductObjectData resulting from udt call
 *
 */

  public HqGroupProductObjectData getOutput() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
}
