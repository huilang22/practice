/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobGetRequest.java
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
 * Class used to create a InvModJobGetRequest Udt Request
 *
 */

public class InvModJobGetRequest extends InvModJobSubRequestParent {
/**
 *
 * Constructor to create a  InvModJobGetRequest
 * @param id Unique request name
 * @param InvModJobGetIn InvModJobObjectKeyData for InvModJobGetRequest
 *
 */
@JsonCreator
  public InvModJobGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvModJob")InvModJobObjectKeyData InvModJobGetIn) {
    super(id, "InvModJobGet");
    if (InvModJobGetIn != null) {
      addInput("InvModJob", InvModJobObjectKeyHelper.toMap(InvModJobGetIn, new HashMap(), "InvModJobObjectKeyData").get("InvModJobObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvModJobObjectData that results from the InvModJobGetRequest call
 * @return InvModJobObjectData resulting from udt call
 *
 */

  public InvModJobObjectData getOutput() {
    return InvModJobObjectHelper.fromMap(outputMap, "InvModJob");
  }
}
