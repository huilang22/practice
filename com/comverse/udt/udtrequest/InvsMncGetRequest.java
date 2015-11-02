/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncGetRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsMncGetRequest Udt Request
 *
 */

public class InvsMncGetRequest extends InvsMncSubRequestParent {
/**
 *
 * Constructor to create a  InvsMncGetRequest
 * @param id Unique request name
 * @param InvsMncGetIn InvsMncObjectKeyData for InvsMncGetRequest
 *
 */
@JsonCreator
  public InvsMncGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsMnc")InvsMncObjectKeyData InvsMncGetIn) {
    super(id, "InvsMncGet");
    if (InvsMncGetIn != null) {
      addInput("InvsMnc", InvsMncObjectKeyHelper.toMap(InvsMncGetIn, new HashMap(), "InvsMncObjectKeyData").get("InvsMncObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsMncObjectData that results from the InvsMncGetRequest call
 * @return InvsMncObjectData resulting from udt call
 *
 */

  public InvsMncObjectData getOutput() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
}
