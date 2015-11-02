/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryFindRequest.java
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
 * Class used to create a PointCategoryFindRequest Udt Request
 *
 */

public class PointCategoryFindRequest extends PointCategoryRequest {
/**
 *
 * Constructor to create a  PointCategoryFindRequest
 * @param id Unique request name
 * @param PCATFindIn PointCategoryObjectFilter for PointCategoryFindRequest
 *
 */
@JsonCreator
  public PointCategoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointCategory")PointCategoryObjectFilter PCATFindIn) {
    super(id, "PointCategoryFind");
    if (PCATFindIn != null) {
      Integer index =  PCATFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PointCategory", PointCategoryObjectHelper.toMap(PCATFindIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }

/**
 *
 * Retrieves the PointCategoryObjectDataList that results from the PointCategoryFindRequest call
 * @return PointCategoryObjectDataList resulting from udt call
 *
 */

  public PointCategoryObjectDataList getOutput() {
    return PointCategoryObjectHelper.fromMapList(outputMap, "PointCategoryList");
  }
}
