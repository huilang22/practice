/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelUpdateRequest.java
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
 * Class used to create a CitChannelUpdateRequest Udt Request
 *
 */

public class CitChannelUpdateRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a  CitChannelUpdateRequest
 * @param id Unique request name
 * @param citChannelUpdateIn CitChannelObjectData for CitChannelUpdateRequest
 *
 */
@JsonCreator
  public CitChannelUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitChannel")CitChannelObjectData citChannelUpdateIn) {
    super(id, "CitChannelUpdate");
    if (citChannelUpdateIn != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(citChannelUpdateIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }

/**
 *
 * Retrieves the CitChannelObjectData that results from the CitChannelUpdateRequest call
 * @return CitChannelObjectData resulting from udt call
 *
 */

  public CitChannelObjectData getOutput() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
}
