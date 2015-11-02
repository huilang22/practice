/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailByAccountFindRequest.java
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
 * Class used to create a InvoiceDetailByAccountFindRequest Udt Request
 *
 */

public class InvoiceDetailByAccountFindRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a  InvoiceDetailByAccountFindRequest
 * @param id Unique request name
 * @param InvoiceDetailAccountfindIn InvoiceDetailAccountObjectFilter for InvoiceDetailByAccountFindRequest
 * @param LatestInvoice Boolean for InvoiceDetailByAccountFindRequest
 *
 */
@JsonCreator
  public InvoiceDetailByAccountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice) {
    super(id, "InvoiceDetailByAccountFind");
    if (InvoiceDetailAccountfindIn != null) {
      Integer index =  InvoiceDetailAccountfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailAccountObjectHelper.toMap(InvoiceDetailAccountfindIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
    if (LatestInvoice != null) {
      addInput("LatestInvoice", LatestInvoice);
    }
  }

/**
 *
 * Retrieves the InvoiceDetailObjectDataList that results from the InvoiceDetailByAccountFindRequest call
 * @return InvoiceDetailObjectDataList resulting from udt call
 *
 */

  public InvoiceDetailObjectDataList getOutput() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
}
