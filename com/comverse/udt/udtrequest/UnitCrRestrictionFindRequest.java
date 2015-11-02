/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionFindRequest.java
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
 * Class used to create a UnitCrRestrictionFindRequest Udt Request
 *
 */

public class UnitCrRestrictionFindRequest extends UnitCrRestrictionRequest {
/**
 *
 * Constructor to create a  UnitCrRestrictionFindRequest
 * @param id Unique request name
 * @param ucrFindIn UnitCrRestrictionObjectFilter for UnitCrRestrictionFindRequest
 *
 */
@JsonCreator
  public UnitCrRestrictionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRestriction")UnitCrRestrictionObjectFilter ucrFindIn) {
    super(id, "UnitCrRestrictionFind");
    if (ucrFindIn != null) {
      Integer index =  ucrFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(ucrFindIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }

/**
 *
 * Retrieves the UnitCrRestrictionObjectDataList that results from the UnitCrRestrictionFindRequest call
 * @return UnitCrRestrictionObjectDataList resulting from udt call
 *
 */

  public UnitCrRestrictionObjectDataList getOutput() {
    return UnitCrRestrictionObjectHelper.fromMapList(outputMap, "UnitCrRestrictionList");
  }
}
