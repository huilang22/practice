/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryUpdateRequest.java
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
 * Class used to create a BatchCategoryUpdateRequest Udt Request
 *
 */

public class BatchCategoryUpdateRequest extends BatchCategorySubRequestParent {
/**
 *
 * Constructor to create a  BatchCategoryUpdateRequest
 * @param id Unique request name
 * @param batchCategoryUpdateIn BatchCategoryObjectData for BatchCategoryUpdateRequest
 *
 */
@JsonCreator
  public BatchCategoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchCategory")BatchCategoryObjectData batchCategoryUpdateIn) {
    super(id, "BatchCategoryUpdate");
    if (batchCategoryUpdateIn != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(batchCategoryUpdateIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }

/**
 *
 * Retrieves the BatchCategoryObjectData that results from the BatchCategoryUpdateRequest call
 * @return BatchCategoryObjectData resulting from udt call
 *
 */

  public BatchCategoryObjectData getOutput() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
}
