/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterCreateRequest.java
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
 * Class used to create a BatchTypeParameterCreateRequest Udt Request
 *
 */

public class BatchTypeParameterCreateRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeParameterCreateRequest
 * @param id Unique request name
 * @param batchTypeParameterCreateIn BatchTypeParameterObjectData for BatchTypeParameterCreateRequest
 *
 */
@JsonCreator
  public BatchTypeParameterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeParameter")BatchTypeParameterObjectData batchTypeParameterCreateIn) {
    super(id, "BatchTypeParameterCreate");
    if (batchTypeParameterCreateIn != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(batchTypeParameterCreateIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }

/**
 *
 * Retrieves the BatchTypeParameterObjectData that results from the BatchTypeParameterCreateRequest call
 * @return BatchTypeParameterObjectData resulting from udt call
 *
 */

  public BatchTypeParameterObjectData getOutput() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
