/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeGetRequest.java
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
 * Class used to create a BatchNotifyTypeGetRequest Udt Request
 *
 */

public class BatchNotifyTypeGetRequest extends BatchNotifyTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyTypeGetRequest
 * @param id Unique request name
 * @param batchNotifyTypeGetIn BatchNotifyTypeObjectKeyData for BatchNotifyTypeGetRequest
 *
 */
@JsonCreator
  public BatchNotifyTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyType")BatchNotifyTypeObjectKeyData batchNotifyTypeGetIn) {
    super(id, "BatchNotifyTypeGet");
    if (batchNotifyTypeGetIn != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectKeyHelper.toMap(batchNotifyTypeGetIn, new HashMap(), "BatchNotifyTypeObjectKeyData").get("BatchNotifyTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyTypeObjectData that results from the BatchNotifyTypeGetRequest call
 * @return BatchNotifyTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyTypeObjectData getOutput() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
}
