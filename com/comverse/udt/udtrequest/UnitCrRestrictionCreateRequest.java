/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionCreateRequest.java
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
 * Class used to create a UnitCrRestrictionCreateRequest Udt Request
 *
 */

public class UnitCrRestrictionCreateRequest extends UnitCrRestrictionSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRestrictionCreateRequest
 * @param id Unique request name
 * @param ucrCrIn UnitCrRestrictionObjectData for UnitCrRestrictionCreateRequest
 *
 */
@JsonCreator
  public UnitCrRestrictionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRestriction")UnitCrRestrictionObjectData ucrCrIn) {
    super(id, "UnitCrRestrictionCreate");
    if (ucrCrIn != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(ucrCrIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }

/**
 *
 * Retrieves the UnitCrRestrictionObjectData that results from the UnitCrRestrictionCreateRequest call
 * @return UnitCrRestrictionObjectData resulting from udt call
 *
 */

  public UnitCrRestrictionObjectData getOutput() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
}
