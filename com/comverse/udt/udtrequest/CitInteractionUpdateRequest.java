/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionUpdateRequest.java
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
 * Class used to create a CitInteractionUpdateRequest Udt Request
 *
 */

public class CitInteractionUpdateRequest extends CitInteractionSubRequestParent {
/**
 *
 * Constructor to create a  CitInteractionUpdateRequest
 * @param id Unique request name
 * @param citInteractionUpdateIn CitInteractionObjectData for CitInteractionUpdateRequest
 *
 */
@JsonCreator
  public CitInteractionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitInteraction")CitInteractionObjectData citInteractionUpdateIn) {
    super(id, "CitInteractionUpdate");
    if (citInteractionUpdateIn != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(citInteractionUpdateIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }

/**
 *
 * Retrieves the CitInteractionObjectData that results from the CitInteractionUpdateRequest call
 * @return CitInteractionObjectData resulting from udt call
 *
 */

  public CitInteractionObjectData getOutput() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
}
