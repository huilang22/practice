/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeFindEligibleRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExternalIdTypeFindEligibleRequest Udt Request
 *
 */

public class ExternalIdTypeFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  ExternalIdTypeFindEligibleRequest
 * @param id Unique request name
 * @param ____entity EntityObjectData[] for ExternalIdTypeFindEligibleRequest
 * @param external_id_type ExternalIdTypeObjectFilter for ExternalIdTypeFindEligibleRequest
 * @param ____effective_date Date for ExternalIdTypeFindEligibleRequest
 * @param _____check_type Integer for ExternalIdTypeFindEligibleRequest
 *
 */
@JsonCreator
  public ExternalIdTypeFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] ____entity, @JsonProperty("ExternalIdType")ExternalIdTypeObjectFilter external_id_type, @JsonProperty("EffectiveDate")Date ____effective_date, @JsonProperty("CheckType")Integer _____check_type) {
    super(id, "ExternalIdTypeFindEligible");
    if (____entity != null) {
      Object[] list = new Object[____entity.length];
      for (int i = 0; i < ____entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(____entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
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
 * Retrieves the ExternalIdTypeObjectDataList that results from the ExternalIdTypeFindEligibleRequest call
 * @return ExternalIdTypeObjectDataList resulting from udt call
 *
 */

  public ExternalIdTypeObjectDataList getOutput() {
    return ExternalIdTypeObjectHelper.fromMapList(outputMap, "ExternalIdTypeList");
  }
}
