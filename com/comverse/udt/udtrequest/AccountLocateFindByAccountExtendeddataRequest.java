/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByAccountExtendeddataRequest.java
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
 * Class used to create a AccountLocateFindByAccountExtendeddataRequest Udt Request
 *
 */

public class AccountLocateFindByAccountExtendeddataRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a  AccountLocateFindByAccountExtendeddataRequest
 * @param id Unique request name
 * @param alaedfIn AccountExtendedDataLocateXIDObjectFilter for AccountLocateFindByAccountExtendeddataRequest
 *
 */
@JsonCreator
  public AccountLocateFindByAccountExtendeddataRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountLocate")AccountExtendedDataLocateXIDObjectFilter alaedfIn) {
    super(id, "AccountLocateFindByAccountExtendeddata");
    if (alaedfIn != null) {
      Integer index =  alaedfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountLocate", AccountExtendedDataLocateXIDObjectHelper.toMap(alaedfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }

/**
 *
 * Retrieves the AccountLocateXIDObjectDataList that results from the AccountLocateFindByAccountExtendeddataRequest call
 * @return AccountLocateXIDObjectDataList resulting from udt call
 *
 */

  public AccountLocateXIDObjectDataList getOutput() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
