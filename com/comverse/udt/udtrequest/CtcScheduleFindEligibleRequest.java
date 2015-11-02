/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleFindEligibleRequest.java
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
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcScheduleFindEligibleRequest Udt Request
 *
 */

public class CtcScheduleFindEligibleRequest extends PpvRequest {
/**
 *
 * Constructor to create a  CtcScheduleFindEligibleRequest
 * @param id Unique request name
 * @param ppv_service PpvServiceObjectData[] for CtcScheduleFindEligibleRequest
 * @param entity EntityObjectData[] for CtcScheduleFindEligibleRequest
 * @param ctc_schedule CtcScheduleObjectFilter for CtcScheduleFindEligibleRequest
 * @param effective_date Date for CtcScheduleFindEligibleRequest
 * @param address_id Integer[] for CtcScheduleFindEligibleRequest
 *
 */
@JsonCreator
  public CtcScheduleFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("PpvService")PpvServiceObjectData[] ppv_service, @JsonProperty("Entity")EntityObjectData[] entity, @JsonProperty("CtcSchedule")CtcScheduleObjectFilter ctc_schedule, @JsonProperty("EffectiveDate")Date effective_date, @JsonProperty("AddressId")Integer[] address_id) {
    super(id, "CtcScheduleFindEligible");
    if (ppv_service != null) {
      Object[] list = new Object[ppv_service.length];
      for (int i = 0; i < ppv_service.length; i++) {
        list[i] = PpvServiceObjectHelper.getMap(ppv_service[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "PpvService");
      }
      addInput("PpvServiceList", list);
    }
    if (entity != null) {
      Object[] list = new Object[entity.length];
      for (int i = 0; i < entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
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
 * Retrieves the CtcScheduleObjectDataList that results from the CtcScheduleFindEligibleRequest call
 * @return CtcScheduleObjectDataList resulting from udt call
 *
 */

  public CtcScheduleObjectDataList getOutput() {
    return CtcScheduleObjectHelper.fromMapList(outputMap, "CtcScheduleList");
  }
}
