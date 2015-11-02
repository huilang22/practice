/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageSequenceGetRequest.java
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
 * Class used to create a BatchTypeStageSequenceGetRequest Udt Request
 *
 */

public class BatchTypeStageSequenceGetRequest extends BatchTypeStageSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeStageSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchTypeStageSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchTypeStageSequenceGet");
  }

/**
 *
 * Retrieves the BatchTypeStageObjectKeyData that results from the BatchTypeStageSequenceGetRequest call
 * @return BatchTypeStageObjectKeyData resulting from udt call
 *
 */

  public BatchTypeStageObjectKeyData getOutput() {
    return BatchTypeStageObjectKeyHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
