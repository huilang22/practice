/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindRequest.java
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
 * Class used to create a AccountLocateFindRequest Udt Request
 *
 */

public class AccountLocateFindRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a  AccountLocateFindRequest
 * @param id Unique request name
 * @param alfIn AccountLocateXIDObjectFilter for AccountLocateFindRequest
 *
 */
@JsonCreator
  public AccountLocateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountLocate")AccountLocateXIDObjectFilter alfIn) {
    super(id, "AccountLocateFind");
    if (alfIn != null) {
      Integer index =  alfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountLocate", AccountLocateXIDObjectHelper.toMap(alfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }

/**
 *
 * Retrieves the AccountLocateXIDObjectDataList that results from the AccountLocateFindRequest call
 * @return AccountLocateXIDObjectDataList resulting from udt call
 *
 */

  public AccountLocateXIDObjectDataList getOutput() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
