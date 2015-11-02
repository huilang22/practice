/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillExternalIdFindRequest.java
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

import com.csgsystems.si.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillExternalIdFindRequest Udt Request
 *
 */

public class BillExternalIdFindRequest extends BillExternalIdRequest {
/**
 *
 * Constructor to create a  BillExternalIdFindRequest
 * @param id Unique request name
 * @param findIn BillExternalIdObjectFilter for BillExternalIdFindRequest
 *
 */
@JsonCreator
  public BillExternalIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillExternalId")BillExternalIdObjectFilter findIn) {
    super(id, "BillExternalIdFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillExternalId", BillExternalIdObjectHelper.toMap(findIn, new HashMap(), "BillExternalId").get("BillExternalId"));
    }
  }

/**
 *
 * Retrieves the BillExternalIdObjectDataList that results from the BillExternalIdFindRequest call
 * @return BillExternalIdObjectDataList resulting from udt call
 *
 */

  public BillExternalIdObjectDataList getOutput() {
    return BillExternalIdObjectHelper.fromMapList(outputMap, "BillExternalIdList");
  }
}
