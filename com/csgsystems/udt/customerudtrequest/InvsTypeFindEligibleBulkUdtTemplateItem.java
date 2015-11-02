/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeFindEligibleBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] ________entity;
  protected InvsTypeObjectFilter invs_type;
  protected Integer ________address_id;
  protected Date ________effective_date;
  protected Integer _______check_type;
/**
 *
 * Constructor to create a  InvsTypeFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] ________entityIn, InvsTypeObjectFilter invs_typeIn, Integer ________address_idIn, Date ________effective_dateIn, Integer _______check_typeIn) {
    super(id, context, "InvsTypeFindEligible");
    ________entity = ________entityIn;
    invs_type = invs_typeIn;
    ________address_id = ________address_idIn;
    ________effective_date = ________effective_dateIn;
    _______check_type = _______check_typeIn;
  }

  public void translateToMap() {
    if (________entity != null) {
      if (________entity != null) {
        Object[] list = new Object[________entity.length];
        for (int i = 0; i < ________entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(________entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvsType");
        }
        addInput("EntityList", list);
      }
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
 * Sets the Entity
 * @param ________entityIn Value of the ________entity
 *
 */

  public void setEntity(EntityObjectData[] ________entityIn) {
    ________entity = ________entityIn;
  }

/**
 *
 * Sets the InvsType
 * @param invs_typeIn Value of the invs_type
 *
 */

  public void setInvsType(InvsTypeObjectFilter invs_typeIn) {
    invs_type = invs_typeIn;
  }

/**
 *
 * Sets the AddressId
 * @param ________address_idIn Value of the ________address_id
 *
 */

  public void setAddressId(Integer ________address_idIn) {
    ________address_id = ________address_idIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param ________effective_dateIn Value of the ________effective_date
 *
 */

  public void setEffectiveDate(Date ________effective_dateIn) {
    ________effective_date = ________effective_dateIn;
  }

/**
 *
 * Sets the CheckType
 * @param _______check_typeIn Value of the _______check_type
 *
 */

  public void setCheckType(Integer _______check_typeIn) {
    _______check_type = _______check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      ________entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ________entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        ________entity[i].resetFlags(true, true);
      }
    }
    invs_type = InvsTypeObjectHelper.fromMapFilter(inputMap, "InvsType");
    ________address_id = (Integer)inputMap.get("AddressId");
    ________effective_date = (Date)inputMap.get("EffectiveDate");
    _______check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return ________entity;
  }

/**
 *
 * Gets the InvsType
 * @return Value of the InvsType
 *
 */

  public InvsTypeObjectFilter getInvsType( ) {
    return invs_type;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return ________address_id;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return ________effective_date;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return _______check_type;
  }

}
