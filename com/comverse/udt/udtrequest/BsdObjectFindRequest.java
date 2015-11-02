/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectFindRequest.java
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
 * Class used to create a BsdObjectFindRequest Udt Request
 *
 */

public class BsdObjectFindRequest extends BsdObjectRequest {
/**
 *
 * Constructor to create a  BsdObjectFindRequest
 * @param id Unique request name
 * @param bsdObjectFindIn BsdObjectObjectFilter for BsdObjectFindRequest
 *
 */
@JsonCreator
  public BsdObjectFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObject")BsdObjectObjectFilter bsdObjectFindIn) {
    super(id, "BsdObjectFind");
    if (bsdObjectFindIn != null) {
      Integer index =  bsdObjectFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdObject", BsdObjectObjectHelper.toMap(bsdObjectFindIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }

/**
 *
 * Retrieves the BsdObjectObjectDataList that results from the BsdObjectFindRequest call
 * @return BsdObjectObjectDataList resulting from udt call
 *
 */

  public BsdObjectObjectDataList getOutput() {
    return BsdObjectObjectHelper.fromMapList(outputMap, "BsdObjectList");
  }
}
