/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AbiNrcDucFindRequest Udt Request
 *
 */

public class AbiNrcDucFindRequest extends AbiNrcDucRequest {
/**
 *
 * Constructor to create a  AbiNrcDucFindRequest
 * @param id Unique request name
 * @param AbiNrcDucFindIn AbiNrcDucObjectFilter for AbiNrcDucFindRequest
 *
 */
@JsonCreator
  public AbiNrcDucFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiNrcDuc")AbiNrcDucObjectFilter AbiNrcDucFindIn) {
    super(id, "AbiNrcDucFind");
    if (AbiNrcDucFindIn != null) {
      Integer index =  AbiNrcDucFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(AbiNrcDucFindIn, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }

/**
 *
 * Retrieves the AbiNrcDucObjectDataList that results from the AbiNrcDucFindRequest call
 * @return AbiNrcDucObjectDataList resulting from udt call
 *
 */

  public AbiNrcDucObjectDataList getOutput() {
    return AbiNrcDucObjectHelper.fromMapList(outputMap, "AbiNrcDucList");
  }
}
