/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcProductFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SvcProductFindRequest Udt Request
 *
 */

public class SvcProductFindRequest extends SvcProductRequest {
/**
 *
 * Constructor to create a  SvcProductFindRequest
 * @param id Unique request name
 * @param SvcProductFindIn SvcProductObjectFilter for SvcProductFindRequest
 *
 */
@JsonCreator
  public SvcProductFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SvcProduct")SvcProductObjectFilter SvcProductFindIn) {
    super(id, "SvcProductFind");
    if (SvcProductFindIn != null) {
      Integer index =  SvcProductFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcProduct", SvcProductObjectHelper.toMap(SvcProductFindIn, new HashMap(), "SvcProduct").get("SvcProduct"));
    }
  }

/**
 *
 * Retrieves the SvcProductObjectDataList that results from the SvcProductFindRequest call
 * @return SvcProductObjectDataList resulting from udt call
 *
 */

  public SvcProductObjectDataList getOutput() {
    return SvcProductObjectHelper.fromMapList(outputMap, "SvcProductList");
  }
}
