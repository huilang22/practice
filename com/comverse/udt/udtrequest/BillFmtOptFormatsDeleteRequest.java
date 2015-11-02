/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsDeleteRequest.java
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
 * Class used to create a BillFmtOptFormatsDeleteRequest Udt Request
 *
 */

public class BillFmtOptFormatsDeleteRequest extends BillFmtOptFormatsSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptFormatsDeleteRequest
 * @param id Unique request name
 * @param BillFmtOptFormatsDeleteIn BillFmtOptFormatsObjectData for BillFmtOptFormatsDeleteRequest
 *
 */
@JsonCreator
  public BillFmtOptFormatsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOptFormats")BillFmtOptFormatsObjectData BillFmtOptFormatsDeleteIn) {
    super(id, "BillFmtOptFormatsDelete");
    if (BillFmtOptFormatsDeleteIn != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsDeleteIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }

/**
 *
 * Retrieves the BillFmtOptFormatsObjectData that results from the BillFmtOptFormatsDeleteRequest call
 * @return BillFmtOptFormatsObjectData resulting from udt call
 *
 */

  public BillFmtOptFormatsObjectData getOutput() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
}
