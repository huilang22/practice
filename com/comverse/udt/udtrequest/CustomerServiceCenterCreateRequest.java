/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterCreateRequest.java
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
 * Class used to create a CustomerServiceCenterCreateRequest Udt Request
 *
 */

public class CustomerServiceCenterCreateRequest extends CustomerServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a  CustomerServiceCenterCreateRequest
 * @param id Unique request name
 * @param CSCcreateIn CustomerServiceCenterObjectData for CustomerServiceCenterCreateRequest
 *
 */
@JsonCreator
  public CustomerServiceCenterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerServiceCenter")CustomerServiceCenterObjectData CSCcreateIn) {
    super(id, "CustomerServiceCenterCreate");
    if (CSCcreateIn != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(CSCcreateIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }

/**
 *
 * Retrieves the CustomerServiceCenterObjectData that results from the CustomerServiceCenterCreateRequest call
 * @return CustomerServiceCenterObjectData resulting from udt call
 *
 */

  public CustomerServiceCenterObjectData getOutput() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
}
