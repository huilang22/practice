/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionCheckRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExclusionCheckRequest Udt Request
 *
 */

public class ExclusionCheckRequest extends ExclusionRequest {
/**
 *
 * Constructor to create a  ExclusionCheckRequest
 * @param id Unique request name
 * @param entity EntityObjectData[] for ExclusionCheckRequest
 * @param account_internal_id Integer for ExclusionCheckRequest
 * @param service_internal_id Integer for ExclusionCheckRequest
 * @param service_internal_id_resets Integer for ExclusionCheckRequest
 * @param effective_date Date for ExclusionCheckRequest
 *
 */
@JsonCreator
  public ExclusionCheckRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] entity, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "ExclusionCheck");
    if (entity != null) {
      Object[] list = new Object[entity.length];
      for (int i = 0; i < entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
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
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
  }

/**
 *
 * Retrieves the ExclusionObjectDataList that results from the ExclusionCheckRequest call
 * @return ExclusionObjectDataList resulting from udt call
 *
 */

  public ExclusionObjectDataList getOutput() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
}
