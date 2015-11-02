/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeFindRequest.java
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
 * Class used to create a BatchTypeFindRequest Udt Request
 *
 */

public class BatchTypeFindRequest extends BatchTypeRequest {
/**
 *
 * Constructor to create a  BatchTypeFindRequest
 * @param id Unique request name
 * @param batchTypeFindIn BatchTypeObjectFilter for BatchTypeFindRequest
 *
 */
@JsonCreator
  public BatchTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchType")BatchTypeObjectFilter batchTypeFindIn) {
    super(id, "BatchTypeFind");
    if (batchTypeFindIn != null) {
      Integer index =  batchTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchType", BatchTypeObjectHelper.toMap(batchTypeFindIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }

/**
 *
 * Retrieves the BatchTypeObjectDataList that results from the BatchTypeFindRequest call
 * @return BatchTypeObjectDataList resulting from udt call
 *
 */

  public BatchTypeObjectDataList getOutput() {
    return BatchTypeObjectHelper.fromMapList(outputMap, "BatchTypeList");
  }
}
