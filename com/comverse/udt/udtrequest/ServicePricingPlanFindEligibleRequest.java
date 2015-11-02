/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanFindEligibleRequest.java
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
 * Class used to create a ServicePricingPlanFindEligibleRequest Udt Request
 *
 */

public class ServicePricingPlanFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  ServicePricingPlanFindEligibleRequest
 * @param id Unique request name
 * @param _____entity EntityObjectData[] for ServicePricingPlanFindEligibleRequest
 * @param service_pricing_plan ServicePricingPlanObjectFilter for ServicePricingPlanFindEligibleRequest
 * @param _____effective_date Date for ServicePricingPlanFindEligibleRequest
 * @param _address_id Integer for ServicePricingPlanFindEligibleRequest
 * @param __industry_type Integer[] for ServicePricingPlanFindEligibleRequest
 * @param check_type Integer for ServicePricingPlanFindEligibleRequest
 *
 */
@JsonCreator
  public ServicePricingPlanFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] _____entity, @JsonProperty("ServicePricingPlan")ServicePricingPlanObjectFilter service_pricing_plan, @JsonProperty("EffectiveDate")Date _____effective_date, @JsonProperty("AddressId")Integer _address_id, @JsonProperty("IndustryType")Integer[] __industry_type, @JsonProperty("CheckType")Integer check_type) {
    super(id, "ServicePricingPlanFindEligible");
    if (_____entity != null) {
      Object[] list = new Object[_____entity.length];
      for (int i = 0; i < _____entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(_____entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
    if (service_pricing_plan != null) {
      Integer index =  service_pricing_plan.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(service_pricing_plan, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
    if (_____effective_date != null) {
      addInput("EffectiveDate", _____effective_date);
    }
    if (_address_id != null) {
      addInput("AddressId", _address_id);
    }
    if (__industry_type != null) {
      addInput("IndustryTypeList", __industry_type);
    }
    if (check_type != null) {
      addInput("CheckType", check_type);
    }
  }

/**
 *
 * Retrieves the ServicePricingPlanObjectDataList that results from the ServicePricingPlanFindEligibleRequest call
 * @return ServicePricingPlanObjectDataList resulting from udt call
 *
 */

  public ServicePricingPlanObjectDataList getOutput() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
}
