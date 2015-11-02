/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountExtendedDataFindRequest.java
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
 * Class used to create a AccountExtendedDataFindRequest Udt Request
 *
 */

public class AccountExtendedDataFindRequest extends AccountRequest {
/**
 *
 * Constructor to create a  AccountExtendedDataFindRequest
 * @param id Unique request name
 * @param aedfIn AccountObjectKeyData for AccountExtendedDataFindRequest
 *
 */
@JsonCreator
  public AccountExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData aedfIn) {
    super(id, "AccountExtendedDataFind");
    if (aedfIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(aedfIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountEDObjectDataList that results from the AccountExtendedDataFindRequest call
 * @return AccountEDObjectDataList resulting from udt call
 *
 */

  public AccountEDObjectDataList getOutput() {
    return AccountEDObjectHelper.fromMapList(outputMap, "AccountExtendedDataList");
  }
}
