/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyCheckRequest.java
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
 * Class used to create a DependencyCheckRequest Udt Request
 *
 */

public class DependencyCheckRequest extends DependencySubRequestParent {
/**
 *
 * Constructor to create a  DependencyCheckRequest
 * @param id Unique request name
 * @param entity EntityObjectData[] for DependencyCheckRequest
 * @param account_internal_id Integer for DependencyCheckRequest
 * @param service_internal_id Integer for DependencyCheckRequest
 * @param service_internal_id_resets Integer for DependencyCheckRequest
 * @param dependency_type Integer for DependencyCheckRequest
 * @param apply_exclusions Integer for DependencyCheckRequest
 * @param effective_date Date for DependencyCheckRequest
 *
 */
@JsonCreator
  public DependencyCheckRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] entity, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets, @JsonProperty("DependencyType")Integer dependency_type, @JsonProperty("ApplyExclusions")Integer apply_exclusions, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "DependencyCheck");
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
 * Retrieves the DependencyCheckOutputData that results from the DependencyCheckRequest call
 * @return DependencyCheckOutputData resulting from udt call
 *
 */

  public DependencyCheckOutputData getOutput() {
    return DependencyCheckOutputHelper.fromMap(outputMap);
  }
}
