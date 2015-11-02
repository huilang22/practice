/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorGetRequest.java
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
 * Class used to create a InvJobErrorGetRequest Udt Request
 *
 */

public class InvJobErrorGetRequest extends InvJobErrorSubRequestParent {
/**
 *
 * Constructor to create a  InvJobErrorGetRequest
 * @param id Unique request name
 * @param InvJobErrorGetIn InvJobErrorObjectKeyData for InvJobErrorGetRequest
 *
 */
@JsonCreator
  public InvJobErrorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobError")InvJobErrorObjectKeyData InvJobErrorGetIn) {
    super(id, "InvJobErrorGet");
    if (InvJobErrorGetIn != null) {
      addInput("InvJobError", InvJobErrorObjectKeyHelper.toMap(InvJobErrorGetIn, new HashMap(), "InvJobErrorObjectKeyData").get("InvJobErrorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvJobErrorObjectData that results from the InvJobErrorGetRequest call
 * @return InvJobErrorObjectData resulting from udt call
 *
 */

  public InvJobErrorObjectData getOutput() {
    return InvJobErrorObjectHelper.fromMap(outputMap, "InvJobError");
  }
}
