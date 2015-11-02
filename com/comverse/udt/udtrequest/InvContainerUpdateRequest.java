/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerUpdateRequest.java
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
 * Class used to create a InvContainerUpdateRequest Udt Request
 *
 */

public class InvContainerUpdateRequest extends InvContainerRequest {
/**
 *
 * Constructor to create a  InvContainerUpdateRequest
 * @param id Unique request name
 * @param InvContainerUpdateIn InvContainerObjectData for InvContainerUpdateRequest
 *
 */
@JsonCreator
  public InvContainerUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainer")InvContainerObjectData InvContainerUpdateIn) {
    super(id, "InvContainerUpdate");
    if (InvContainerUpdateIn != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerUpdateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
