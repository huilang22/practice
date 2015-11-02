/*
 * Generated code DO NOT EDIT
 * Generated file: EntityFindBulkUdtTemplateItem.java
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
 * Class used to create a EntityFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_internal_id;
  protected Integer service_internal_id;
  protected Integer service_internal_id_resets;
  protected Date effective_date;
/**
 *
 * Constructor to create a  EntityFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityFindBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_internal_idIn, Integer service_internal_idIn, Integer service_internal_id_resetsIn, Date effective_dateIn) {
    super(id, context, "EntityFind");
    account_internal_id = account_internal_idIn;
    service_internal_id = service_internal_idIn;
    service_internal_id_resets = service_internal_id_resetsIn;
    effective_date = effective_dateIn;
  }

  public void translateToMap() {
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
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
 * Sets the EffectiveDate
 * @param effective_dateIn Value of the effective_date
 *
 */

  public void setEffectiveDate(Date effective_dateIn) {
    effective_date = effective_dateIn;
  }

  public void translateFromMap() {
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
    service_internal_id = (Integer)inputMap.get("ServiceInternalId");
    service_internal_id_resets = (Integer)inputMap.get("ServiceInternalIdResets");
    effective_date = (Date)inputMap.get("EffectiveDate");
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
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effective_date;
  }

}
