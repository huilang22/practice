/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageFindRequest.java
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
 * Class used to create a AccountMessageFindRequest Udt Request
 *
 */

public class AccountMessageFindRequest extends AccountMessageRequest {
/**
 *
 * Constructor to create a  AccountMessageFindRequest
 * @param id Unique request name
 * @param AMfindIn AccountMessageObjectFilter for AccountMessageFindRequest
 *
 */
@JsonCreator
  public AccountMessageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountMessage")AccountMessageObjectFilter AMfindIn) {
    super(id, "AccountMessageFind");
    if (AMfindIn != null) {
      Integer index =  AMfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMfindIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }

/**
 *
 * Retrieves the AccountMessageObjectDataList that results from the AccountMessageFindRequest call
 * @return AccountMessageObjectDataList resulting from udt call
 *
 */

  public AccountMessageObjectDataList getOutput() {
    return AccountMessageObjectHelper.fromMapList(outputMap, "AccountMessageList");
  }
}
