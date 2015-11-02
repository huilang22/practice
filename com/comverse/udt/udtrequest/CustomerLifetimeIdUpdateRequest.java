/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdUpdateRequest.java
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
 * Class used to create a CustomerLifetimeIdUpdateRequest Udt Request
 *
 */

public class CustomerLifetimeIdUpdateRequest extends CustomerLifetimeIdSubRequestParent {
/**
 *
 * Constructor to create a  CustomerLifetimeIdUpdateRequest
 * @param id Unique request name
 * @param CLupdate_In CustomerLifetimeIdObjectData for CustomerLifetimeIdUpdateRequest
 *
 */
@JsonCreator
  public CustomerLifetimeIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerLifetimeId")CustomerLifetimeIdObjectData CLupdate_In) {
    super(id, "CustomerLifetimeIdUpdate");
    if (CLupdate_In != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(CLupdate_In, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }

/**
 *
 * Retrieves the CustomerLifetimeIdObjectData that results from the CustomerLifetimeIdUpdateRequest call
 * @return CustomerLifetimeIdObjectData resulting from udt call
 *
 */

  public CustomerLifetimeIdObjectData getOutput() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
}
