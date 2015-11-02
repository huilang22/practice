/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageSequenceGetRequest.java
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
 * Class used to create a BatchRequestNotifyMessageSequenceGetRequest Udt Request
 *
 */

public class BatchRequestNotifyMessageSequenceGetRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchRequestNotifyMessageSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchRequestNotifyMessageSequenceGet");
  }

/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectKeyData that results from the BatchRequestNotifyMessageSequenceGetRequest call
 * @return BatchRequestNotifyMessageObjectKeyData resulting from udt call
 *
 */

  public BatchRequestNotifyMessageObjectKeyData getOutput() {
    return BatchRequestNotifyMessageObjectKeyHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
