/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelGetRequest.java
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
 * Class used to create a CitChannelGetRequest Udt Request
 *
 */

public class CitChannelGetRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a  CitChannelGetRequest
 * @param id Unique request name
 * @param citChannelGetIn CitChannelObjectKeyData for CitChannelGetRequest
 *
 */
@JsonCreator
  public CitChannelGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitChannel")CitChannelObjectKeyData citChannelGetIn) {
    super(id, "CitChannelGet");
    if (citChannelGetIn != null) {
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(citChannelGetIn, new HashMap(), "CitChannelObjectKeyData").get("CitChannelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitChannelObjectData that results from the CitChannelGetRequest call
 * @return CitChannelObjectData resulting from udt call
 *
 */

  public CitChannelObjectData getOutput() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
}
