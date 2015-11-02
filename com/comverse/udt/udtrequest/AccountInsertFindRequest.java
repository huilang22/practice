/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertFindRequest.java
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
 * Class used to create a AccountInsertFindRequest Udt Request
 *
 */

public class AccountInsertFindRequest extends AccountInsertRequest {
/**
 *
 * Constructor to create a  AccountInsertFindRequest
 * @param id Unique request name
 * @param AIfindIn AccountInsertObjectFilter for AccountInsertFindRequest
 *
 */
@JsonCreator
  public AccountInsertFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInsert")AccountInsertObjectFilter AIfindIn) {
    super(id, "AccountInsertFind");
    if (AIfindIn != null) {
      Integer index =  AIfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AIfindIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }

/**
 *
 * Retrieves the AccountInsertObjectDataList that results from the AccountInsertFindRequest call
 * @return AccountInsertObjectDataList resulting from udt call
 *
 */

  public AccountInsertObjectDataList getOutput() {
    return AccountInsertObjectHelper.fromMapList(outputMap, "AccountInsertList");
  }
}
