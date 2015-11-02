/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeFindRequest.java
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
 * Class used to create a BsdAttributeFindRequest Udt Request
 *
 */

public class BsdAttributeFindRequest extends BsdAttributeRequest {
/**
 *
 * Constructor to create a  BsdAttributeFindRequest
 * @param id Unique request name
 * @param bsdAttributeFindIn BsdAttributeObjectFilter for BsdAttributeFindRequest
 *
 */
@JsonCreator
  public BsdAttributeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttribute")BsdAttributeObjectFilter bsdAttributeFindIn) {
    super(id, "BsdAttributeFind");
    if (bsdAttributeFindIn != null) {
      Integer index =  bsdAttributeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(bsdAttributeFindIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeObjectDataList that results from the BsdAttributeFindRequest call
 * @return BsdAttributeObjectDataList resulting from udt call
 *
 */

  public BsdAttributeObjectDataList getOutput() {
    return BsdAttributeObjectHelper.fromMapList(outputMap, "BsdAttributeList");
  }
}
