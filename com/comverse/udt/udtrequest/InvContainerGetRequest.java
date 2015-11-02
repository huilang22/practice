/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerGetRequest.java
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
 * Class used to create a InvContainerGetRequest Udt Request
 *
 */

public class InvContainerGetRequest extends InvContainerSubRequestParent {
/**
 *
 * Constructor to create a  InvContainerGetRequest
 * @param id Unique request name
 * @param InvContainerGetIn InvContainerObjectKeyData for InvContainerGetRequest
 *
 */
@JsonCreator
  public InvContainerGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainer")InvContainerObjectKeyData InvContainerGetIn) {
    super(id, "InvContainerGet");
    if (InvContainerGetIn != null) {
      addInput("InvContainer", InvContainerObjectKeyHelper.toMap(InvContainerGetIn, new HashMap(), "InvContainerObjectKeyData").get("InvContainerObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvContainerObjectData that results from the InvContainerGetRequest call
 * @return InvContainerObjectData resulting from udt call
 *
 */

  public InvContainerObjectData getOutput() {
    return InvContainerObjectHelper.fromMap(outputMap, "InvContainer");
  }
}
