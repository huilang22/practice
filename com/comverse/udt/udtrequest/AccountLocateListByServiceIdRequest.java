/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateListByServiceIdRequest.java
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
 * Class used to create a AccountLocateListByServiceIdRequest Udt Request
 *
 */

public class AccountLocateListByServiceIdRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a  AccountLocateListByServiceIdRequest
 * @param id Unique request name
 * @param ExternalIdEquipMap ServiceLocateXIDObjectFilter for AccountLocateListByServiceIdRequest
 *
 */
@JsonCreator
  public AccountLocateListByServiceIdRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdEquipMap")ServiceLocateXIDObjectFilter ExternalIdEquipMap) {
    super(id, "AccountLocateListByServiceId");
    if (ExternalIdEquipMap != null) {
      Integer index =  ExternalIdEquipMap.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdEquipMap", ServiceLocateXIDObjectHelper.toMap(ExternalIdEquipMap, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }

/**
 *
 * Retrieves the AccountLocateXIDObjectDataList that results from the AccountLocateListByServiceIdRequest call
 * @return AccountLocateXIDObjectDataList resulting from udt call
 *
 */

  public AccountLocateXIDObjectDataList getOutput() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
