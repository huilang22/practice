/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerInvDeleteRequest.java
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
 * Class used to create a InvContainerInvDeleteRequest Udt Request
 *
 */

public class InvContainerInvDeleteRequest extends InvContainerInvRequest {
/**
 *
 * Constructor to create a  InvContainerInvDeleteRequest
 * @param id Unique request name
 * @param InvContainerInvDeleteIn InvContainerInvObjectData for InvContainerInvDeleteRequest
 *
 */
@JsonCreator
  public InvContainerInvDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainerInv")InvContainerInvObjectData InvContainerInvDeleteIn) {
    super(id, "InvContainerInvDelete");
    if (InvContainerInvDeleteIn != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(InvContainerInvDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
