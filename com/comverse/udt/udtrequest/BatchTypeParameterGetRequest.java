/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterGetRequest.java
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
 * Class used to create a BatchTypeParameterGetRequest Udt Request
 *
 */

public class BatchTypeParameterGetRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeParameterGetRequest
 * @param id Unique request name
 * @param batchTypeParameterGetIn BatchTypeParameterObjectKeyData for BatchTypeParameterGetRequest
 *
 */
@JsonCreator
  public BatchTypeParameterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeParameter")BatchTypeParameterObjectKeyData batchTypeParameterGetIn) {
    super(id, "BatchTypeParameterGet");
    if (batchTypeParameterGetIn != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(batchTypeParameterGetIn, new HashMap(), "BatchTypeParameterObjectKeyData").get("BatchTypeParameterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchTypeParameterObjectData that results from the BatchTypeParameterGetRequest call
 * @return BatchTypeParameterObjectData resulting from udt call
 *
 */

  public BatchTypeParameterObjectData getOutput() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
