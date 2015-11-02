/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventGetRequest.java
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
 * Class used to create a CtcEventGetRequest Udt Request
 *
 */

public class CtcEventGetRequest extends CtcEventSubRequestParent {
/**
 *
 * Constructor to create a  CtcEventGetRequest
 * @param id Unique request name
 * @param GetIn CtcEventObjectKeyData for CtcEventGetRequest
 *
 */
@JsonCreator
  public CtcEventGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcEvent")CtcEventObjectKeyData GetIn) {
    super(id, "CtcEventGet");
    if (GetIn != null) {
      addInput("CtcEvent", CtcEventObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcEventObjectKeyData").get("CtcEventObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcEventObjectData that results from the CtcEventGetRequest call
 * @return CtcEventObjectData resulting from udt call
 *
 */

  public CtcEventObjectData getOutput() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
}
