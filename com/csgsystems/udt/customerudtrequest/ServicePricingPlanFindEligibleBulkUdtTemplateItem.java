/*
 * Generated code DO NOT EDIT
 * Generated file: ServicePricingPlanFindEligibleBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ServicePricingPlanFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class ServicePricingPlanFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] _____entity;
  protected ServicePricingPlanObjectFilter service_pricing_plan;
  protected Date _____effective_date;
  protected Integer _address_id;
  protected Integer[] __industry_type;
  protected Integer check_type;
/**
 *
 * Constructor to create a  ServicePricingPlanFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServicePricingPlanFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] _____entityIn, ServicePricingPlanObjectFilter service_pricing_planIn, Date _____effective_dateIn, Integer _address_idIn, Integer[] __industry_typeIn, Integer check_typeIn) {
    super(id, context, "ServicePricingPlanFindEligible");
    _____entity = _____entityIn;
    service_pricing_plan = service_pricing_planIn;
    _____effective_date = _____effective_dateIn;
    _address_id = _address_idIn;
    __industry_type = __industry_typeIn;
    check_type = check_typeIn;
  }

  public void translateToMap() {
    if (_____entity != null) {
      if (_____entity != null) {
        Object[] list = new Object[_____entity.length];
        for (int i = 0; i < _____entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(_____entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServicePricingPlan");
        }
        addInput("EntityList", list);
      }
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
 * Sets the Entity
 * @param _____entityIn Value of the _____entity
 *
 */

  public void setEntity(EntityObjectData[] _____entityIn) {
    _____entity = _____entityIn;
  }

/**
 *
 * Sets the ServicePricingPlan
 * @param service_pricing_planIn Value of the service_pricing_plan
 *
 */

  public void setServicePricingPlan(ServicePricingPlanObjectFilter service_pricing_planIn) {
    service_pricing_plan = service_pricing_planIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param _____effective_dateIn Value of the _____effective_date
 *
 */

  public void setEffectiveDate(Date _____effective_dateIn) {
    _____effective_date = _____effective_dateIn;
  }

/**
 *
 * Sets the AddressId
 * @param _address_idIn Value of the _address_id
 *
 */

  public void setAddressId(Integer _address_idIn) {
    _address_id = _address_idIn;
  }

/**
 *
 * Sets the IndustryType
 * @param __industry_typeIn Value of the __industry_type
 *
 */

  public void setIndustryType(Integer[] __industry_typeIn) {
    __industry_type = __industry_typeIn;
  }

/**
 *
 * Sets the CheckType
 * @param check_typeIn Value of the check_type
 *
 */

  public void setCheckType(Integer check_typeIn) {
    check_type = check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      _____entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _____entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        _____entity[i].resetFlags(true, true);
      }
    }
    service_pricing_plan = ServicePricingPlanObjectHelper.fromMapFilter(inputMap, "ServicePricingPlan");
    _____effective_date = (Date)inputMap.get("EffectiveDate");
    _address_id = (Integer)inputMap.get("AddressId");
    __industry_type = (Integer[])inputMap.get("IndustryType");
    check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return _____entity;
  }

/**
 *
 * Gets the ServicePricingPlan
 * @return Value of the ServicePricingPlan
 *
 */

  public ServicePricingPlanObjectFilter getServicePricingPlan( ) {
    return service_pricing_plan;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return _____effective_date;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return _address_id;
  }

/**
 *
 * Gets the IndustryType
 * @return Value of the IndustryType
 *
 */

  public Integer[] getIndustryType( ) {
    return __industry_type;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return check_type;
  }

}
