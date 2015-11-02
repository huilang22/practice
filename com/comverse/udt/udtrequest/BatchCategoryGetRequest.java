/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryGetRequest.java
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
 * Class used to create a BatchCategoryGetRequest Udt Request
 *
 */

public class BatchCategoryGetRequest extends BatchCategorySubRequestParent {
/**
 *
 * Constructor to create a  BatchCategoryGetRequest
 * @param id Unique request name
 * @param batchCategoryGetIn BatchCategoryObjectKeyData for BatchCategoryGetRequest
 *
 */
@JsonCreator
  public BatchCategoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchCategory")BatchCategoryObjectKeyData batchCategoryGetIn) {
    super(id, "BatchCategoryGet");
    if (batchCategoryGetIn != null) {
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(batchCategoryGetIn, new HashMap(), "BatchCategoryObjectKeyData").get("BatchCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchCategoryObjectData that results from the BatchCategoryGetRequest call
 * @return BatchCategoryObjectData resulting from udt call
 *
 */

  public BatchCategoryObjectData getOutput() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
}
