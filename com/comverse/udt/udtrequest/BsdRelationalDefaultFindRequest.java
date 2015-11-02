/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultFindRequest.java
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
 * Class used to create a BsdRelationalDefaultFindRequest Udt Request
 *
 */

public class BsdRelationalDefaultFindRequest extends BsdRelationalDefaultRequest {
/**
 *
 * Constructor to create a  BsdRelationalDefaultFindRequest
 * @param id Unique request name
 * @param bsdRelationalDefaultFindIn BsdRelationalDefaultObjectFilter for BsdRelationalDefaultFindRequest
 *
 */
@JsonCreator
  public BsdRelationalDefaultFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalDefault")BsdRelationalDefaultObjectFilter bsdRelationalDefaultFindIn) {
    super(id, "BsdRelationalDefaultFind");
    if (bsdRelationalDefaultFindIn != null) {
      Integer index =  bsdRelationalDefaultFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectHelper.toMap(bsdRelationalDefaultFindIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalDefaultObjectDataList that results from the BsdRelationalDefaultFindRequest call
 * @return BsdRelationalDefaultObjectDataList resulting from udt call
 *
 */

  public BsdRelationalDefaultObjectDataList getOutput() {
    return BsdRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdRelationalDefaultList");
  }
}
