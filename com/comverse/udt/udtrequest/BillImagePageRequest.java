/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImagePageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillImagePage related UdtRequests
 *
 */

public abstract class BillImagePageRequest extends UdtRequest {

/**
 *
 * Adds a  BillImageSubRequestParent as an InputRequest
 * @param inputRequest BillImageSubRequestParent to add as InputRequest
 *
 */
    public void addBillImageBillImagePageInputRequest(BillImageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BillImage_BillImagePage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceBillImagePageInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_BillImagePage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for BillImagePageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillImagePageRequest(String id, String method) {
    super(id, "BillImagePage", method);
  }
}
