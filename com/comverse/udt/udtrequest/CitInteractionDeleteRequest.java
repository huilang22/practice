/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionDeleteRequest.java
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
 * Class used to create a CitInteractionDeleteRequest Udt Request
 *
 */

public class CitInteractionDeleteRequest extends CitInteractionSubRequestParent {
/**
 *
 * Constructor to create a  CitInteractionDeleteRequest
 * @param id Unique request name
 * @param citInteractionDeleteIn CitInteractionObjectKeyData for CitInteractionDeleteRequest
 *
 */
@JsonCreator
  public CitInteractionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitInteraction")CitInteractionObjectKeyData citInteractionDeleteIn) {
    super(id, "CitInteractionDelete");
    if (citInteractionDeleteIn != null) {
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(citInteractionDeleteIn, new HashMap(), "CitInteractionObjectKeyData").get("CitInteractionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitInteractionObjectData that results from the CitInteractionDeleteRequest call
 * @return CitInteractionObjectData resulting from udt call
 *
 */

  public CitInteractionObjectData getOutput() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
}
