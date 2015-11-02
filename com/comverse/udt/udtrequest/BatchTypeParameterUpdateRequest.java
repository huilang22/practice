/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterUpdateRequest.java
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
 * Class used to create a BatchTypeParameterUpdateRequest Udt Request
 *
 */

public class BatchTypeParameterUpdateRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeParameterUpdateRequest
 * @param id Unique request name
 * @param batchTypeParameterUpdateIn BatchTypeParameterObjectData for BatchTypeParameterUpdateRequest
 *
 */
@JsonCreator
  public BatchTypeParameterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeParameter")BatchTypeParameterObjectData batchTypeParameterUpdateIn) {
    super(id, "BatchTypeParameterUpdate");
    if (batchTypeParameterUpdateIn != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(batchTypeParameterUpdateIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }

/**
 *
 * Retrieves the BatchTypeParameterObjectData that results from the BatchTypeParameterUpdateRequest call
 * @return BatchTypeParameterObjectData resulting from udt call
 *
 */

  public BatchTypeParameterObjectData getOutput() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
