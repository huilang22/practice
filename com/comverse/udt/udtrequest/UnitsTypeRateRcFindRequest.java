/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeRateRcFindRequest.java
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
 * Class used to create a UnitsTypeRateRcFindRequest Udt Request
 *
 */

public class UnitsTypeRateRcFindRequest extends UnitsTypeRequest {
/**
 *
 * Constructor to create a  UnitsTypeRateRcFindRequest
 * @param id Unique request name
 * @param utrcFindIn UnitsTypeRcObjectFilter for UnitsTypeRateRcFindRequest
 *
 */
@JsonCreator
  public UnitsTypeRateRcFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitsType")UnitsTypeRcObjectFilter utrcFindIn) {
    super(id, "UnitsTypeRateRcFind");
    if (utrcFindIn != null) {
      Integer index =  utrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitsType", UnitsTypeRcObjectHelper.toMap(utrcFindIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }

/**
 *
 * Retrieves the UnitsTypeRcObjectDataList that results from the UnitsTypeRateRcFindRequest call
 * @return UnitsTypeRcObjectDataList resulting from udt call
 *
 */

  public UnitsTypeRcObjectDataList getOutput() {
    return UnitsTypeRcObjectHelper.fromMapList(outputMap, "UnitsTypeList");
  }
}
