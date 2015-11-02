/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelDeleteRequest.java
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
 * Class used to create a CitChannelDeleteRequest Udt Request
 *
 */

public class CitChannelDeleteRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a  CitChannelDeleteRequest
 * @param id Unique request name
 * @param citChannelDeleteIn CitChannelObjectKeyData for CitChannelDeleteRequest
 *
 */
@JsonCreator
  public CitChannelDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitChannel")CitChannelObjectKeyData citChannelDeleteIn) {
    super(id, "CitChannelDelete");
    if (citChannelDeleteIn != null) {
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(citChannelDeleteIn, new HashMap(), "CitChannelObjectKeyData").get("CitChannelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitChannelObjectData that results from the CitChannelDeleteRequest call
 * @return CitChannelObjectData resulting from udt call
 *
 */

  public CitChannelObjectData getOutput() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
}
