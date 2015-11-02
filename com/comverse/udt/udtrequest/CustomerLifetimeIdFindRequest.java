/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdFindRequest.java
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
 * Class used to create a CustomerLifetimeIdFindRequest Udt Request
 *
 */

public class CustomerLifetimeIdFindRequest extends CustomerLifetimeIdRequest {
/**
 *
 * Constructor to create a  CustomerLifetimeIdFindRequest
 * @param id Unique request name
 * @param CLfind_In CustomerLifetimeIdObjectFilter for CustomerLifetimeIdFindRequest
 *
 */
@JsonCreator
  public CustomerLifetimeIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerLifetimeId")CustomerLifetimeIdObjectFilter CLfind_In) {
    super(id, "CustomerLifetimeIdFind");
    if (CLfind_In != null) {
      Integer index =  CLfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(CLfind_In, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }

/**
 *
 * Retrieves the CustomerLifetimeIdObjectDataList that results from the CustomerLifetimeIdFindRequest call
 * @return CustomerLifetimeIdObjectDataList resulting from udt call
 *
 */

  public CustomerLifetimeIdObjectDataList getOutput() {
    return CustomerLifetimeIdObjectHelper.fromMapList(outputMap, "CustomerLifetimeIdList");
  }
}
