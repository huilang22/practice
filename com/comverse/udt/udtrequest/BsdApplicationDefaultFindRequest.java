/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultFindRequest.java
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
 * Class used to create a BsdApplicationDefaultFindRequest Udt Request
 *
 */

public class BsdApplicationDefaultFindRequest extends BsdApplicationDefaultRequest {
/**
 *
 * Constructor to create a  BsdApplicationDefaultFindRequest
 * @param id Unique request name
 * @param bsdApplicationDefaultFindIn BsdApplicationDefaultObjectFilter for BsdApplicationDefaultFindRequest
 *
 */
@JsonCreator
  public BsdApplicationDefaultFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationDefault")BsdApplicationDefaultObjectFilter bsdApplicationDefaultFindIn) {
    super(id, "BsdApplicationDefaultFind");
    if (bsdApplicationDefaultFindIn != null) {
      Integer index =  bsdApplicationDefaultFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(bsdApplicationDefaultFindIn, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationDefaultObjectDataList that results from the BsdApplicationDefaultFindRequest call
 * @return BsdApplicationDefaultObjectDataList resulting from udt call
 *
 */

  public BsdApplicationDefaultObjectDataList getOutput() {
    return BsdApplicationDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationDefaultList");
  }
}
