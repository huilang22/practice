/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerCreateRequest.java
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
 * Class used to create a TicklerCreateRequest Udt Request
 *
 */

public class TicklerCreateRequest extends TicklerSubRequestParent {
/**
 *
 * Constructor to create a  TicklerCreateRequest
 * @param id Unique request name
 * @param ticCrIn TicklerObjectData for TicklerCreateRequest
 *
 */
@JsonCreator
  public TicklerCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Tickler")TicklerObjectData ticCrIn) {
    super(id, "TicklerCreate");
    if (ticCrIn != null) {
      addInput("Tickler", TicklerObjectHelper.toMap(ticCrIn, new HashMap(), "Tickler").get("Tickler"));
    }
  }

/**
 *
 * Retrieves the TicklerObjectData that results from the TicklerCreateRequest call
 * @return TicklerObjectData resulting from udt call
 *
 */

  public TicklerObjectData getOutput() {
    return TicklerObjectHelper.fromMap(outputMap, "Tickler");
  }
}
