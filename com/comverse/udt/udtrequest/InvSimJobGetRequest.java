/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobGetRequest.java
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
 * Class used to create a InvSimJobGetRequest Udt Request
 *
 */

public class InvSimJobGetRequest extends InvSimJobSubRequestParent {
/**
 *
 * Constructor to create a  InvSimJobGetRequest
 * @param id Unique request name
 * @param InvSimJobGetIn InvSimJobObjectKeyData for InvSimJobGetRequest
 *
 */
@JsonCreator
  public InvSimJobGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimJob")InvSimJobObjectKeyData InvSimJobGetIn) {
    super(id, "InvSimJobGet");
    if (InvSimJobGetIn != null) {
      addInput("InvSimJob", InvSimJobObjectKeyHelper.toMap(InvSimJobGetIn, new HashMap(), "InvSimJobObjectKeyData").get("InvSimJobObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvSimJobObjectData that results from the InvSimJobGetRequest call
 * @return InvSimJobObjectData resulting from udt call
 *
 */

  public InvSimJobObjectData getOutput() {
    return InvSimJobObjectHelper.fromMap(outputMap, "InvSimJob");
  }
}
