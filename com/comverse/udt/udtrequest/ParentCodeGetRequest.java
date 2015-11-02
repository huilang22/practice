/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ParentCodeGetRequest Udt Request
 *
 */

public class ParentCodeGetRequest extends ParentCodeSubRequestParent {
/**
 *
 * Constructor to create a  ParentCodeGetRequest
 * @param id Unique request name
 * @param ParentCodeGetIn ParentCodeObjectKeyData for ParentCodeGetRequest
 *
 */
@JsonCreator
  public ParentCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ParentCode")ParentCodeObjectKeyData ParentCodeGetIn) {
    super(id, "ParentCodeGet");
    if (ParentCodeGetIn != null) {
      addInput("ParentCode", ParentCodeObjectKeyHelper.toMap(ParentCodeGetIn, new HashMap(), "ParentCodeObjectKeyData").get("ParentCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ParentCodeObjectData that results from the ParentCodeGetRequest call
 * @return ParentCodeObjectData resulting from udt call
 *
 */

  public ParentCodeObjectData getOutput() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
}
