/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeSequenceGetRequest.java
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
 * Class used to create a BatchTypeSequenceGetRequest Udt Request
 *
 */

public class BatchTypeSequenceGetRequest extends BatchTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchTypeSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchTypeSequenceGet");
  }

/**
 *
 * Retrieves the BatchTypeObjectKeyData that results from the BatchTypeSequenceGetRequest call
 * @return BatchTypeObjectKeyData resulting from udt call
 *
 */

  public BatchTypeObjectKeyData getOutput() {
    return BatchTypeObjectKeyHelper.fromMap(outputMap, "BatchType");
  }
}
