/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionGetRequest.java
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
 * Class used to create a UnitCrRestrictionGetRequest Udt Request
 *
 */

public class UnitCrRestrictionGetRequest extends UnitCrRestrictionSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRestrictionGetRequest
 * @param id Unique request name
 * @param ucrGetIn UnitCrRestrictionObjectKeyData for UnitCrRestrictionGetRequest
 *
 */
@JsonCreator
  public UnitCrRestrictionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRestriction")UnitCrRestrictionObjectKeyData ucrGetIn) {
    super(id, "UnitCrRestrictionGet");
    if (ucrGetIn != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectKeyHelper.toMap(ucrGetIn, new HashMap(), "UnitCrRestrictionObjectKeyData").get("UnitCrRestrictionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitCrRestrictionObjectData that results from the UnitCrRestrictionGetRequest call
 * @return UnitCrRestrictionObjectData resulting from udt call
 *
 */

  public UnitCrRestrictionObjectData getOutput() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
}
