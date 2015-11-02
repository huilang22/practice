/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionRetrieveRequest.java
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
 * Class used to create a ExclusionRetrieveRequest Udt Request
 *
 */

public class ExclusionRetrieveRequest extends ExclusionRequest {
/**
 *
 * Constructor to create a  ExclusionRetrieveRequest
 * @param id Unique request name
 * @param _entity EntityObjectData[] for ExclusionRetrieveRequest
 * @param _account_internal_id Integer for ExclusionRetrieveRequest
 * @param _service_internal_id Integer for ExclusionRetrieveRequest
 * @param _service_internal_id_resets Integer for ExclusionRetrieveRequest
 * @param _effective_date Date for ExclusionRetrieveRequest
 *
 */
@JsonCreator
  public ExclusionRetrieveRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] _entity, @JsonProperty("AccountInternalId")Integer _account_internal_id, @JsonProperty("ServiceInternalId")Integer _service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer _service_internal_id_resets, @JsonProperty("EffectiveDate")Date _effective_date) {
    super(id, "ExclusionRetrieve");
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
    if (_effective_date != null) {
      addInput("EffectiveDate", _effective_date);
    }
  }

/**
 *
 * Retrieves the ExclusionObjectDataList that results from the ExclusionRetrieveRequest call
 * @return ExclusionObjectDataList resulting from udt call
 *
 */

  public ExclusionObjectDataList getOutput() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
}
