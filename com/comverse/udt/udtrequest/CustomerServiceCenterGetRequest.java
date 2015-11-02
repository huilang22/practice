/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CustomerServiceCenterGetRequest Udt Request
 *
 */

public class CustomerServiceCenterGetRequest extends CustomerServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a  CustomerServiceCenterGetRequest
 * @param id Unique request name
 * @param CSCgetIn CustomerServiceCenterObjectKeyData for CustomerServiceCenterGetRequest
 *
 */
@JsonCreator
  public CustomerServiceCenterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerServiceCenter")CustomerServiceCenterObjectKeyData CSCgetIn) {
    super(id, "CustomerServiceCenterGet");
    if (CSCgetIn != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectKeyHelper.toMap(CSCgetIn, new HashMap(), "CustomerServiceCenterObjectKeyData").get("CustomerServiceCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CustomerServiceCenterObjectData that results from the CustomerServiceCenterGetRequest call
 * @return CustomerServiceCenterObjectData resulting from udt call
 *
 */

  public CustomerServiceCenterObjectData getOutput() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
}
