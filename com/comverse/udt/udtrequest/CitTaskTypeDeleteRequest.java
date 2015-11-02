/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeDeleteRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitTaskTypeDeleteRequest Udt Request
 *
 */

public class CitTaskTypeDeleteRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskTypeDeleteRequest
 * @param id Unique request name
 * @param citTaskTypeDeleteIn CitTaskTypeObjectKeyData for CitTaskTypeDeleteRequest
 *
 */
@JsonCreator
  public CitTaskTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskType")CitTaskTypeObjectKeyData citTaskTypeDeleteIn) {
    super(id, "CitTaskTypeDelete");
    if (citTaskTypeDeleteIn != null) {
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(citTaskTypeDeleteIn, new HashMap(), "CitTaskTypeObjectKeyData").get("CitTaskTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitTaskTypeObjectData that results from the CitTaskTypeDeleteRequest call
 * @return CitTaskTypeObjectData resulting from udt call
 *
 */

  public CitTaskTypeObjectData getOutput() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
}
