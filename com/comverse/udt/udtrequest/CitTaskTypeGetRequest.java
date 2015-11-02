/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeGetRequest.java
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
 * Class used to create a CitTaskTypeGetRequest Udt Request
 *
 */

public class CitTaskTypeGetRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskTypeGetRequest
 * @param id Unique request name
 * @param citTaskTypeGetIn CitTaskTypeObjectKeyData for CitTaskTypeGetRequest
 *
 */
@JsonCreator
  public CitTaskTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskType")CitTaskTypeObjectKeyData citTaskTypeGetIn) {
    super(id, "CitTaskTypeGet");
    if (citTaskTypeGetIn != null) {
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(citTaskTypeGetIn, new HashMap(), "CitTaskTypeObjectKeyData").get("CitTaskTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitTaskTypeObjectData that results from the CitTaskTypeGetRequest call
 * @return CitTaskTypeObjectData resulting from udt call
 *
 */

  public CitTaskTypeObjectData getOutput() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
}
