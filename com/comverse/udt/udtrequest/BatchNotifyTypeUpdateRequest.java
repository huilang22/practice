/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeUpdateRequest.java
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
 * Class used to create a BatchNotifyTypeUpdateRequest Udt Request
 *
 */

public class BatchNotifyTypeUpdateRequest extends BatchNotifyTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyTypeUpdateRequest
 * @param id Unique request name
 * @param batchNotifyTypeUpdateIn BatchNotifyTypeObjectData for BatchNotifyTypeUpdateRequest
 *
 */
@JsonCreator
  public BatchNotifyTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyType")BatchNotifyTypeObjectData batchNotifyTypeUpdateIn) {
    super(id, "BatchNotifyTypeUpdate");
    if (batchNotifyTypeUpdateIn != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(batchNotifyTypeUpdateIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyTypeObjectData that results from the BatchNotifyTypeUpdateRequest call
 * @return BatchNotifyTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyTypeObjectData getOutput() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
}
