/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapCreateRequest.java
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
 * Class used to create a BillMessageGroupMapCreateRequest Udt Request
 *
 */

public class BillMessageGroupMapCreateRequest extends BillMessageGroupMapSubRequestParent {
/**
 *
 * Constructor to create a  BillMessageGroupMapCreateRequest
 * @param id Unique request name
 * @param BMGCreateIn BillMessageGroupMapObjectData for BillMessageGroupMapCreateRequest
 *
 */
@JsonCreator
  public BillMessageGroupMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroupMap")BillMessageGroupMapObjectData BMGCreateIn) {
    super(id, "BillMessageGroupMapCreate");
    if (BMGCreateIn != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(BMGCreateIn, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupMapObjectData that results from the BillMessageGroupMapCreateRequest call
 * @return BillMessageGroupMapObjectData resulting from udt call
 *
 */

  public BillMessageGroupMapObjectData getOutput() {
    return BillMessageGroupMapObjectHelper.fromMap(outputMap, "BillMessageGroupMap");
  }
}
