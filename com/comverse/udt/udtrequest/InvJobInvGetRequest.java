/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvGetRequest.java
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
 * Class used to create a InvJobInvGetRequest Udt Request
 *
 */

public class InvJobInvGetRequest extends InvJobInvSubRequestParent {
/**
 *
 * Constructor to create a  InvJobInvGetRequest
 * @param id Unique request name
 * @param InvJobInvGetIn InvJobInvObjectKeyData for InvJobInvGetRequest
 *
 */
@JsonCreator
  public InvJobInvGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobInv")InvJobInvObjectKeyData InvJobInvGetIn) {
    super(id, "InvJobInvGet");
    if (InvJobInvGetIn != null) {
      addInput("InvJobInv", InvJobInvObjectKeyHelper.toMap(InvJobInvGetIn, new HashMap(), "InvJobInvObjectKeyData").get("InvJobInvObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvJobInvObjectData that results from the InvJobInvGetRequest call
 * @return InvJobInvObjectData resulting from udt call
 *
 */

  public InvJobInvObjectData getOutput() {
    return InvJobInvObjectHelper.fromMap(outputMap, "InvJobInv");
  }
}
