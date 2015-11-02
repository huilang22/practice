/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryUpdateRequest.java
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
 * Class used to create a PointCategoryUpdateRequest Udt Request
 *
 */

public class PointCategoryUpdateRequest extends PointCategorySubRequestParent {
/**
 *
 * Constructor to create a  PointCategoryUpdateRequest
 * @param id Unique request name
 * @param PCATUpdateIn PointCategoryObjectData for PointCategoryUpdateRequest
 *
 */
@JsonCreator
  public PointCategoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointCategory")PointCategoryObjectData PCATUpdateIn) {
    super(id, "PointCategoryUpdate");
    if (PCATUpdateIn != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(PCATUpdateIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }

/**
 *
 * Retrieves the PointCategoryObjectData that results from the PointCategoryUpdateRequest call
 * @return PointCategoryObjectData resulting from udt call
 *
 */

  public PointCategoryObjectData getOutput() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
}
