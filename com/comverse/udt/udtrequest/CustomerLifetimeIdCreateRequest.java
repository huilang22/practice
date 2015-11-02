/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdCreateRequest.java
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
 * Class used to create a CustomerLifetimeIdCreateRequest Udt Request
 *
 */

public class CustomerLifetimeIdCreateRequest extends CustomerLifetimeIdSubRequestParent {
/**
 *
 * Constructor to create a  CustomerLifetimeIdCreateRequest
 * @param id Unique request name
 * @param CLcreate_In CustomerLifetimeIdObjectData for CustomerLifetimeIdCreateRequest
 *
 */
@JsonCreator
  public CustomerLifetimeIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerLifetimeId")CustomerLifetimeIdObjectData CLcreate_In) {
    super(id, "CustomerLifetimeIdCreate");
    if (CLcreate_In != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(CLcreate_In, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }

/**
 *
 * Retrieves the CustomerLifetimeIdObjectData that results from the CustomerLifetimeIdCreateRequest call
 * @return CustomerLifetimeIdObjectData resulting from udt call
 *
 */

  public CustomerLifetimeIdObjectData getOutput() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
}
