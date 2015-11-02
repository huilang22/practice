/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyCheckBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DependencyCheckBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyCheckBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] entity;
  protected Integer account_internal_id;
  protected Integer service_internal_id;
  protected Integer service_internal_id_resets;
  protected Integer dependency_type;
  protected Integer apply_exclusions;
  protected Date effective_date;
/**
 *
 * Constructor to create a  DependencyCheckBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyCheckBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] entityIn, Integer account_internal_idIn, Integer service_internal_idIn, Integer service_internal_id_resetsIn, Integer dependency_typeIn, Integer apply_exclusionsIn, Date effective_dateIn) {
    super(id, context, "DependencyCheck");
    entity = entityIn;
    account_internal_id = account_internal_idIn;
    service_internal_id = service_internal_idIn;
    service_internal_id_resets = service_internal_id_resetsIn;
    dependency_type = dependency_typeIn;
    apply_exclusions = apply_exclusionsIn;
    effective_date = effective_dateIn;
  }

  public void translateToMap() {
    if (entity != null) {
      if (entity != null) {
        Object[] list = new Object[entity.length];
        for (int i = 0; i < entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "DependencyCheckOutputData");
        }
        addInput("EntityList", list);
      }
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
    if (dependency_type != null) {
      addInput("DependencyType", dependency_type);
    }
    if (apply_exclusions != null) {
      addInput("ApplyExclusions", apply_exclusions);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
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
 * Sets the AccountInternalId
 * @param account_internal_idIn Value of the account_internal_id
 *
 */

  public void setAccountInternalId(Integer account_internal_idIn) {
    account_internal_id = account_internal_idIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param service_internal_idIn Value of the service_internal_id
 *
 */

  public void setServiceInternalId(Integer service_internal_idIn) {
    service_internal_id = service_internal_idIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param service_internal_id_resetsIn Value of the service_internal_id_resets
 *
 */

  public void setServiceInternalIdResets(Integer service_internal_id_resetsIn) {
    service_internal_id_resets = service_internal_id_resetsIn;
  }

/**
 *
 * Sets the DependencyType
 * @param dependency_typeIn Value of the dependency_type
 *
 */

  public void setDependencyType(Integer dependency_typeIn) {
    dependency_type = dependency_typeIn;
  }

/**
 *
 * Sets the ApplyExclusions
 * @param apply_exclusionsIn Value of the apply_exclusions
 *
 */

  public void setApplyExclusions(Integer apply_exclusionsIn) {
    apply_exclusions = apply_exclusionsIn;
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

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        entity[i].resetFlags(true, true);
      }
    }
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
    service_internal_id = (Integer)inputMap.get("ServiceInternalId");
    service_internal_id_resets = (Integer)inputMap.get("ServiceInternalIdResets");
    dependency_type = (Integer)inputMap.get("DependencyType");
    apply_exclusions = (Integer)inputMap.get("ApplyExclusions");
    effective_date = (Date)inputMap.get("EffectiveDate");
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
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_internal_id;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return service_internal_id;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return service_internal_id_resets;
  }

/**
 *
 * Gets the DependencyType
 * @return Value of the DependencyType
 *
 */

  public Integer getDependencyType( ) {
    return dependency_type;
  }

/**
 *
 * Gets the ApplyExclusions
 * @return Value of the ApplyExclusions
 *
 */

  public Integer getApplyExclusions( ) {
    return apply_exclusions;
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

}
