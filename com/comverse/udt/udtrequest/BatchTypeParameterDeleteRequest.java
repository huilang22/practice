/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterDeleteRequest.java
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
 * Class used to create a BatchTypeParameterDeleteRequest Udt Request
 *
 */

public class BatchTypeParameterDeleteRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeParameterDeleteRequest
 * @param id Unique request name
 * @param batchTypeParameterDeleteIn BatchTypeParameterObjectKeyData for BatchTypeParameterDeleteRequest
 *
 */
@JsonCreator
  public BatchTypeParameterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeParameter")BatchTypeParameterObjectKeyData batchTypeParameterDeleteIn) {
    super(id, "BatchTypeParameterDelete");
    if (batchTypeParameterDeleteIn != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(batchTypeParameterDeleteIn, new HashMap(), "BatchTypeParameterObjectKeyData").get("BatchTypeParameterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchTypeParameterObjectData that results from the BatchTypeParameterDeleteRequest call
 * @return BatchTypeParameterObjectData resulting from udt call
 *
 */

  public BatchTypeParameterObjectData getOutput() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
