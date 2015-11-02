/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceFindRequest.java
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
 * Class used to create a AccountAbiSourceFindRequest Udt Request
 *
 */

public class AccountAbiSourceFindRequest extends AccountAbiSourceRequest {
/**
 *
 * Constructor to create a  AccountAbiSourceFindRequest
 * @param id Unique request name
 * @param ABIfindIn AccountAbiSourceObjectFilter for AccountAbiSourceFindRequest
 *
 */
@JsonCreator
  public AccountAbiSourceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountAbiSource")AccountAbiSourceObjectFilter ABIfindIn) {
    super(id, "AccountAbiSourceFind");
    if (ABIfindIn != null) {
      Integer index =  ABIfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABIfindIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }

/**
 *
 * Retrieves the AccountAbiSourceObjectDataList that results from the AccountAbiSourceFindRequest call
 * @return AccountAbiSourceObjectDataList resulting from udt call
 *
 */

  public AccountAbiSourceObjectDataList getOutput() {
    return AccountAbiSourceObjectHelper.fromMapList(outputMap, "AccountAbiSourceList");
  }
}
