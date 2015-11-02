/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeFindEligibleBulkUdtTemplateItem.java
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
 * Class used to create a ContractTypeFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypeFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] entity;
  protected ContractTypeObjectFilter contract_type;
  protected Date effective_date;
  protected Integer _check_type;
/**
 *
 * Constructor to create a  ContractTypeFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypeFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] entityIn, ContractTypeObjectFilter contract_typeIn, Date effective_dateIn, Integer _check_typeIn) {
    super(id, context, "ContractTypeFindEligible");
    entity = entityIn;
    contract_type = contract_typeIn;
    effective_date = effective_dateIn;
    _check_type = _check_typeIn;
  }

  public void translateToMap() {
    if (entity != null) {
      if (entity != null) {
        Object[] list = new Object[entity.length];
        for (int i = 0; i < entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ContractType");
        }
        addInput("EntityList", list);
      }
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
 * Sets the Entity
 * @param entityIn Value of the entity
 *
 */

  public void setEntity(EntityObjectData[] entityIn) {
    entity = entityIn;
  }

/**
 *
 * Sets the ContractType
 * @param contract_typeIn Value of the contract_type
 *
 */

  public void setContractType(ContractTypeObjectFilter contract_typeIn) {
    contract_type = contract_typeIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param effective_dateIn Value of the effective_date
 *
 */

  public void setEffectiveDate(Date effective_dateIn) {
    effective_date = effective_dateIn;
  }

/**
 *
 * Sets the CheckType
 * @param _check_typeIn Value of the _check_type
 *
 */

  public void setCheckType(Integer _check_typeIn) {
    _check_type = _check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        entity[i].resetFlags(true, true);
      }
    }
    contract_type = ContractTypeObjectHelper.fromMapFilter(inputMap, "ContractType");
    effective_date = (Date)inputMap.get("EffectiveDate");
    _check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return entity;
  }

/**
 *
 * Gets the ContractType
 * @return Value of the ContractType
 *
 */

  public ContractTypeObjectFilter getContractType( ) {
    return contract_type;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effective_date;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return _check_type;
  }

}
