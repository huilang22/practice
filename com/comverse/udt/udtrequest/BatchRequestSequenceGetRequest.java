/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSequenceGetRequest.java
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
 * Class used to create a BatchRequestSequenceGetRequest Udt Request
 *
 */

public class BatchRequestSequenceGetRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchRequestSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchRequestSequenceGet");
  }

/**
 *
 * Retrieves the BatchRequestObjectKeyData that results from the BatchRequestSequenceGetRequest call
 * @return BatchRequestObjectKeyData resulting from udt call
 *
 */

  public BatchRequestObjectKeyData getOutput() {
    return BatchRequestObjectKeyHelper.fromMap(outputMap, "BatchRequest");
  }
}
