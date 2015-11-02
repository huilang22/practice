/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByServiceExtendeddataRequest.java
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
 * Class used to create a AccountLocateFindByServiceExtendeddataRequest Udt Request
 *
 */

public class AccountLocateFindByServiceExtendeddataRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a  AccountLocateFindByServiceExtendeddataRequest
 * @param id Unique request name
 * @param alsedfIn ServiceExtendedDataLocateXIDObjectFilter for AccountLocateFindByServiceExtendeddataRequest
 *
 */
@JsonCreator
  public AccountLocateFindByServiceExtendeddataRequest(@JsonProperty("RequestId") String id, @JsonProperty("AlsedfIn")ServiceExtendedDataLocateXIDObjectFilter alsedfIn) {
    super(id, "AccountLocateFindByServiceExtendeddata");
    if (alsedfIn != null) {
      Integer index =  alsedfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AlsedfIn", ServiceExtendedDataLocateXIDObjectHelper.toMap(alsedfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }

/**
 *
 * Retrieves the AccountLocateXIDObjectDataList that results from the AccountLocateFindByServiceExtendeddataRequest call
 * @return AccountLocateXIDObjectDataList resulting from udt call
 *
 */

  public AccountLocateXIDObjectDataList getOutput() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
