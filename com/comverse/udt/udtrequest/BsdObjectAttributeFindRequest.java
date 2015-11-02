/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeFindRequest.java
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
 * Class used to create a BsdObjectAttributeFindRequest Udt Request
 *
 */

public class BsdObjectAttributeFindRequest extends BsdObjectAttributeRequest {
/**
 *
 * Constructor to create a  BsdObjectAttributeFindRequest
 * @param id Unique request name
 * @param bsdObjectAttributeFindIn BsdObjectAttributeObjectFilter for BsdObjectAttributeFindRequest
 *
 */
@JsonCreator
  public BsdObjectAttributeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObjectAttribute")BsdObjectAttributeObjectFilter bsdObjectAttributeFindIn) {
    super(id, "BsdObjectAttributeFind");
    if (bsdObjectAttributeFindIn != null) {
      Integer index =  bsdObjectAttributeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectHelper.toMap(bsdObjectAttributeFindIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }

/**
 *
 * Retrieves the BsdObjectAttributeObjectDataList that results from the BsdObjectAttributeFindRequest call
 * @return BsdObjectAttributeObjectDataList resulting from udt call
 *
 */

  public BsdObjectAttributeObjectDataList getOutput() {
    return BsdObjectAttributeObjectHelper.fromMapList(outputMap, "BsdObjectAttributeList");
  }
}
