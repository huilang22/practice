/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGetRequest.java
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
 * Class used to create a UsageTypeGetRequest Udt Request
 *
 */

public class UsageTypeGetRequest extends UsageTypeSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeGetRequest
 * @param id Unique request name
 * @param utGetIn UsageTypeObjectKeyData for UsageTypeGetRequest
 *
 */
@JsonCreator
  public UsageTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageType")UsageTypeObjectKeyData utGetIn) {
    super(id, "UsageTypeGet");
    if (utGetIn != null) {
      addInput("UsageType", UsageTypeObjectKeyHelper.toMap(utGetIn, new HashMap(), "UsageTypeObjectKeyData").get("UsageTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageTypeObjectData that results from the UsageTypeGetRequest call
 * @return UsageTypeObjectData resulting from udt call
 *
 */

  public UsageTypeObjectData getOutput() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
}
