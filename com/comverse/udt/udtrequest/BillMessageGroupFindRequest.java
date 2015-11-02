/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupFindRequest.java
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
 * Class used to create a BillMessageGroupFindRequest Udt Request
 *
 */

public class BillMessageGroupFindRequest extends BillMessageGroupRequest {
/**
 *
 * Constructor to create a  BillMessageGroupFindRequest
 * @param id Unique request name
 * @param MGIFindIn BillMessageGroupObjectFilter for BillMessageGroupFindRequest
 *
 */
@JsonCreator
  public BillMessageGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroup")BillMessageGroupObjectFilter MGIFindIn) {
    super(id, "BillMessageGroupFind");
    if (MGIFindIn != null) {
      Integer index =  MGIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(MGIFindIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupObjectDataList that results from the BillMessageGroupFindRequest call
 * @return BillMessageGroupObjectDataList resulting from udt call
 *
 */

  public BillMessageGroupObjectDataList getOutput() {
    return BillMessageGroupObjectHelper.fromMapList(outputMap, "BillMessageGroupList");
  }
}
