/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PointRegionFindRequest Udt Request
 *
 */

public class PointRegionFindRequest extends PointRegionRequest {
/**
 *
 * Constructor to create a  PointRegionFindRequest
 * @param id Unique request name
 * @param PRFindIn PointRegionObjectFilter for PointRegionFindRequest
 *
 */
@JsonCreator
  public PointRegionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointRegion")PointRegionObjectFilter PRFindIn) {
    super(id, "PointRegionFind");
    if (PRFindIn != null) {
      Integer index =  PRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PointRegion", PointRegionObjectHelper.toMap(PRFindIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }

/**
 *
 * Retrieves the PointRegionObjectDataList that results from the PointRegionFindRequest call
 * @return PointRegionObjectDataList resulting from udt call
 *
 */

  public PointRegionObjectDataList getOutput() {
    return PointRegionObjectHelper.fromMapList(outputMap, "PointRegionList");
  }
}
