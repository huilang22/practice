/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a TicklerGetRequest Udt Request
 *
 */

public class TicklerGetRequest extends TicklerSubRequestParent {
/**
 *
 * Constructor to create a  TicklerGetRequest
 * @param id Unique request name
 * @param getIn TicklerObjectKeyData for TicklerGetRequest
 *
 */
@JsonCreator
  public TicklerGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Tickler")TicklerObjectKeyData getIn) {
    super(id, "TicklerGet");
    if (getIn != null) {
      addInput("Tickler", TicklerObjectKeyHelper.toMap(getIn, new HashMap(), "TicklerObjectKeyData").get("TicklerObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TicklerObjectData that results from the TicklerGetRequest call
 * @return TicklerObjectData resulting from udt call
 *
 */

  public TicklerObjectData getOutput() {
    return TicklerObjectHelper.fromMap(outputMap, "Tickler");
  }
}
