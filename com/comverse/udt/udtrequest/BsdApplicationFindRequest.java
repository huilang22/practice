/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationFindRequest.java
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
 * Class used to create a BsdApplicationFindRequest Udt Request
 *
 */

public class BsdApplicationFindRequest extends BsdApplicationRequest {
/**
 *
 * Constructor to create a  BsdApplicationFindRequest
 * @param id Unique request name
 * @param bsdApplicationFindIn BsdApplicationObjectFilter for BsdApplicationFindRequest
 *
 */
@JsonCreator
  public BsdApplicationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplication")BsdApplicationObjectFilter bsdApplicationFindIn) {
    super(id, "BsdApplicationFind");
    if (bsdApplicationFindIn != null) {
      Integer index =  bsdApplicationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(bsdApplicationFindIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationObjectDataList that results from the BsdApplicationFindRequest call
 * @return BsdApplicationObjectDataList resulting from udt call
 *
 */

  public BsdApplicationObjectDataList getOutput() {
    return BsdApplicationObjectHelper.fromMapList(outputMap, "BsdApplicationList");
  }
}
