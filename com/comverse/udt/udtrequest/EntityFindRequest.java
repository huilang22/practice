/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityFindRequest.java
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
 * Class used to create a EntityFindRequest Udt Request
 *
 */

public class EntityFindRequest extends EntityTypeRequest {
/**
 *
 * Constructor to create a  EntityFindRequest
 * @param id Unique request name
 * @param account_internal_id Integer for EntityFindRequest
 * @param service_internal_id Integer for EntityFindRequest
 * @param service_internal_id_resets Integer for EntityFindRequest
 * @param effective_date Date for EntityFindRequest
 *
 */
@JsonCreator
  public EntityFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "EntityFind");
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
 * Retrieves the EntityObjectDataList that results from the EntityFindRequest call
 * @return EntityObjectDataList resulting from udt call
 *
 */

  public EntityObjectDataList getOutput() {
    return EntityObjectHelper.fromMapList(outputMap, "EntityList");
  }
}
