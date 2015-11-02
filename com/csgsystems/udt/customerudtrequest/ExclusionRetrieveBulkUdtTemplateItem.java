/*
 * Generated code DO NOT EDIT
 * Generated file: ExclusionRetrieveBulkUdtTemplateItem.java
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
 * Class used to create a ExclusionRetrieveBulkUdtTemplateItem Bulk Template
 *
 */

public class ExclusionRetrieveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] _entity;
  protected Integer _account_internal_id;
  protected Integer _service_internal_id;
  protected Integer _service_internal_id_resets;
  protected Date _effective_date;
/**
 *
 * Constructor to create a  ExclusionRetrieveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExclusionRetrieveBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] _entityIn, Integer _account_internal_idIn, Integer _service_internal_idIn, Integer _service_internal_id_resetsIn, Date _effective_dateIn) {
    super(id, context, "ExclusionRetrieve");
    _entity = _entityIn;
    _account_internal_id = _account_internal_idIn;
    _service_internal_id = _service_internal_idIn;
    _service_internal_id_resets = _service_internal_id_resetsIn;
    _effective_date = _effective_dateIn;
  }

  public void translateToMap() {
    if (_entity != null) {
      if (_entity != null) {
        Object[] list = new Object[_entity.length];
        for (int i = 0; i < _entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(_entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "Exclusion");
        }
        addInput("EntityList", list);
      }
    }
    if (_account_internal_id != null) {
      addInput("AccountInternalId", _account_internal_id);
    }
    if (_service_internal_id != null) {
      addInput("ServiceInternalId", _service_internal_id);
    }
    if (_service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", _service_internal_id_resets);
    }
    if (_effective_date != null) {
      addInput("EffectiveDate", _effective_date);
    }
  }


/**
 *
 * Sets the Entity
 * @param _entityIn Value of the _entity
 *
 */

  public void setEntity(EntityObjectData[] _entityIn) {
    _entity = _entityIn;
  }

/**
 *
 * Sets the AccountInternalId
 * @param _account_internal_idIn Value of the _account_internal_id
 *
 */

  public void setAccountInternalId(Integer _account_internal_idIn) {
    _account_internal_id = _account_internal_idIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param _service_internal_idIn Value of the _service_internal_id
 *
 */

  public void setServiceInternalId(Integer _service_internal_idIn) {
    _service_internal_id = _service_internal_idIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param _service_internal_id_resetsIn Value of the _service_internal_id_resets
 *
 */

  public void setServiceInternalIdResets(Integer _service_internal_id_resetsIn) {
    _service_internal_id_resets = _service_internal_id_resetsIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param _effective_dateIn Value of the _effective_date
 *
 */

  public void setEffectiveDate(Date _effective_dateIn) {
    _effective_date = _effective_dateIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      _entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        _entity[i].resetFlags(true, true);
      }
    }
    _account_internal_id = (Integer)inputMap.get("AccountInternalId");
    _service_internal_id = (Integer)inputMap.get("ServiceInternalId");
    _service_internal_id_resets = (Integer)inputMap.get("ServiceInternalIdResets");
    _effective_date = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return _entity;
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return _account_internal_id;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return _service_internal_id;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return _service_internal_id_resets;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return _effective_date;
  }

}
