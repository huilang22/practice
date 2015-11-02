/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerDeleteRequest.java
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
 * Class used to create a InvContainerDeleteRequest Udt Request
 *
 */

public class InvContainerDeleteRequest extends InvContainerRequest {
/**
 *
 * Constructor to create a  InvContainerDeleteRequest
 * @param id Unique request name
 * @param InvContainerDeleteIn InvContainerObjectData for InvContainerDeleteRequest
 *
 */
@JsonCreator
  public InvContainerDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainer")InvContainerObjectData InvContainerDeleteIn) {
    super(id, "InvContainerDelete");
    if (InvContainerDeleteIn != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
