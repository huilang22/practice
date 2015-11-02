/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryDeleteRequest.java
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
 * Class used to create a BatchCategoryDeleteRequest Udt Request
 *
 */

public class BatchCategoryDeleteRequest extends BatchCategorySubRequestParent {
/**
 *
 * Constructor to create a  BatchCategoryDeleteRequest
 * @param id Unique request name
 * @param batchCategoryDeleteIn BatchCategoryObjectKeyData for BatchCategoryDeleteRequest
 *
 */
@JsonCreator
  public BatchCategoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchCategory")BatchCategoryObjectKeyData batchCategoryDeleteIn) {
    super(id, "BatchCategoryDelete");
    if (batchCategoryDeleteIn != null) {
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(batchCategoryDeleteIn, new HashMap(), "BatchCategoryObjectKeyData").get("BatchCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchCategoryObjectData that results from the BatchCategoryDeleteRequest call
 * @return BatchCategoryObjectData resulting from udt call
 *
 */

  public BatchCategoryObjectData getOutput() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
}
