/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImagePageSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillImagePage related UdtSubRequestParents
 *
 */
public abstract class BillImagePageSubRequestParent extends UdtSubRequestParent {

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
 * Adds SelfRequest based on BillImagePageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillImagePageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillImagePageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillImagePageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillImagePageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillImagePageSubRequestParent(String id, String method) {
    super(id, "BillImagePage", method);
  }
}
