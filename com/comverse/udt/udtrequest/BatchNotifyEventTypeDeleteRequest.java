/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeDeleteRequest.java
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
 * Class used to create a BatchNotifyEventTypeDeleteRequest Udt Request
 *
 */

public class BatchNotifyEventTypeDeleteRequest extends BatchNotifyEventTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyEventTypeDeleteRequest
 * @param id Unique request name
 * @param batchNotifyEventTypeDeleteIn BatchNotifyEventTypeObjectKeyData for BatchNotifyEventTypeDeleteRequest
 *
 */
@JsonCreator
  public BatchNotifyEventTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyEventType")BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeDeleteIn) {
    super(id, "BatchNotifyEventTypeDelete");
    if (batchNotifyEventTypeDeleteIn != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectKeyHelper.toMap(batchNotifyEventTypeDeleteIn, new HashMap(), "BatchNotifyEventTypeObjectKeyData").get("BatchNotifyEventTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyEventTypeObjectData that results from the BatchNotifyEventTypeDeleteRequest call
 * @return BatchNotifyEventTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyEventTypeObjectData getOutput() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
}
