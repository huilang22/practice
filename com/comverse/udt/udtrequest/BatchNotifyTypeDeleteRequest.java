/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeDeleteRequest.java
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
 * Class used to create a BatchNotifyTypeDeleteRequest Udt Request
 *
 */

public class BatchNotifyTypeDeleteRequest extends BatchNotifyTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyTypeDeleteRequest
 * @param id Unique request name
 * @param batchNotifyTypeDeleteIn BatchNotifyTypeObjectKeyData for BatchNotifyTypeDeleteRequest
 *
 */
@JsonCreator
  public BatchNotifyTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyType")BatchNotifyTypeObjectKeyData batchNotifyTypeDeleteIn) {
    super(id, "BatchNotifyTypeDelete");
    if (batchNotifyTypeDeleteIn != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectKeyHelper.toMap(batchNotifyTypeDeleteIn, new HashMap(), "BatchNotifyTypeObjectKeyData").get("BatchNotifyTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyTypeObjectData that results from the BatchNotifyTypeDeleteRequest call
 * @return BatchNotifyTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyTypeObjectData getOutput() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
}
