/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideFindRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CorridorRateBandOverrideFindRequest Udt Request
 *
 */

public class CorridorRateBandOverrideFindRequest extends CorridorRateBandOverrideRequest {
/**
 *
 * Constructor to create a  CorridorRateBandOverrideFindRequest
 * @param id Unique request name
 * @param CRBOFindIn CRBOObjectFilter for CorridorRateBandOverrideFindRequest
 *
 */
@JsonCreator
  public CorridorRateBandOverrideFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorRateBandOverride")CRBOObjectFilter CRBOFindIn) {
    super(id, "CorridorRateBandOverrideFind");
    if (CRBOFindIn != null) {
      Integer index =  CRBOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(CRBOFindIn, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }

/**
 *
 * Retrieves the CRBOObjectDataList that results from the CorridorRateBandOverrideFindRequest call
 * @return CRBOObjectDataList resulting from udt call
 *
 */

  public CRBOObjectDataList getOutput() {
    return CRBOObjectHelper.fromMapList(outputMap, "CorridorRateBandOverrideList");
  }
}
