/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyRetrieveRequest.java
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
 * Class used to create a DependencyRetrieveRequest Udt Request
 *
 */

public class DependencyRetrieveRequest extends DependencyRequest {
/**
 *
 * Constructor to create a  DependencyRetrieveRequest
 * @param id Unique request name
 * @param _entity EntityObjectData[] for DependencyRetrieveRequest
 * @param _account_internal_id Integer for DependencyRetrieveRequest
 * @param _service_internal_id Integer for DependencyRetrieveRequest
 * @param _service_internal_id_resets Integer for DependencyRetrieveRequest
 * @param _dependency_type Integer for DependencyRetrieveRequest
 * @param _apply_exclusions Integer for DependencyRetrieveRequest
 * @param _effective_date Date for DependencyRetrieveRequest
 *
 */
@JsonCreator
  public DependencyRetrieveRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] _entity, @JsonProperty("AccountInternalId")Integer _account_internal_id, @JsonProperty("ServiceInternalId")Integer _service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer _service_internal_id_resets, @JsonProperty("DependencyType")Integer _dependency_type, @JsonProperty("ApplyExclusions")Integer _apply_exclusions, @JsonProperty("EffectiveDate")Date _effective_date) {
    super(id, "DependencyRetrieve");
    if (_entity != null) {
      Object[] list = new Object[_entity.length];
      for (int i = 0; i < _entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(_entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
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
    if (_dependency_type != null) {
      addInput("DependencyType", _dependency_type);
    }
    if (_apply_exclusions != null) {
      addInput("ApplyExclusions", _apply_exclusions);
    }
    if (_effective_date != null) {
      addInput("EffectiveDate", _effective_date);
    }
  }

/**
 *
 * Retrieves the DependencyObjectDataList that results from the DependencyRetrieveRequest call
 * @return DependencyObjectDataList resulting from udt call
 *
 */

  public DependencyObjectDataList getOutput() {
    return DependencyObjectHelper.fromMapList(outputMap, "DependencyList");
  }
}
