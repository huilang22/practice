/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeGetRequest.java
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
 * Class used to create a BatchNotifyEventTypeGetRequest Udt Request
 *
 */

public class BatchNotifyEventTypeGetRequest extends BatchNotifyEventTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyEventTypeGetRequest
 * @param id Unique request name
 * @param batchNotifyEventTypeGetIn BatchNotifyEventTypeObjectKeyData for BatchNotifyEventTypeGetRequest
 *
 */
@JsonCreator
  public BatchNotifyEventTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyEventType")BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeGetIn) {
    super(id, "BatchNotifyEventTypeGet");
    if (batchNotifyEventTypeGetIn != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectKeyHelper.toMap(batchNotifyEventTypeGetIn, new HashMap(), "BatchNotifyEventTypeObjectKeyData").get("BatchNotifyEventTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyEventTypeObjectData that results from the BatchNotifyEventTypeGetRequest call
 * @return BatchNotifyEventTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyEventTypeObjectData getOutput() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
}
