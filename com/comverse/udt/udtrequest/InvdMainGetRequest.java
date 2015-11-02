/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainGetRequest.java
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
 * Class used to create a InvdMainGetRequest Udt Request
 *
 */

public class InvdMainGetRequest extends InvdMainSubRequestParent {
/**
 *
 * Constructor to create a  InvdMainGetRequest
 * @param id Unique request name
 * @param InvdMainGetIn InvdMainObjectKeyData for InvdMainGetRequest
 *
 */
@JsonCreator
  public InvdMainGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMain")InvdMainObjectKeyData InvdMainGetIn) {
    super(id, "InvdMainGet");
    if (InvdMainGetIn != null) {
      addInput("InvdMain", InvdMainObjectKeyHelper.toMap(InvdMainGetIn, new HashMap(), "InvdMainObjectKeyData").get("InvdMainObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdMainObjectData that results from the InvdMainGetRequest call
 * @return InvdMainObjectData resulting from udt call
 *
 */

  public InvdMainObjectData getOutput() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
}
