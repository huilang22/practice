/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailFindRequest.java
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
 * Class used to create a InvoiceDetailFindRequest Udt Request
 *
 */

public class InvoiceDetailFindRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a  InvoiceDetailFindRequest
 * @param id Unique request name
 * @param InvoiceDetailfindIn InvoiceDetailObjectFilter for InvoiceDetailFindRequest
 *
 */
@JsonCreator
  public InvoiceDetailFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailObjectFilter InvoiceDetailfindIn) {
    super(id, "InvoiceDetailFind");
    if (InvoiceDetailfindIn != null) {
      Integer index =  InvoiceDetailfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailfindIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }

/**
 *
 * Retrieves the InvoiceDetailObjectDataList that results from the InvoiceDetailFindRequest call
 * @return InvoiceDetailObjectDataList resulting from udt call
 *
 */

  public InvoiceDetailObjectDataList getOutput() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
}
