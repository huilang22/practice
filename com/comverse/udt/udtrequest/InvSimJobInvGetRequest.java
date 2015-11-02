/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobInvGetRequest.java
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
 * Class used to create a InvSimJobInvGetRequest Udt Request
 *
 */

public class InvSimJobInvGetRequest extends InvSimJobInvSubRequestParent {
/**
 *
 * Constructor to create a  InvSimJobInvGetRequest
 * @param id Unique request name
 * @param InvSimJobInvGetIn InvSimJobInvObjectKeyData for InvSimJobInvGetRequest
 *
 */
@JsonCreator
  public InvSimJobInvGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimJobInv")InvSimJobInvObjectKeyData InvSimJobInvGetIn) {
    super(id, "InvSimJobInvGet");
    if (InvSimJobInvGetIn != null) {
      addInput("InvSimJobInv", InvSimJobInvObjectKeyHelper.toMap(InvSimJobInvGetIn, new HashMap(), "InvSimJobInvObjectKeyData").get("InvSimJobInvObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvSimJobInvObjectData that results from the InvSimJobInvGetRequest call
 * @return InvSimJobInvObjectData resulting from udt call
 *
 */

  public InvSimJobInvObjectData getOutput() {
    return InvSimJobInvObjectHelper.fromMap(outputMap, "InvSimJobInv");
  }
}
