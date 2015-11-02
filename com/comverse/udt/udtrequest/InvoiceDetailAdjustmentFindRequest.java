/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailAdjustmentFindRequest.java
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
 * Class used to create a InvoiceDetailAdjustmentFindRequest Udt Request
 *
 */

public class InvoiceDetailAdjustmentFindRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a  InvoiceDetailAdjustmentFindRequest
 * @param id Unique request name
 * @param InvoiceDetailAdjfindIn InvoiceDetailObjectFilter for InvoiceDetailAdjustmentFindRequest
 *
 */
@JsonCreator
  public InvoiceDetailAdjustmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailObjectFilter InvoiceDetailAdjfindIn) {
    super(id, "InvoiceDetailAdjustmentFind");
    if (InvoiceDetailAdjfindIn != null) {
      Integer index =  InvoiceDetailAdjfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailAdjfindIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }

/**
 *
 * Retrieves the InvoiceDetailObjectDataList that results from the InvoiceDetailAdjustmentFindRequest call
 * @return InvoiceDetailObjectDataList resulting from udt call
 *
 */

  public InvoiceDetailObjectDataList getOutput() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
}
