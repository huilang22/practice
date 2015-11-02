/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReissueFindRequest.java
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
 * Class used to create a InvoiceReissueFindRequest Udt Request
 *
 */

public class InvoiceReissueFindRequest extends InvoiceRequest {
/**
 *
 * Constructor to create a  InvoiceReissueFindRequest
 * @param id Unique request name
 * @param InvoiceRfindIn InvoiceObjectFilter for InvoiceReissueFindRequest
 *
 */
@JsonCreator
  public InvoiceReissueFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectFilter InvoiceRfindIn) {
    super(id, "InvoiceReissueFind");
    if (InvoiceRfindIn != null) {
      Integer index =  InvoiceRfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoiceRfindIn, new HashMap(), "Invoice").get("Invoice"));
    }
  }

/**
 *
 * Retrieves the InvoiceObjectDataList that results from the InvoiceReissueFindRequest call
 * @return InvoiceObjectDataList resulting from udt call
 *
 */

  public InvoiceObjectDataList getOutput() {
    return InvoiceObjectHelper.fromMapList(outputMap, "InvoiceList");
  }
}
