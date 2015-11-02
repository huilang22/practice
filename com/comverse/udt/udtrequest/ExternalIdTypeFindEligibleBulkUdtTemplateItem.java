/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeFindEligibleBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ExternalIdTypeFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdTypeFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] ____entity;
  protected ExternalIdTypeObjectFilter external_id_type;
  protected Date ____effective_date;
  protected Integer _____check_type;
/**
 *
 * Constructor to create a  ExternalIdTypeFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdTypeFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] ____entityIn, ExternalIdTypeObjectFilter external_id_typeIn, Date ____effective_dateIn, Integer _____check_typeIn) {
    super(id, context, "ExternalIdTypeFindEligible");
    ____entity = ____entityIn;
    external_id_type = external_id_typeIn;
    ____effective_date = ____effective_dateIn;
    _____check_type = _____check_typeIn;
  }

  public void translateToMap() {
    if (____entity != null) {
      if (____entity != null) {
        Object[] list = new Object[____entity.length];
        for (int i = 0; i < ____entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(____entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ExternalIdType");
        }
        addInput("EntityList", list);
      }
    }
    if (external_id_type != null) {
      Integer index =  external_id_type.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(external_id_type, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
    if (____effective_date != null) {
      addInput("EffectiveDate", ____effective_date);
    }
    if (_____check_type != null) {
      addInput("CheckType", _____check_type);
    }
  }


/**
 *
 * Sets the Entity
 * @param ____entityIn Value of the ____entity
 *
 */

  public void setEntity(EntityObjectData[] ____entityIn) {
    ____entity = ____entityIn;
  }

/**
 *
 * Sets the ExternalIdType
 * @param external_id_typeIn Value of the external_id_type
 *
 */

  public void setExternalIdType(ExternalIdTypeObjectFilter external_id_typeIn) {
    external_id_type = external_id_typeIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param ____effective_dateIn Value of the ____effective_date
 *
 */

  public void setEffectiveDate(Date ____effective_dateIn) {
    ____effective_date = ____effective_dateIn;
  }

/**
 *
 * Sets the CheckType
 * @param _____check_typeIn Value of the _____check_type
 *
 */

  public void setCheckType(Integer _____check_typeIn) {
    _____check_type = _____check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      ____entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ____entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        ____entity[i].resetFlags(true, true);
      }
    }
    external_id_type = ExternalIdTypeObjectHelper.fromMapFilter(inputMap, "ExternalIdType");
    ____effective_date = (Date)inputMap.get("EffectiveDate");
    _____check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return ____entity;
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public ExternalIdTypeObjectFilter getExternalIdType( ) {
    return external_id_type;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return ____effective_date;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return _____check_type;
  }

}
