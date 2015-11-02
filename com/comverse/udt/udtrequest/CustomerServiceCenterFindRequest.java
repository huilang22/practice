/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterFindRequest.java
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
 * Class used to create a CustomerServiceCenterFindRequest Udt Request
 *
 */

public class CustomerServiceCenterFindRequest extends CustomerServiceCenterRequest {
/**
 *
 * Constructor to create a  CustomerServiceCenterFindRequest
 * @param id Unique request name
 * @param CSCfindIn CustomerServiceCenterObjectFilter for CustomerServiceCenterFindRequest
 *
 */
@JsonCreator
  public CustomerServiceCenterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerServiceCenter")CustomerServiceCenterObjectFilter CSCfindIn) {
    super(id, "CustomerServiceCenterFind");
    if (CSCfindIn != null) {
      Integer index =  CSCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(CSCfindIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }

/**
 *
 * Retrieves the CustomerServiceCenterObjectDataList that results from the CustomerServiceCenterFindRequest call
 * @return CustomerServiceCenterObjectDataList resulting from udt call
 *
 */

  public CustomerServiceCenterObjectDataList getOutput() {
    return CustomerServiceCenterObjectHelper.fromMapList(outputMap, "CustomerServiceCenterList");
  }
}
