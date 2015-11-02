/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesGetRequest.java
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
 * Class used to create a AbiBillMessagesGetRequest Udt Request
 *
 */

public class AbiBillMessagesGetRequest extends AbiBillMessagesSubRequestParent {
/**
 *
 * Constructor to create a  AbiBillMessagesGetRequest
 * @param id Unique request name
 * @param AbiBillMessagesGetIn AbiBillMessagesObjectKeyData for AbiBillMessagesGetRequest
 *
 */
@JsonCreator
  public AbiBillMessagesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiBillMessages")AbiBillMessagesObjectKeyData AbiBillMessagesGetIn) {
    super(id, "AbiBillMessagesGet");
    if (AbiBillMessagesGetIn != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectKeyHelper.toMap(AbiBillMessagesGetIn, new HashMap(), "AbiBillMessagesObjectKeyData").get("AbiBillMessagesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AbiBillMessagesObjectData that results from the AbiBillMessagesGetRequest call
 * @return AbiBillMessagesObjectData resulting from udt call
 *
 */

  public AbiBillMessagesObjectData getOutput() {
    return AbiBillMessagesObjectHelper.fromMap(outputMap, "AbiBillMessages");
  }
}
