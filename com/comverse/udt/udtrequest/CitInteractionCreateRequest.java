/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionCreateRequest.java
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
 * Class used to create a CitInteractionCreateRequest Udt Request
 *
 */

public class CitInteractionCreateRequest extends CitInteractionSubRequestParent {
/**
 *
 * Constructor to create a  CitInteractionCreateRequest
 * @param id Unique request name
 * @param citInteractionCreateIn CitInteractionObjectData for CitInteractionCreateRequest
 *
 */
@JsonCreator
  public CitInteractionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitInteraction")CitInteractionObjectData citInteractionCreateIn) {
    super(id, "CitInteractionCreate");
    if (citInteractionCreateIn != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(citInteractionCreateIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }

/**
 *
 * Retrieves the CitInteractionObjectData that results from the CitInteractionCreateRequest call
 * @return CitInteractionObjectData resulting from udt call
 *
 */

  public CitInteractionObjectData getOutput() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
}
