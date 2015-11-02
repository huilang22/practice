/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OccConeFxEntityMapFindRequest.java
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
 * Class used to create a OccConeFxEntityMapFindRequest Udt Request
 *
 */

public class OccConeFxEntityMapFindRequest extends OccConeFxEntityMapRequest {
/**
 *
 * Constructor to create a  OccConeFxEntityMapFindRequest
 * @param id Unique request name
 * @param OCFEMFindIn OCFEMObjectFilter for OccConeFxEntityMapFindRequest
 *
 */
@JsonCreator
  public OccConeFxEntityMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OccConeFxEntityMap")OCFEMObjectFilter OCFEMFindIn) {
    super(id, "OccConeFxEntityMapFind");
    if (OCFEMFindIn != null) {
      Integer index =  OCFEMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OccConeFxEntityMap", OCFEMObjectHelper.toMap(OCFEMFindIn, new HashMap(), "OccConeFxEntityMap").get("OccConeFxEntityMap"));
    }
  }

/**
 *
 * Retrieves the OCFEMObjectDataList that results from the OccConeFxEntityMapFindRequest call
 * @return OCFEMObjectDataList resulting from udt call
 *
 */

  public OCFEMObjectDataList getOutput() {
    return OCFEMObjectHelper.fromMapList(outputMap, "OccConeFxEntityMapList");
  }
}
