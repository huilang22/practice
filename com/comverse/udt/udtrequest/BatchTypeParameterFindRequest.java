/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterFindRequest.java
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
 * Class used to create a BatchTypeParameterFindRequest Udt Request
 *
 */

public class BatchTypeParameterFindRequest extends BatchTypeParameterRequest {
/**
 *
 * Constructor to create a  BatchTypeParameterFindRequest
 * @param id Unique request name
 * @param batchTypeParameterFindIn BatchTypeParameterObjectFilter for BatchTypeParameterFindRequest
 *
 */
@JsonCreator
  public BatchTypeParameterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeParameter")BatchTypeParameterObjectFilter batchTypeParameterFindIn) {
    super(id, "BatchTypeParameterFind");
    if (batchTypeParameterFindIn != null) {
      Integer index =  batchTypeParameterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(batchTypeParameterFindIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }

/**
 *
 * Retrieves the BatchTypeParameterObjectDataList that results from the BatchTypeParameterFindRequest call
 * @return BatchTypeParameterObjectDataList resulting from udt call
 *
 */

  public BatchTypeParameterObjectDataList getOutput() {
    return BatchTypeParameterObjectHelper.fromMapList(outputMap, "BatchTypeParameterList");
  }
}
