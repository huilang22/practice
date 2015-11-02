/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryCreateRequest.java
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
 * Class used to create a PointCategoryCreateRequest Udt Request
 *
 */

public class PointCategoryCreateRequest extends PointCategorySubRequestParent {
/**
 *
 * Constructor to create a  PointCategoryCreateRequest
 * @param id Unique request name
 * @param PCATCreateIn PointCategoryObjectData for PointCategoryCreateRequest
 *
 */
@JsonCreator
  public PointCategoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointCategory")PointCategoryObjectData PCATCreateIn) {
    super(id, "PointCategoryCreate");
    if (PCATCreateIn != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(PCATCreateIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }

/**
 *
 * Retrieves the PointCategoryObjectData that results from the PointCategoryCreateRequest call
 * @return PointCategoryObjectData resulting from udt call
 *
 */

  public PointCategoryObjectData getOutput() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
}
