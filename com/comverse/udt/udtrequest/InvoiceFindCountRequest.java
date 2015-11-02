/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceFindCountRequest.java
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
 * Class used to create a InvoiceFindCountRequest Udt Request
 *
 */

public class InvoiceFindCountRequest extends InvoiceRequest {
/**
 *
 * Constructor to create a  InvoiceFindCountRequest
 * @param id Unique request name
 * @param InvoicefindCountIn InvoiceObjectFilter for InvoiceFindCountRequest
 *
 */
@JsonCreator
  public InvoiceFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectFilter InvoicefindCountIn) {
    super(id, "InvoiceFindCount");
    if (InvoicefindCountIn != null) {
      Integer index =  InvoicefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoicefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the InvoiceFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
