/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryCreateRequest.java
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

import com.csgsystems.bat.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchCategoryCreateRequest Udt Request
 *
 */

public class BatchCategoryCreateRequest extends BatchCategorySubRequestParent {
/**
 *
 * Constructor to create a  BatchCategoryCreateRequest
 * @param id Unique request name
 * @param batchCategoryCreateIn BatchCategoryObjectData for BatchCategoryCreateRequest
 *
 */
@JsonCreator
  public BatchCategoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchCategory")BatchCategoryObjectData batchCategoryCreateIn) {
    super(id, "BatchCategoryCreate");
    if (batchCategoryCreateIn != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(batchCategoryCreateIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }

/**
 *
 * Retrieves the BatchCategoryObjectData that results from the BatchCategoryCreateRequest call
 * @return BatchCategoryObjectData resulting from udt call
 *
 */

  public BatchCategoryObjectData getOutput() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
}
