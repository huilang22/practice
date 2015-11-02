/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtUrlFindRequest.java
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
 * Class used to create a CustomerDtUrlFindRequest Udt Request
 *
 */

public class CustomerDtUrlFindRequest extends CustomerDtUrlRequest {
/**
 *
 * Constructor to create a  CustomerDtUrlFindRequest
 * @param id Unique request name
 * @param CustomerDtUrlFindIn CustomerDtUrlInputObjectFilter for CustomerDtUrlFindRequest
 *
 */
@JsonCreator
  public CustomerDtUrlFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerDtUrlFindIn")CustomerDtUrlInputObjectFilter CustomerDtUrlFindIn) {
    super(id, "CustomerDtUrlFind");
    if (CustomerDtUrlFindIn != null) {
      Integer index =  CustomerDtUrlFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerDtUrlFindIn", CustomerDtUrlInputObjectHelper.toMap(CustomerDtUrlFindIn, new HashMap(), "CustomerDtUrl").get("CustomerDtUrl"));
    }
  }

/**
 *
 * Retrieves the CustomerDtUrlObjectDataList that results from the CustomerDtUrlFindRequest call
 * @return CustomerDtUrlObjectDataList resulting from udt call
 *
 */

  public CustomerDtUrlObjectDataList getOutput() {
    return CustomerDtUrlObjectHelper.fromMapList(outputMap, "CustomerDtUrlList");
  }
}
