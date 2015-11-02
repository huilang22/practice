/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupFindRequest.java
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
 * Class used to create a BillInsertGroupFindRequest Udt Request
 *
 */

public class BillInsertGroupFindRequest extends BillInsertGroupRequest {
/**
 *
 * Constructor to create a  BillInsertGroupFindRequest
 * @param id Unique request name
 * @param IGIFindIn BillInsertGroupObjectFilter for BillInsertGroupFindRequest
 *
 */
@JsonCreator
  public BillInsertGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroup")BillInsertGroupObjectFilter IGIFindIn) {
    super(id, "BillInsertGroupFind");
    if (IGIFindIn != null) {
      Integer index =  IGIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(IGIFindIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupObjectDataList that results from the BillInsertGroupFindRequest call
 * @return BillInsertGroupObjectDataList resulting from udt call
 *
 */

  public BillInsertGroupObjectDataList getOutput() {
    return BillInsertGroupObjectHelper.fromMapList(outputMap, "BillInsertGroupList");
  }
}
