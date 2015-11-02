/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterUpdateRequest.java
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
 * Class used to create a CustomerServiceCenterUpdateRequest Udt Request
 *
 */

public class CustomerServiceCenterUpdateRequest extends CustomerServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a  CustomerServiceCenterUpdateRequest
 * @param id Unique request name
 * @param CSCupdateIn CustomerServiceCenterObjectData for CustomerServiceCenterUpdateRequest
 *
 */
@JsonCreator
  public CustomerServiceCenterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerServiceCenter")CustomerServiceCenterObjectData CSCupdateIn) {
    super(id, "CustomerServiceCenterUpdate");
    if (CSCupdateIn != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(CSCupdateIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }

/**
 *
 * Retrieves the CustomerServiceCenterObjectData that results from the CustomerServiceCenterUpdateRequest call
 * @return CustomerServiceCenterObjectData resulting from udt call
 *
 */

  public CustomerServiceCenterObjectData getOutput() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
}
