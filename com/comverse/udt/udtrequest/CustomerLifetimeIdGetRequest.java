/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdGetRequest.java
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
 * Class used to create a CustomerLifetimeIdGetRequest Udt Request
 *
 */

public class CustomerLifetimeIdGetRequest extends CustomerLifetimeIdSubRequestParent {
/**
 *
 * Constructor to create a  CustomerLifetimeIdGetRequest
 * @param id Unique request name
 * @param CLget_In CustomerLifetimeIdObjectKeyData for CustomerLifetimeIdGetRequest
 *
 */
@JsonCreator
  public CustomerLifetimeIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerLifetimeId")CustomerLifetimeIdObjectKeyData CLget_In) {
    super(id, "CustomerLifetimeIdGet");
    if (CLget_In != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectKeyHelper.toMap(CLget_In, new HashMap(), "CustomerLifetimeIdObjectKeyData").get("CustomerLifetimeIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CustomerLifetimeIdObjectData that results from the CustomerLifetimeIdGetRequest call
 * @return CustomerLifetimeIdObjectData resulting from udt call
 *
 */

  public CustomerLifetimeIdObjectData getOutput() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
}
