/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImageFindRequest.java
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
 * Class used to create a BillImageFindRequest Udt Request
 *
 */

public class BillImageFindRequest extends BillImageRequest {
/**
 *
 * Constructor to create a  BillImageFindRequest
 * @param id Unique request name
 * @param bill_imageFindIn BillImageObjectFilter for BillImageFindRequest
 *
 */
@JsonCreator
  public BillImageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillImage")BillImageObjectFilter bill_imageFindIn) {
    super(id, "BillImageFind");
    if (bill_imageFindIn != null) {
      Integer index =  bill_imageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillImage", BillImageObjectHelper.toMap(bill_imageFindIn, new HashMap(), "BillImage").get("BillImage"));
    }
  }

/**
 *
 * Retrieves the BillImageObjectDataList that results from the BillImageFindRequest call
 * @return BillImageObjectDataList resulting from udt call
 *
 */

  public BillImageObjectDataList getOutput() {
    return BillImageObjectHelper.fromMapList(outputMap, "BillImageList");
  }
}
