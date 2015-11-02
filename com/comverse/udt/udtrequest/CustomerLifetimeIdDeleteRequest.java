/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdDeleteRequest.java
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
 * Class used to create a CustomerLifetimeIdDeleteRequest Udt Request
 *
 */

public class CustomerLifetimeIdDeleteRequest extends CustomerLifetimeIdSubRequestParent {
/**
 *
 * Constructor to create a  CustomerLifetimeIdDeleteRequest
 * @param id Unique request name
 * @param CLdelete_In CustomerLifetimeIdObjectKeyData for CustomerLifetimeIdDeleteRequest
 *
 */
@JsonCreator
  public CustomerLifetimeIdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerLifetimeId")CustomerLifetimeIdObjectKeyData CLdelete_In) {
    super(id, "CustomerLifetimeIdDelete");
    if (CLdelete_In != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectKeyHelper.toMap(CLdelete_In, new HashMap(), "CustomerLifetimeIdObjectKeyData").get("CustomerLifetimeIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CustomerLifetimeIdObjectData that results from the CustomerLifetimeIdDeleteRequest call
 * @return CustomerLifetimeIdObjectData resulting from udt call
 *
 */

  public CustomerLifetimeIdObjectData getOutput() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
}
