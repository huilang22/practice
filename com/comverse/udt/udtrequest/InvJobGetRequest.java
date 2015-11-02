/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobGetRequest.java
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
 * Class used to create a InvJobGetRequest Udt Request
 *
 */

public class InvJobGetRequest extends InvJobSubRequestParent {
/**
 *
 * Constructor to create a  InvJobGetRequest
 * @param id Unique request name
 * @param InvJobGetIn InvJobObjectKeyData for InvJobGetRequest
 *
 */
@JsonCreator
  public InvJobGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJob")InvJobObjectKeyData InvJobGetIn) {
    super(id, "InvJobGet");
    if (InvJobGetIn != null) {
      addInput("InvJob", InvJobObjectKeyHelper.toMap(InvJobGetIn, new HashMap(), "InvJobObjectKeyData").get("InvJobObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvJobObjectData that results from the InvJobGetRequest call
 * @return InvJobObjectData resulting from udt call
 *
 */

  public InvJobObjectData getOutput() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
}
