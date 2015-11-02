/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterSequenceGetRequest.java
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
 * Class used to create a BatchTypeParameterSequenceGetRequest Udt Request
 *
 */

public class BatchTypeParameterSequenceGetRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeParameterSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchTypeParameterSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchTypeParameterSequenceGet");
  }

/**
 *
 * Retrieves the BatchTypeParameterObjectKeyData that results from the BatchTypeParameterSequenceGetRequest call
 * @return BatchTypeParameterObjectKeyData resulting from udt call
 *
 */

  public BatchTypeParameterObjectKeyData getOutput() {
    return BatchTypeParameterObjectKeyHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
