/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AbiBillMessagesUpdateRequest Udt Request
 *
 */

public class AbiBillMessagesUpdateRequest extends AbiBillMessagesSubRequestParent {
/**
 *
 * Constructor to create a  AbiBillMessagesUpdateRequest
 * @param id Unique request name
 * @param AbiBillMessagesUpdateIn AbiBillMessagesObjectData for AbiBillMessagesUpdateRequest
 *
 */
@JsonCreator
  public AbiBillMessagesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiBillMessages")AbiBillMessagesObjectData AbiBillMessagesUpdateIn) {
    super(id, "AbiBillMessagesUpdate");
    if (AbiBillMessagesUpdateIn != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(AbiBillMessagesUpdateIn, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }

/**
 *
 * Retrieves the AbiBillMessagesObjectData that results from the AbiBillMessagesUpdateRequest call
 * @return AbiBillMessagesObjectData resulting from udt call
 *
 */

  public AbiBillMessagesObjectData getOutput() {
    return AbiBillMessagesObjectHelper.fromMap(outputMap, "AbiBillMessages");
  }
}
