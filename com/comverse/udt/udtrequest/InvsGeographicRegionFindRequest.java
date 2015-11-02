/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsGeographicRegionFindRequest Udt Request
 *
 */

public class InvsGeographicRegionFindRequest extends InvsGeographicRegionRequest {
/**
 *
 * Constructor to create a  InvsGeographicRegionFindRequest
 * @param id Unique request name
 * @param InvsGeographicRegionFindIn InvsGeographicRegionObjectFilter for InvsGeographicRegionFindRequest
 *
 */
@JsonCreator
  public InvsGeographicRegionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsGeographicRegion")InvsGeographicRegionObjectFilter InvsGeographicRegionFindIn) {
    super(id, "InvsGeographicRegionFind");
    if (InvsGeographicRegionFindIn != null) {
      Integer index =  InvsGeographicRegionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(InvsGeographicRegionFindIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }

/**
 *
 * Retrieves the InvsGeographicRegionObjectDataList that results from the InvsGeographicRegionFindRequest call
 * @return InvsGeographicRegionObjectDataList resulting from udt call
 *
 */

  public InvsGeographicRegionObjectDataList getOutput() {
    return InvsGeographicRegionObjectHelper.fromMapList(outputMap, "InvsGeographicRegionList");
  }
}
