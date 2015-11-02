/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeCreateRequest.java
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
 * Class used to create a BatchNotifyTypeCreateRequest Udt Request
 *
 */

public class BatchNotifyTypeCreateRequest extends BatchNotifyTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchNotifyTypeCreateRequest
 * @param id Unique request name
 * @param BatchNotifyTypeCreateIn BatchNotifyTypeObjectData for BatchNotifyTypeCreateRequest
 *
 */
@JsonCreator
  public BatchNotifyTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyType")BatchNotifyTypeObjectData BatchNotifyTypeCreateIn) {
    super(id, "BatchNotifyTypeCreate");
    if (BatchNotifyTypeCreateIn != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(BatchNotifyTypeCreateIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyTypeObjectData that results from the BatchNotifyTypeCreateRequest call
 * @return BatchNotifyTypeObjectData resulting from udt call
 *
 */

  public BatchNotifyTypeObjectData getOutput() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
}
