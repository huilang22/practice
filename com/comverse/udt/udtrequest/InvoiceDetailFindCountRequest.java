/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailFindCountRequest.java
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
 * Class used to create a InvoiceDetailFindCountRequest Udt Request
 *
 */

public class InvoiceDetailFindCountRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a  InvoiceDetailFindCountRequest
 * @param id Unique request name
 * @param InvoiceDetailfindCountIn InvoiceDetailObjectFilter for InvoiceDetailFindCountRequest
 *
 */
@JsonCreator
  public InvoiceDetailFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailObjectFilter InvoiceDetailfindCountIn) {
    super(id, "InvoiceDetailFindCount");
    if (InvoiceDetailfindCountIn != null) {
      Integer index =  InvoiceDetailfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the InvoiceDetailFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
