/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapCreateRequest.java
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
 * Class used to create a BillInsertGroupMapCreateRequest Udt Request
 *
 */

public class BillInsertGroupMapCreateRequest extends BillInsertGroupMapSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupMapCreateRequest
 * @param id Unique request name
 * @param BIGCreateIn BillInsertGroupMapObjectData for BillInsertGroupMapCreateRequest
 *
 */
@JsonCreator
  public BillInsertGroupMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroupMap")BillInsertGroupMapObjectData BIGCreateIn) {
    super(id, "BillInsertGroupMapCreate");
    if (BIGCreateIn != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(BIGCreateIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupMapObjectData that results from the BillInsertGroupMapCreateRequest call
 * @return BillInsertGroupMapObjectData resulting from udt call
 *
 */

  public BillInsertGroupMapObjectData getOutput() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
}
