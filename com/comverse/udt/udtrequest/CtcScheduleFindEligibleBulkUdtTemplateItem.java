/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleFindEligibleBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a CtcScheduleFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcScheduleFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvServiceObjectData[] ppv_service;
  protected EntityObjectData[] entity;
  protected CtcScheduleObjectFilter ctc_schedule;
  protected Date effective_date;
  protected Integer[] address_id;
/**
 *
 * Constructor to create a  CtcScheduleFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcScheduleFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvServiceObjectData[] ppv_serviceIn, EntityObjectData[] entityIn, CtcScheduleObjectFilter ctc_scheduleIn, Date effective_dateIn, Integer[] address_idIn) {
    super(id, context, "CtcScheduleFindEligible");
    ppv_service = ppv_serviceIn;
    entity = entityIn;
    ctc_schedule = ctc_scheduleIn;
    effective_date = effective_dateIn;
    address_id = address_idIn;
  }

  public void translateToMap() {
    if (ppv_service != null) {
      if (ppv_service != null) {
        Object[] list = new Object[ppv_service.length];
        for (int i = 0; i < ppv_service.length; i++) {
          list[i] = PpvServiceObjectHelper.getMap(ppv_service[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "CtcSchedule");
        }
        addInput("PpvServiceList", list);
      }
    }
    if (entity != null) {
      if (entity != null) {
        Object[] list = new Object[entity.length];
        for (int i = 0; i < entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "CtcSchedule");
        }
        addInput("EntityList", list);
      }
    }
    if (ctc_schedule != null) {
      Integer index =  ctc_schedule.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(ctc_schedule, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
    if (address_id != null) {
      addInput("AddressIdList", address_id);
    }
  }


/**
 *
 * Sets the PpvService
 * @param ppv_serviceIn Value of the ppv_service
 *
 */

  public void setPpvService(PpvServiceObjectData[] ppv_serviceIn) {
    ppv_service = ppv_serviceIn;
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
 * Sets the CtcSchedule
 * @param ctc_scheduleIn Value of the ctc_schedule
 *
 */

  public void setCtcSchedule(CtcScheduleObjectFilter ctc_scheduleIn) {
    ctc_schedule = ctc_scheduleIn;
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
 * Sets the AddressId
 * @param address_idIn Value of the address_id
 *
 */

  public void setAddressId(Integer[] address_idIn) {
    address_id = address_idIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("PpvServiceList");
    if (list != null) {
      ppv_service = new PpvServiceObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ppv_service[i] = PpvServiceObjectHelper.getObj((Map) list[i]);
        ppv_service[i].resetFlags(true, true);
      }
    }
    list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        entity[i].resetFlags(true, true);
      }
    }
    ctc_schedule = CtcScheduleObjectHelper.fromMapFilter(inputMap, "CtcSchedule");
    effective_date = (Date)inputMap.get("EffectiveDate");
    address_id = (Integer[])inputMap.get("AddressId");
  }

/**
 *
 * Gets the PpvService
 * @return Value of the PpvService
 *
 */

  public PpvServiceObjectData[] getPpvService( ) {
    return ppv_service;
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
 * Gets the CtcSchedule
 * @return Value of the CtcSchedule
 *
 */

  public CtcScheduleObjectFilter getCtcSchedule( ) {
    return ctc_schedule;
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
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer[] getAddressId( ) {
    return address_id;
  }

}
