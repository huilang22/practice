/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultFindRequest.java
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
 * Class used to create a BsdAttributeDefaultFindRequest Udt Request
 *
 */

public class BsdAttributeDefaultFindRequest extends BsdAttributeDefaultRequest {
/**
 *
 * Constructor to create a  BsdAttributeDefaultFindRequest
 * @param id Unique request name
 * @param bsdAttributeDefaultFindIn BsdAttributeDefaultObjectFilter for BsdAttributeDefaultFindRequest
 *
 */
@JsonCreator
  public BsdAttributeDefaultFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeDefault")BsdAttributeDefaultObjectFilter bsdAttributeDefaultFindIn) {
    super(id, "BsdAttributeDefaultFind");
    if (bsdAttributeDefaultFindIn != null) {
      Integer index =  bsdAttributeDefaultFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectHelper.toMap(bsdAttributeDefaultFindIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeDefaultObjectDataList that results from the BsdAttributeDefaultFindRequest call
 * @return BsdAttributeDefaultObjectDataList resulting from udt call
 *
 */

  public BsdAttributeDefaultObjectDataList getOutput() {
    return BsdAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdAttributeDefaultList");
  }
}
