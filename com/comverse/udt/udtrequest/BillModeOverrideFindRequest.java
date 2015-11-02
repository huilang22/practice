/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideFindRequest.java
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
 * Class used to create a BillModeOverrideFindRequest Udt Request
 *
 */

public class BillModeOverrideFindRequest extends BillModeOverrideRequest {
/**
 *
 * Constructor to create a  BillModeOverrideFindRequest
 * @param id Unique request name
 * @param BMOFindIn BMOObjectFilter for BillModeOverrideFindRequest
 *
 */
@JsonCreator
  public BillModeOverrideFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillModeOverride")BMOObjectFilter BMOFindIn) {
    super(id, "BillModeOverrideFind");
    if (BMOFindIn != null) {
      Integer index =  BMOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillModeOverride", BMOObjectHelper.toMap(BMOFindIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }

/**
 *
 * Retrieves the BMOObjectDataList that results from the BillModeOverrideFindRequest call
 * @return BMOObjectDataList resulting from udt call
 *
 */

  public BMOObjectDataList getOutput() {
    return BMOObjectHelper.fromMapList(outputMap, "BillModeOverrideList");
  }
}
