/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableSequenceGetRequest.java
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
 * Class used to create a BatchExecutableSequenceGetRequest Udt Request
 *
 */

public class BatchExecutableSequenceGetRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchExecutableSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchExecutableSequenceGet");
  }

/**
 *
 * Retrieves the BatchExecutableObjectKeyData that results from the BatchExecutableSequenceGetRequest call
 * @return BatchExecutableObjectKeyData resulting from udt call
 *
 */

  public BatchExecutableObjectKeyData getOutput() {
    return BatchExecutableObjectKeyHelper.fromMap(outputMap, "BatchExecutable");
  }
}
