/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeUpdateRequest.java
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
 * Class used to create a BatchNotifyEventTypeUpdateRequest Udt Request
 *
 */

public class BatchNotifyEventTypeUpdateRequest extends BatchNotifyEventTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyEventTypeUpdateRequest
 * @param id Unique request name
 * @param batchNotifyEventTypeUpdateIn BatchNotifyEventTypeObjectData for BatchNotifyEventTypeUpdateRequest
 *
 */
@JsonCreator
  public BatchNotifyEventTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyEventType")BatchNotifyEventTypeObjectData batchNotifyEventTypeUpdateIn) {
    super(id, "BatchNotifyEventTypeUpdate");
    if (batchNotifyEventTypeUpdateIn != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(batchNotifyEventTypeUpdateIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyEventTypeObjectData that results from the BatchNotifyEventTypeUpdateRequest call
 * @return BatchNotifyEventTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyEventTypeObjectData getOutput() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
}
