/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentSequenceGetRequest.java
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
 * Class used to create a BatchRequestSegmentSequenceGetRequest Udt Request
 *
 */

public class BatchRequestSegmentSequenceGetRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestSegmentSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchRequestSegmentSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchRequestSegmentSequenceGet");
  }

/**
 *
 * Retrieves the BatchRequestSegmentObjectBaseKeyData that results from the BatchRequestSegmentSequenceGetRequest call
 * @return BatchRequestSegmentObjectBaseKeyData resulting from udt call
 *
 */

  public BatchRequestSegmentObjectBaseKeyData getOutput() {
    return BatchRequestSegmentObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
