/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionGetRequest.java
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
 * Class used to create a CitInteractionGetRequest Udt Request
 *
 */

public class CitInteractionGetRequest extends CitInteractionSubRequestParent {
/**
 *
 * Constructor to create a  CitInteractionGetRequest
 * @param id Unique request name
 * @param citInteractionGetIn CitInteractionObjectKeyData for CitInteractionGetRequest
 *
 */
@JsonCreator
  public CitInteractionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitInteraction")CitInteractionObjectKeyData citInteractionGetIn) {
    super(id, "CitInteractionGet");
    if (citInteractionGetIn != null) {
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(citInteractionGetIn, new HashMap(), "CitInteractionObjectKeyData").get("CitInteractionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitInteractionObjectData that results from the CitInteractionGetRequest call
 * @return CitInteractionObjectData resulting from udt call
 *
 */

  public CitInteractionObjectData getOutput() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
}
