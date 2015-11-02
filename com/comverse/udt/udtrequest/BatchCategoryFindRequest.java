/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryFindRequest.java
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
 * Class used to create a BatchCategoryFindRequest Udt Request
 *
 */

public class BatchCategoryFindRequest extends BatchCategoryRequest {
/**
 *
 * Constructor to create a  BatchCategoryFindRequest
 * @param id Unique request name
 * @param batchCategoryFindIn BatchCategoryObjectFilter for BatchCategoryFindRequest
 *
 */
@JsonCreator
  public BatchCategoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchCategory")BatchCategoryObjectFilter batchCategoryFindIn) {
    super(id, "BatchCategoryFind");
    if (batchCategoryFindIn != null) {
      Integer index =  batchCategoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(batchCategoryFindIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }

/**
 *
 * Retrieves the BatchCategoryObjectDataList that results from the BatchCategoryFindRequest call
 * @return BatchCategoryObjectDataList resulting from udt call
 *
 */

  public BatchCategoryObjectDataList getOutput() {
    return BatchCategoryObjectHelper.fromMapList(outputMap, "BatchCategoryList");
  }
}
