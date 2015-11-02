/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByServiceIdRequest.java
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
 * Class used to create a AccountLocateFindByServiceIdRequest Udt Request
 *
 */

public class AccountLocateFindByServiceIdRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a  AccountLocateFindByServiceIdRequest
 * @param id Unique request name
 * @param alsfIn ServiceLocateXIDObjectFilter for AccountLocateFindByServiceIdRequest
 *
 */
@JsonCreator
  public AccountLocateFindByServiceIdRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdEquipMap")ServiceLocateXIDObjectFilter alsfIn) {
    super(id, "AccountLocateFindByServiceId");
    if (alsfIn != null) {
      Integer index =  alsfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdEquipMap", ServiceLocateXIDObjectHelper.toMap(alsfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }

/**
 *
 * Retrieves the ServiceLocateXIDObjectDataList that results from the AccountLocateFindByServiceIdRequest call
 * @return ServiceLocateXIDObjectDataList resulting from udt call
 *
 */

  public ServiceLocateXIDObjectDataList getOutput() {
    return ServiceLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
