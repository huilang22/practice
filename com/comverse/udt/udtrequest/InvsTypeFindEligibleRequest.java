/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeFindEligibleRequest.java
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
import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsTypeFindEligibleRequest Udt Request
 *
 */

public class InvsTypeFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  InvsTypeFindEligibleRequest
 * @param id Unique request name
 * @param ________entity EntityObjectData[] for InvsTypeFindEligibleRequest
 * @param invs_type InvsTypeObjectFilter for InvsTypeFindEligibleRequest
 * @param ________address_id Integer for InvsTypeFindEligibleRequest
 * @param ________effective_date Date for InvsTypeFindEligibleRequest
 * @param _______check_type Integer for InvsTypeFindEligibleRequest
 *
 */
@JsonCreator
  public InvsTypeFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] ________entity, @JsonProperty("InvsType")InvsTypeObjectFilter invs_type, @JsonProperty("AddressId")Integer ________address_id, @JsonProperty("EffectiveDate")Date ________effective_date, @JsonProperty("CheckType")Integer _______check_type) {
    super(id, "InvsTypeFindEligible");
    if (________entity != null) {
      Object[] list = new Object[________entity.length];
      for (int i = 0; i < ________entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(________entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
    if (invs_type != null) {
      Integer index =  invs_type.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsType", InvsTypeObjectHelper.toMap(invs_type, new HashMap(), "InvsType").get("InvsType"));
    }
    if (________address_id != null) {
      addInput("AddressId", ________address_id);
    }
    if (________effective_date != null) {
      addInput("EffectiveDate", ________effective_date);
    }
    if (_______check_type != null) {
      addInput("CheckType", _______check_type);
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectDataList that results from the InvsTypeFindEligibleRequest call
 * @return InvsTypeObjectDataList resulting from udt call
 *
 */

  public InvsTypeObjectDataList getOutput() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}
