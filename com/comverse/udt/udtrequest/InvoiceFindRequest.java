/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceFindRequest.java
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
 * Class used to create a InvoiceFindRequest Udt Request
 *
 */

public class InvoiceFindRequest extends InvoiceRequest {
/**
 *
 * Constructor to create a  InvoiceFindRequest
 * @param id Unique request name
 * @param InvoicefindIn InvoiceObjectFilter for InvoiceFindRequest
 *
 */
@JsonCreator
  public InvoiceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectFilter InvoicefindIn) {
    super(id, "InvoiceFind");
    if (InvoicefindIn != null) {
      Integer index =  InvoicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoicefindIn, new HashMap(), "Invoice").get("Invoice"));
    }
  }

/**
 *
 * Retrieves the InvoiceObjectDataList that results from the InvoiceFindRequest call
 * @return InvoiceObjectDataList resulting from udt call
 *
 */

  public InvoiceObjectDataList getOutput() {
    return InvoiceObjectHelper.fromMapList(outputMap, "InvoiceList");
  }
}
