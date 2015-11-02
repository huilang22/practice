/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindEligibleRequest.java
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
 * Class used to create a ContractTypeFindEligibleRequest Udt Request
 *
 */

public class ContractTypeFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  ContractTypeFindEligibleRequest
 * @param id Unique request name
 * @param entity EntityObjectData[] for ContractTypeFindEligibleRequest
 * @param contract_type ContractTypeObjectFilter for ContractTypeFindEligibleRequest
 * @param effective_date Date for ContractTypeFindEligibleRequest
 * @param _check_type Integer for ContractTypeFindEligibleRequest
 *
 */
@JsonCreator
  public ContractTypeFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] entity, @JsonProperty("ContractType")ContractTypeObjectFilter contract_type, @JsonProperty("EffectiveDate")Date effective_date, @JsonProperty("CheckType")Integer _check_type) {
    super(id, "ContractTypeFindEligible");
    if (entity != null) {
      Object[] list = new Object[entity.length];
      for (int i = 0; i < entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
    if (contract_type != null) {
      Integer index =  contract_type.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ContractType", ContractTypeObjectHelper.toMap(contract_type, new HashMap(), "ContractType").get("ContractType"));
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
    if (_check_type != null) {
      addInput("CheckType", _check_type);
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectDataList that results from the ContractTypeFindEligibleRequest call
 * @return ContractTypeObjectDataList resulting from udt call
 *
 */

  public ContractTypeObjectDataList getOutput() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
}
