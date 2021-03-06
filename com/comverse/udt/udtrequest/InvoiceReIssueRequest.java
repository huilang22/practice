/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReIssueRequest.java
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
 * Class used to create a InvoiceReIssueRequest Udt Request
 *
 */

public class InvoiceReIssueRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceReIssueRequest
 * @param id Unique request name
 * @param InvoiceReissueIn InvoiceObjectKeyData for InvoiceReIssueRequest
 * @param bill_disp_meth Integer for InvoiceReIssueRequest
 *
 */
@JsonCreator
  public InvoiceReIssueRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData InvoiceReissueIn, @JsonProperty("BillDispMeth")Integer bill_disp_meth) {
    super(id, "InvoiceReIssue");
    if (InvoiceReissueIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceReissueIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
    if (bill_disp_meth != null) {
      addInput("BillDispMeth", bill_disp_meth);
    }
  }

/**
 *
 * Retrieves the InvoiceObjectData that results from the InvoiceReIssueRequest call
 * @return InvoiceObjectData resulting from udt call
 *
 */

  public InvoiceObjectData getOutput() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
}
