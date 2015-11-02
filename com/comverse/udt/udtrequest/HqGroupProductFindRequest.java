/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductFindRequest.java
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
 * Class used to create a HqGroupProductFindRequest Udt Request
 *
 */

public class HqGroupProductFindRequest extends HqGroupProductRequest {
/**
 *
 * Constructor to create a  HqGroupProductFindRequest
 * @param id Unique request name
 * @param HQGPfindIn HqGroupProductObjectFilter for HqGroupProductFindRequest
 *
 */
@JsonCreator
  public HqGroupProductFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupProduct")HqGroupProductObjectFilter HQGPfindIn) {
    super(id, "HqGroupProductFind");
    if (HQGPfindIn != null) {
      Integer index =  HQGPfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPfindIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }

/**
 *
 * Retrieves the HqGroupProductObjectDataList that results from the HqGroupProductFindRequest call
 * @return HqGroupProductObjectDataList resulting from udt call
 *
 */

  public HqGroupProductObjectDataList getOutput() {
    return HqGroupProductObjectHelper.fromMapList(outputMap, "HqGroupProductList");
  }
}
