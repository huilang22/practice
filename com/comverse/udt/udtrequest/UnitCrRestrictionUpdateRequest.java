/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionUpdateRequest.java
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
 * Class used to create a UnitCrRestrictionUpdateRequest Udt Request
 *
 */

public class UnitCrRestrictionUpdateRequest extends UnitCrRestrictionSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRestrictionUpdateRequest
 * @param id Unique request name
 * @param UnitCrRestrictionUpdateIn UnitCrRestrictionObjectData for UnitCrRestrictionUpdateRequest
 * @param UnitCrRestrictionUpdateFilter UnitCrRestrictionObjectFilter for UnitCrRestrictionUpdateRequest
 * @param UnitCrRestrictionUpdateGet UnitCrRestrictionObjectData for UnitCrRestrictionUpdateRequest
 *
 */
@JsonCreator
  public UnitCrRestrictionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRestriction")UnitCrRestrictionObjectData UnitCrRestrictionUpdateIn, @JsonProperty("UnitCrRestrictionUpdateFilter")UnitCrRestrictionObjectFilter UnitCrRestrictionUpdateFilter, @JsonProperty("UnitCrRestrictionUpdateGet")UnitCrRestrictionObjectData UnitCrRestrictionUpdateGet) {
    super(id, "UnitCrRestrictionUpdate");
    if (UnitCrRestrictionUpdateIn != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(UnitCrRestrictionUpdateIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
    if (UnitCrRestrictionUpdateFilter != null) {
      Integer index =  UnitCrRestrictionUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRestrictionUpdateFilter", UnitCrRestrictionObjectHelper.toMap(UnitCrRestrictionUpdateFilter, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
    if (UnitCrRestrictionUpdateGet != null) {
      addInput("UnitCrRestrictionUpdateGet", UnitCrRestrictionObjectHelper.toMap(UnitCrRestrictionUpdateGet, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }

/**
 *
 * Retrieves the UnitCrRestrictionObjectData that results from the UnitCrRestrictionUpdateRequest call
 * @return UnitCrRestrictionObjectData resulting from udt call
 *
 */

  public UnitCrRestrictionObjectData getOutput() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
}
