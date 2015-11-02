/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillFmtOptFormatsFindRequest Udt Request
 *
 */

public class BillFmtOptFormatsFindRequest extends BillFmtOptFormatsRequest {
/**
 *
 * Constructor to create a  BillFmtOptFormatsFindRequest
 * @param id Unique request name
 * @param BillFmtOptFormatsFindIn BillFmtOptFormatsObjectFilter for BillFmtOptFormatsFindRequest
 *
 */
@JsonCreator
  public BillFmtOptFormatsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOptFormats")BillFmtOptFormatsObjectFilter BillFmtOptFormatsFindIn) {
    super(id, "BillFmtOptFormatsFind");
    if (BillFmtOptFormatsFindIn != null) {
      Integer index =  BillFmtOptFormatsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsFindIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }

/**
 *
 * Retrieves the BillFmtOptFormatsObjectDataList that results from the BillFmtOptFormatsFindRequest call
 * @return BillFmtOptFormatsObjectDataList resulting from udt call
 *
 */

  public BillFmtOptFormatsObjectDataList getOutput() {
    return BillFmtOptFormatsObjectHelper.fromMapList(outputMap, "BillFmtOptFormatsList");
  }
}
