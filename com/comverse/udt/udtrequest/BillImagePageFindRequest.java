/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImagePageFindRequest.java
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
 * Class used to create a BillImagePageFindRequest Udt Request
 *
 */

public class BillImagePageFindRequest extends BillImagePageRequest {
/**
 *
 * Constructor to create a  BillImagePageFindRequest
 * @param id Unique request name
 * @param BillImagePageFindIn BillImagePageObjectFilter for BillImagePageFindRequest
 * @param account_active_date Date for BillImagePageFindRequest
 *
 */
@JsonCreator
  public BillImagePageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillImagePage")BillImagePageObjectFilter BillImagePageFindIn, @JsonProperty("AccountActiveDate")Date account_active_date) {
    super(id, "BillImagePageFind");
    if (BillImagePageFindIn != null) {
      Integer index =  BillImagePageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillImagePage", BillImagePageObjectHelper.toMap(BillImagePageFindIn, new HashMap(), "BillImagePage").get("BillImagePage"));
    }
    if (account_active_date != null) {
      addInput("AccountActiveDate", account_active_date);
    }
  }

/**
 *
 * Retrieves the BillImagePageObjectDataList that results from the BillImagePageFindRequest call
 * @return BillImagePageObjectDataList resulting from udt call
 *
 */

  public BillImagePageObjectDataList getOutput() {
    return BillImagePageObjectHelper.fromMapList(outputMap, "BillImagePageList");
  }
}
