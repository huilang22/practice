/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryDeleteRequest.java
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
 * Class used to create a PointCategoryDeleteRequest Udt Request
 *
 */

public class PointCategoryDeleteRequest extends PointCategorySubRequestParent {
/**
 *
 * Constructor to create a  PointCategoryDeleteRequest
 * @param id Unique request name
 * @param PCATDeleteIn PointCategoryObjectKeyData for PointCategoryDeleteRequest
 *
 */
@JsonCreator
  public PointCategoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointCategory")PointCategoryObjectKeyData PCATDeleteIn) {
    super(id, "PointCategoryDelete");
    if (PCATDeleteIn != null) {
      addInput("PointCategory", PointCategoryObjectKeyHelper.toMap(PCATDeleteIn, new HashMap(), "PointCategoryObjectKeyData").get("PointCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PointCategoryObjectData that results from the PointCategoryDeleteRequest call
 * @return PointCategoryObjectData resulting from udt call
 *
 */

  public PointCategoryObjectData getOutput() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
}
