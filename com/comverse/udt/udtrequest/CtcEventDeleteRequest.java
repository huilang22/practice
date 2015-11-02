/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventDeleteRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcEventDeleteRequest Udt Request
 *
 */

public class CtcEventDeleteRequest extends CtcEventSubRequestParent {
/**
 *
 * Constructor to create a  CtcEventDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcEventObjectKeyData for CtcEventDeleteRequest
 *
 */
@JsonCreator
  public CtcEventDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcEvent")CtcEventObjectKeyData DeleteIn) {
    super(id, "CtcEventDelete");
    if (DeleteIn != null) {
      addInput("CtcEvent", CtcEventObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcEventObjectKeyData").get("CtcEventObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcEventObjectData that results from the CtcEventDeleteRequest call
 * @return CtcEventObjectData resulting from udt call
 *
 */

  public CtcEventObjectData getOutput() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
}
