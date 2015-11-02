/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailByAccountFindCountRequest.java
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
 * Class used to create a InvoiceDetailByAccountFindCountRequest Udt Request
 *
 */

public class InvoiceDetailByAccountFindCountRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a  InvoiceDetailByAccountFindCountRequest
 * @param id Unique request name
 * @param InvoiceDetailAccountfindCountIn InvoiceDetailAccountObjectFilter for InvoiceDetailByAccountFindCountRequest
 * @param LatestInvoice1 Boolean for InvoiceDetailByAccountFindCountRequest
 *
 */
@JsonCreator
  public InvoiceDetailByAccountFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice1) {
    super(id, "InvoiceDetailByAccountFindCount");
    if (InvoiceDetailAccountfindCountIn != null) {
      Integer index =  InvoiceDetailAccountfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailAccountObjectHelper.toMap(InvoiceDetailAccountfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice1 != null) {
      addInput("LatestInvoice", LatestInvoice1);
    }
  }

/**
 *
 * Retrieves the Integer that results from the InvoiceDetailByAccountFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
