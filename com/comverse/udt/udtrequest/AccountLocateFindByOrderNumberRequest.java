/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByOrderNumberRequest.java
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
 * Class used to create a AccountLocateFindByOrderNumberRequest Udt Request
 *
 */

public class AccountLocateFindByOrderNumberRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a  AccountLocateFindByOrderNumberRequest
 * @param id Unique request name
 * @param alonIn OrderLocateXIDObjectFilter for AccountLocateFindByOrderNumberRequest
 *
 */
@JsonCreator
  public AccountLocateFindByOrderNumberRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountLocate")OrderLocateXIDObjectFilter alonIn) {
    super(id, "AccountLocateFindByOrderNumber");
    if (alonIn != null) {
      Integer index =  alonIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountLocate", OrderLocateXIDObjectHelper.toMap(alonIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }

/**
 *
 * Retrieves the AccountLocateXIDObjectDataList that results from the AccountLocateFindByOrderNumberRequest call
 * @return AccountLocateXIDObjectDataList resulting from udt call
 *
 */

  public AccountLocateXIDObjectDataList getOutput() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
