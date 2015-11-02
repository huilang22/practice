/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitFindRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdBusinessUnitFindRequest Udt Request
 *
 */

public class BsdBusinessUnitFindRequest extends BsdBusinessUnitRequest {
/**
 *
 * Constructor to create a  BsdBusinessUnitFindRequest
 * @param id Unique request name
 * @param bsdBusinessUnitFindIn BsdBusinessUnitObjectFilter for BsdBusinessUnitFindRequest
 *
 */
@JsonCreator
  public BsdBusinessUnitFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdBusinessUnit")BsdBusinessUnitObjectFilter bsdBusinessUnitFindIn) {
    super(id, "BsdBusinessUnitFind");
    if (bsdBusinessUnitFindIn != null) {
      Integer index =  bsdBusinessUnitFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(bsdBusinessUnitFindIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }

/**
 *
 * Retrieves the BsdBusinessUnitObjectDataList that results from the BsdBusinessUnitFindRequest call
 * @return BsdBusinessUnitObjectDataList resulting from udt call
 *
 */

  public BsdBusinessUnitObjectDataList getOutput() {
    return BsdBusinessUnitObjectHelper.fromMapList(outputMap, "BsdBusinessUnitList");
  }
}
