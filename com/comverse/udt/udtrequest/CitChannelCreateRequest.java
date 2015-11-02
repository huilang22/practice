/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelCreateRequest.java
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
 * Class used to create a CitChannelCreateRequest Udt Request
 *
 */

public class CitChannelCreateRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a  CitChannelCreateRequest
 * @param id Unique request name
 * @param citChannelCreateIn CitChannelObjectData for CitChannelCreateRequest
 *
 */
@JsonCreator
  public CitChannelCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitChannel")CitChannelObjectData citChannelCreateIn) {
    super(id, "CitChannelCreate");
    if (citChannelCreateIn != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(citChannelCreateIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }

/**
 *
 * Retrieves the CitChannelObjectData that results from the CitChannelCreateRequest call
 * @return CitChannelObjectData resulting from udt call
 *
 */

  public CitChannelObjectData getOutput() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
}
