/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskGetRequest.java
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
 * Class used to create a CitTaskGetRequest Udt Request
 *
 */

public class CitTaskGetRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskGetRequest
 * @param id Unique request name
 * @param citTaskGetIn CitTaskObjectBaseKeyData for CitTaskGetRequest
 *
 */
@JsonCreator
  public CitTaskGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTask")CitTaskObjectBaseKeyData citTaskGetIn) {
    super(id, "CitTaskGet");
    if (citTaskGetIn != null) {
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(citTaskGetIn, new HashMap(), "CitTaskObjectBaseKeyData").get("CitTaskObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the CitTaskObjectData that results from the CitTaskGetRequest call
 * @return CitTaskObjectData resulting from udt call
 *
 */

  public CitTaskObjectData getOutput() {
    return CitTaskObjectHelper.fromMap(outputMap, "CitTask");
  }
}
