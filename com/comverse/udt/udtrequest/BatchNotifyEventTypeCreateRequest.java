/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeCreateRequest.java
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
 * Class used to create a BatchNotifyEventTypeCreateRequest Udt Request
 *
 */

public class BatchNotifyEventTypeCreateRequest extends BatchNotifyEventTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyEventTypeCreateRequest
 * @param id Unique request name
 * @param BatchNotifyEventTypeCreateIn BatchNotifyEventTypeObjectData for BatchNotifyEventTypeCreateRequest
 *
 */
@JsonCreator
  public BatchNotifyEventTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyEventType")BatchNotifyEventTypeObjectData BatchNotifyEventTypeCreateIn) {
    super(id, "BatchNotifyEventTypeCreate");
    if (BatchNotifyEventTypeCreateIn != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(BatchNotifyEventTypeCreateIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyEventTypeObjectData that results from the BatchNotifyEventTypeCreateRequest call
 * @return BatchNotifyEventTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyEventTypeObjectData getOutput() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
}
