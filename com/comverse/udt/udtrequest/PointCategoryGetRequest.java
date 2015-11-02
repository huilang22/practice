/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryGetRequest.java
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
 * Class used to create a PointCategoryGetRequest Udt Request
 *
 */

public class PointCategoryGetRequest extends PointCategorySubRequestParent {
/**
 *
 * Constructor to create a  PointCategoryGetRequest
 * @param id Unique request name
 * @param PCATGetIn PointCategoryObjectKeyData for PointCategoryGetRequest
 *
 */
@JsonCreator
  public PointCategoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointCategory")PointCategoryObjectKeyData PCATGetIn) {
    super(id, "PointCategoryGet");
    if (PCATGetIn != null) {
      addInput("PointCategory", PointCategoryObjectKeyHelper.toMap(PCATGetIn, new HashMap(), "PointCategoryObjectKeyData").get("PointCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PointCategoryObjectData that results from the PointCategoryGetRequest call
 * @return PointCategoryObjectData resulting from udt call
 *
 */

  public PointCategoryObjectData getOutput() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
}
