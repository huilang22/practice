/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindEligibleRequest.java
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
 * Class used to create a NrcTransDescrFindEligibleRequest Udt Request
 *
 */

public class NrcTransDescrFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  NrcTransDescrFindEligibleRequest
 * @param id Unique request name
 * @param _entity EntityObjectData[] for NrcTransDescrFindEligibleRequest
 * @param nrc_trans_descr NrcTransDescrObjectFilter for NrcTransDescrFindEligibleRequest
 * @param _effective_date Date for NrcTransDescrFindEligibleRequest
 * @param __check_type Integer for NrcTransDescrFindEligibleRequest
 *
 */
@JsonCreator
  public NrcTransDescrFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] _entity, @JsonProperty("NrcTransDescr")NrcTransDescrObjectFilter nrc_trans_descr, @JsonProperty("EffectiveDate")Date _effective_date, @JsonProperty("CheckType")Integer __check_type) {
    super(id, "NrcTransDescrFindEligible");
    if (_entity != null) {
      Object[] list = new Object[_entity.length];
      for (int i = 0; i < _entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(_entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
    if (nrc_trans_descr != null) {
      Integer index =  nrc_trans_descr.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrc_trans_descr, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
    if (_effective_date != null) {
      addInput("EffectiveDate", _effective_date);
    }
    if (__check_type != null) {
      addInput("CheckType", __check_type);
    }
  }

/**
 *
 * Retrieves the NrcTransDescrObjectDataList that results from the NrcTransDescrFindEligibleRequest call
 * @return NrcTransDescrObjectDataList resulting from udt call
 *
 */

  public NrcTransDescrObjectDataList getOutput() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
}
